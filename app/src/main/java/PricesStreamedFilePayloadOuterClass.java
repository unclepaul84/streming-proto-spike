// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PricesStreamedFilePayload.proto

// Protobuf Java Version: 3.25.6
public final class PricesStreamedFilePayloadOuterClass {
  private PricesStreamedFilePayloadOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PricesStreamedFilePayloadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PricesStreamedFilePayload)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PriceEntity price = 1;</code>
     * @return Whether the price field is set.
     */
    boolean hasPrice();
    /**
     * <code>.PriceEntity price = 1;</code>
     * @return The price.
     */
    PriceEntityOuterClass.PriceEntity getPrice();
    /**
     * <code>.PriceEntity price = 1;</code>
     */
    PriceEntityOuterClass.PriceEntityOrBuilder getPriceOrBuilder();
  }
  /**
   * Protobuf type {@code PricesStreamedFilePayload}
   */
  public static final class PricesStreamedFilePayload extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PricesStreamedFilePayload)
      PricesStreamedFilePayloadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PricesStreamedFilePayload.newBuilder() to construct.
    private PricesStreamedFilePayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PricesStreamedFilePayload() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PricesStreamedFilePayload();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PricesStreamedFilePayloadOuterClass.internal_static_PricesStreamedFilePayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PricesStreamedFilePayloadOuterClass.internal_static_PricesStreamedFilePayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.class, PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.Builder.class);
    }

    private int bitField0_;
    public static final int PRICE_FIELD_NUMBER = 1;
    private PriceEntityOuterClass.PriceEntity price_;
    /**
     * <code>.PriceEntity price = 1;</code>
     * @return Whether the price field is set.
     */
    @java.lang.Override
    public boolean hasPrice() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.PriceEntity price = 1;</code>
     * @return The price.
     */
    @java.lang.Override
    public PriceEntityOuterClass.PriceEntity getPrice() {
      return price_ == null ? PriceEntityOuterClass.PriceEntity.getDefaultInstance() : price_;
    }
    /**
     * <code>.PriceEntity price = 1;</code>
     */
    @java.lang.Override
    public PriceEntityOuterClass.PriceEntityOrBuilder getPriceOrBuilder() {
      return price_ == null ? PriceEntityOuterClass.PriceEntity.getDefaultInstance() : price_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getPrice());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPrice());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload)) {
        return super.equals(obj);
      }
      PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload other = (PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload) obj;

      if (hasPrice() != other.hasPrice()) return false;
      if (hasPrice()) {
        if (!getPrice()
            .equals(other.getPrice())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPrice()) {
        hash = (37 * hash) + PRICE_FIELD_NUMBER;
        hash = (53 * hash) + getPrice().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PricesStreamedFilePayload}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PricesStreamedFilePayload)
        PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayloadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PricesStreamedFilePayloadOuterClass.internal_static_PricesStreamedFilePayload_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PricesStreamedFilePayloadOuterClass.internal_static_PricesStreamedFilePayload_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.class, PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.Builder.class);
      }

      // Construct using PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPriceFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        price_ = null;
        if (priceBuilder_ != null) {
          priceBuilder_.dispose();
          priceBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PricesStreamedFilePayloadOuterClass.internal_static_PricesStreamedFilePayload_descriptor;
      }

      @java.lang.Override
      public PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload getDefaultInstanceForType() {
        return PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.getDefaultInstance();
      }

      @java.lang.Override
      public PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload build() {
        PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload buildPartial() {
        PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload result = new PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.price_ = priceBuilder_ == null
              ? price_
              : priceBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload) {
          return mergeFrom((PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload other) {
        if (other == PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload.getDefaultInstance()) return this;
        if (other.hasPrice()) {
          mergePrice(other.getPrice());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getPriceFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private PriceEntityOuterClass.PriceEntity price_;
      private com.google.protobuf.SingleFieldBuilderV3<
          PriceEntityOuterClass.PriceEntity, PriceEntityOuterClass.PriceEntity.Builder, PriceEntityOuterClass.PriceEntityOrBuilder> priceBuilder_;
      /**
       * <code>.PriceEntity price = 1;</code>
       * @return Whether the price field is set.
       */
      public boolean hasPrice() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       * @return The price.
       */
      public PriceEntityOuterClass.PriceEntity getPrice() {
        if (priceBuilder_ == null) {
          return price_ == null ? PriceEntityOuterClass.PriceEntity.getDefaultInstance() : price_;
        } else {
          return priceBuilder_.getMessage();
        }
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      public Builder setPrice(PriceEntityOuterClass.PriceEntity value) {
        if (priceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          price_ = value;
        } else {
          priceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      public Builder setPrice(
          PriceEntityOuterClass.PriceEntity.Builder builderForValue) {
        if (priceBuilder_ == null) {
          price_ = builderForValue.build();
        } else {
          priceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      public Builder mergePrice(PriceEntityOuterClass.PriceEntity value) {
        if (priceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            price_ != null &&
            price_ != PriceEntityOuterClass.PriceEntity.getDefaultInstance()) {
            getPriceBuilder().mergeFrom(value);
          } else {
            price_ = value;
          }
        } else {
          priceBuilder_.mergeFrom(value);
        }
        if (price_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      public Builder clearPrice() {
        bitField0_ = (bitField0_ & ~0x00000001);
        price_ = null;
        if (priceBuilder_ != null) {
          priceBuilder_.dispose();
          priceBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      public PriceEntityOuterClass.PriceEntity.Builder getPriceBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPriceFieldBuilder().getBuilder();
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      public PriceEntityOuterClass.PriceEntityOrBuilder getPriceOrBuilder() {
        if (priceBuilder_ != null) {
          return priceBuilder_.getMessageOrBuilder();
        } else {
          return price_ == null ?
              PriceEntityOuterClass.PriceEntity.getDefaultInstance() : price_;
        }
      }
      /**
       * <code>.PriceEntity price = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          PriceEntityOuterClass.PriceEntity, PriceEntityOuterClass.PriceEntity.Builder, PriceEntityOuterClass.PriceEntityOrBuilder> 
          getPriceFieldBuilder() {
        if (priceBuilder_ == null) {
          priceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              PriceEntityOuterClass.PriceEntity, PriceEntityOuterClass.PriceEntity.Builder, PriceEntityOuterClass.PriceEntityOrBuilder>(
                  getPrice(),
                  getParentForChildren(),
                  isClean());
          price_ = null;
        }
        return priceBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PricesStreamedFilePayload)
    }

    // @@protoc_insertion_point(class_scope:PricesStreamedFilePayload)
    private static final PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload();
    }

    public static PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PricesStreamedFilePayload>
        PARSER = new com.google.protobuf.AbstractParser<PricesStreamedFilePayload>() {
      @java.lang.Override
      public PricesStreamedFilePayload parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<PricesStreamedFilePayload> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PricesStreamedFilePayload> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PricesStreamedFilePayloadOuterClass.PricesStreamedFilePayload getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PricesStreamedFilePayload_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PricesStreamedFilePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037PricesStreamedFilePayload.proto\032\021Price" +
      "Entity.proto\"8\n\031PricesStreamedFilePayloa" +
      "d\022\033\n\005price\030\001 \001(\0132\014.PriceEntityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          PriceEntityOuterClass.getDescriptor(),
        });
    internal_static_PricesStreamedFilePayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PricesStreamedFilePayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PricesStreamedFilePayload_descriptor,
        new java.lang.String[] { "Price", });
    PriceEntityOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
