/*
 * This source file was generated by the Gradle 'init' task
 */

package org.example;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import proto.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

        public static void main(String[] args) throws Exception {

                PricesStreamedFileHeaderOuterClass.PricesStreamedFileHeader header = PricesStreamedFileHeaderOuterClass.PricesStreamedFileHeader
                                .newBuilder()
                                .setSource("Java App")
                                .build();

                var writer = new PricesStreamedFileWriter(
                                "price_entities.bin", header);

                List<Double> prices = new ArrayList<Double>();
                for (int i = 0; i < 10000; i++) {
                        prices.add(100.0 + i);
                }

                long totalBytesWritten = 0;
                var startTime = System.currentTimeMillis();

                for (int i = 0; i < 30000; i++) {

                        var priceEntity = PriceEntityOuterClass.PriceEntity.newBuilder()
                                        .addAllPrices(prices)
                                        .setCurrency("USD")
                                        .build();

                        PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload payload = PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload
                                        .newBuilder()
                                        .setPrice(priceEntity)
                                        .build();
                        var bytesWritten = writer.Write(payload);

                        if (i % 10000 == 0) {

                                long elapsedTime = System.currentTimeMillis() - startTime;
                                double averageBytesPerSecond = (double) totalBytesWritten / (elapsedTime /
                                                1000.0) / (1024.0 * 1024.0);
                                System.out.println("Average MB written per second: " + String.format("%.1f",
                                                averageBytesPerSecond));

                        }

                        if (i % 100000 == 0) {
                                System.out.println("Written " + i + " records");
                        }

                        totalBytesWritten += bytesWritten;
                }

                writer.close();

                // Convert priceEntity to JSON using Google Protobuf library
                // String json = JsonFormat.printer().print(priceEntities.get(0));
    
                int recordCount = 0;

                // Read price entities from the file
                StreamableProtoFileParser<PricesStreamedFileHeaderOuterClass.PricesStreamedFileHeader, PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload> parser = null;
                try {
                        parser = new StreamableProtoFileParser<PricesStreamedFileHeaderOuterClass.PricesStreamedFileHeader, PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload>(
                                        "../python-app/price_entities.bin", t -> {
                                                try {
                                                        return PricesStreamedFileHeaderOuterClass.PricesStreamedFileHeader
                                                                        .parseFrom(t);
                                                } catch (InvalidProtocolBufferException e) {
                                                        // TODO Auto-generated catch block
                                                        e.printStackTrace();
                                                        throw new RuntimeException(e);
                                                }

                                        }, h -> {
                                                try {
                                                        return PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload
                                                                        .parseFrom(h);
                                                } catch (InvalidProtocolBufferException e) {
                                                        // TODO Auto-generated catch block
                                                        e.printStackTrace();
                                                        throw new RuntimeException(e);
                                                }
                                        });
                        var enumerator = parser.GetPayloadEnumerator();
                        PricesStreamedFileHeaderOuterClass.PricesStreamedFileHeader parsedHeader = enumerator
                                        .GetHeader();
                        System.out.println(JsonFormat.printer().print(parsedHeader));
                        while (true) {
                                PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload payload = enumerator
                                                .GetNextPayload();

                                recordCount++;

                                if (recordCount % 100000 == 0) {
                                        System.out.println("Read " + recordCount + " records");
                                }

                                if (payload == null)
                                        break;

                                // System.out.println(JsonFormat.printer().print(payload));
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }
}
