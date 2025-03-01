package org.example;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class StreamableProtoFileWriter<H extends com.google.protobuf.GeneratedMessageV3, P extends com.google.protobuf.GeneratedMessageV3>
        implements AutoCloseable {
  
    private final DataOutputStream fi;

    public StreamableProtoFileWriter(String file,H header) throws FileNotFoundException, IOException,IllegalArgumentException {

        if (file == null) {
            throw new IllegalArgumentException("File path cannot be null");
        }
   
        if (header == null) {
            throw new IllegalArgumentException("Header cannot be null");
        }
       
        this.fi = new DataOutputStream(new BufferedOutputStream( new FileOutputStream(file), 64 * 1024));
    
        this.fi.writeInt(StreamableProtoFileParser.MAGIC_BYTE);

        byte[] headerBytes = header.toByteArray();

        this.fi.writeInt(headerBytes.length);
        this.fi.write(headerBytes);

    }

    public int Write(P payload) throws IOException {
        byte[] payloadBytes = payload.toByteArray();
        this.fi.writeInt(payloadBytes.length);
        this.fi.write(payloadBytes);

        return payloadBytes.length;
    }

    public void close() throws Exception {
        fi.flush();
        fi.close();
    }
}
