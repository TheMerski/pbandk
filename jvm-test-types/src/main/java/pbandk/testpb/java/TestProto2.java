// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pbandk/testpb/test_proto2.proto

package pbandk.testpb.java;

public final class TestProto2 {
  private TestProto2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageWithRequiredFieldOrBuilder extends
      // @@protoc_insertion_point(interface_extends:testpb.MessageWithRequiredField)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool foo = 1;</code>
     * @return Whether the foo field is set.
     */
    boolean hasFoo();
    /**
     * <code>required bool foo = 1;</code>
     * @return The foo.
     */
    boolean getFoo();
  }
  /**
   * Protobuf type {@code testpb.MessageWithRequiredField}
   */
  public static final class MessageWithRequiredField extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:testpb.MessageWithRequiredField)
      MessageWithRequiredFieldOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MessageWithRequiredField.newBuilder() to construct.
    private MessageWithRequiredField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessageWithRequiredField() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MessageWithRequiredField();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MessageWithRequiredField(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              foo_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pbandk.testpb.java.TestProto2.internal_static_testpb_MessageWithRequiredField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pbandk.testpb.java.TestProto2.internal_static_testpb_MessageWithRequiredField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pbandk.testpb.java.TestProto2.MessageWithRequiredField.class, pbandk.testpb.java.TestProto2.MessageWithRequiredField.Builder.class);
    }

    private int bitField0_;
    public static final int FOO_FIELD_NUMBER = 1;
    private boolean foo_;
    /**
     * <code>required bool foo = 1;</code>
     * @return Whether the foo field is set.
     */
    @java.lang.Override
    public boolean hasFoo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool foo = 1;</code>
     * @return The foo.
     */
    @java.lang.Override
    public boolean getFoo() {
      return foo_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFoo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBool(1, foo_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, foo_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof pbandk.testpb.java.TestProto2.MessageWithRequiredField)) {
        return super.equals(obj);
      }
      pbandk.testpb.java.TestProto2.MessageWithRequiredField other = (pbandk.testpb.java.TestProto2.MessageWithRequiredField) obj;

      if (hasFoo() != other.hasFoo()) return false;
      if (hasFoo()) {
        if (getFoo()
            != other.getFoo()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasFoo()) {
        hash = (37 * hash) + FOO_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getFoo());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField parseFrom(
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
    public static Builder newBuilder(pbandk.testpb.java.TestProto2.MessageWithRequiredField prototype) {
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
     * Protobuf type {@code testpb.MessageWithRequiredField}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:testpb.MessageWithRequiredField)
        pbandk.testpb.java.TestProto2.MessageWithRequiredFieldOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pbandk.testpb.java.TestProto2.internal_static_testpb_MessageWithRequiredField_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pbandk.testpb.java.TestProto2.internal_static_testpb_MessageWithRequiredField_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                pbandk.testpb.java.TestProto2.MessageWithRequiredField.class, pbandk.testpb.java.TestProto2.MessageWithRequiredField.Builder.class);
      }

      // Construct using pbandk.testpb.java.TestProto2.MessageWithRequiredField.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        foo_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pbandk.testpb.java.TestProto2.internal_static_testpb_MessageWithRequiredField_descriptor;
      }

      @java.lang.Override
      public pbandk.testpb.java.TestProto2.MessageWithRequiredField getDefaultInstanceForType() {
        return pbandk.testpb.java.TestProto2.MessageWithRequiredField.getDefaultInstance();
      }

      @java.lang.Override
      public pbandk.testpb.java.TestProto2.MessageWithRequiredField build() {
        pbandk.testpb.java.TestProto2.MessageWithRequiredField result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public pbandk.testpb.java.TestProto2.MessageWithRequiredField buildPartial() {
        pbandk.testpb.java.TestProto2.MessageWithRequiredField result = new pbandk.testpb.java.TestProto2.MessageWithRequiredField(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.foo_ = foo_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
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
        if (other instanceof pbandk.testpb.java.TestProto2.MessageWithRequiredField) {
          return mergeFrom((pbandk.testpb.java.TestProto2.MessageWithRequiredField)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(pbandk.testpb.java.TestProto2.MessageWithRequiredField other) {
        if (other == pbandk.testpb.java.TestProto2.MessageWithRequiredField.getDefaultInstance()) return this;
        if (other.hasFoo()) {
          setFoo(other.getFoo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasFoo()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        pbandk.testpb.java.TestProto2.MessageWithRequiredField parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (pbandk.testpb.java.TestProto2.MessageWithRequiredField) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean foo_ ;
      /**
       * <code>required bool foo = 1;</code>
       * @return Whether the foo field is set.
       */
      @java.lang.Override
      public boolean hasFoo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bool foo = 1;</code>
       * @return The foo.
       */
      @java.lang.Override
      public boolean getFoo() {
        return foo_;
      }
      /**
       * <code>required bool foo = 1;</code>
       * @param value The foo to set.
       * @return This builder for chaining.
       */
      public Builder setFoo(boolean value) {
        bitField0_ |= 0x00000001;
        foo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool foo = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFoo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        foo_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:testpb.MessageWithRequiredField)
    }

    // @@protoc_insertion_point(class_scope:testpb.MessageWithRequiredField)
    private static final pbandk.testpb.java.TestProto2.MessageWithRequiredField DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new pbandk.testpb.java.TestProto2.MessageWithRequiredField();
    }

    public static pbandk.testpb.java.TestProto2.MessageWithRequiredField getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MessageWithRequiredField>
        PARSER = new com.google.protobuf.AbstractParser<MessageWithRequiredField>() {
      @java.lang.Override
      public MessageWithRequiredField parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageWithRequiredField(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MessageWithRequiredField> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MessageWithRequiredField> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public pbandk.testpb.java.TestProto2.MessageWithRequiredField getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_testpb_MessageWithRequiredField_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_testpb_MessageWithRequiredField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037pbandk/testpb/test_proto2.proto\022\006testp" +
      "b\"\'\n\030MessageWithRequiredField\022\013\n\003foo\030\001 \002" +
      "(\010B\024\n\022pbandk.testpb.java"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_testpb_MessageWithRequiredField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_testpb_MessageWithRequiredField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_testpb_MessageWithRequiredField_descriptor,
        new java.lang.String[] { "Foo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}