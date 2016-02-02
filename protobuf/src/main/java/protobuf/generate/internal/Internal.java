// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_def/internal.proto

package protobuf.generate.internal;

public final class Internal {
  private Internal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Dest}
   */
  public enum Dest
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Client = 1;</code>
     */
    Client(0, 1),
    /**
     * <code>Auth = 2;</code>
     */
    Auth(1, 2),
    /**
     * <code>Logic = 3;</code>
     */
    Logic(2, 3),
    ;

    /**
     * <code>Client = 1;</code>
     */
    public static final int Client_VALUE = 1;
    /**
     * <code>Auth = 2;</code>
     */
    public static final int Auth_VALUE = 2;
    /**
     * <code>Logic = 3;</code>
     */
    public static final int Logic_VALUE = 3;


    public final int getNumber() { return value; }

    public static Dest valueOf(int value) {
      switch (value) {
        case 1: return Client;
        case 2: return Auth;
        case 3: return Logic;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Dest>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Dest>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Dest>() {
            public Dest findValueByNumber(int number) {
              return Dest.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return protobuf.generate.internal.Internal.getDescriptor().getEnumTypes().get(0);
    }

    private static final Dest[] VALUES = values();

    public static Dest valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Dest(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Dest)
  }

  public interface GTranferOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .Dest dest = 1;
    /**
     * <code>required .Dest dest = 1;</code>
     */
    boolean hasDest();
    /**
     * <code>required .Dest dest = 1;</code>
     */
    protobuf.generate.internal.Internal.Dest getDest();

    // required uint64 userId = 2;
    /**
     * <code>required uint64 userId = 2;</code>
     */
    boolean hasUserId();
    /**
     * <code>required uint64 userId = 2;</code>
     */
    long getUserId();

    // required uint64 netId = 3;
    /**
     * <code>required uint64 netId = 3;</code>
     */
    boolean hasNetId();
    /**
     * <code>required uint64 netId = 3;</code>
     */
    long getNetId();

    // required uint32 ptoNum = 4;
    /**
     * <code>required uint32 ptoNum = 4;</code>
     */
    boolean hasPtoNum();
    /**
     * <code>required uint32 ptoNum = 4;</code>
     */
    int getPtoNum();

    // required bytes msg = 5;
    /**
     * <code>required bytes msg = 5;</code>
     */
    boolean hasMsg();
    /**
     * <code>required bytes msg = 5;</code>
     */
    com.google.protobuf.ByteString getMsg();
  }
  /**
   * Protobuf type {@code GTranfer}
   */
  public static final class GTranfer extends
      com.google.protobuf.GeneratedMessage
      implements GTranferOrBuilder {
    // Use GTranfer.newBuilder() to construct.
    private GTranfer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GTranfer(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GTranfer defaultInstance;
    public static GTranfer getDefaultInstance() {
      return defaultInstance;
    }

    public GTranfer getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GTranfer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              protobuf.generate.internal.Internal.Dest value = protobuf.generate.internal.Internal.Dest.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                dest_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              userId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              netId_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              ptoNum_ = input.readUInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              msg_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.generate.internal.Internal.internal_static_GTranfer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.generate.internal.Internal.internal_static_GTranfer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.generate.internal.Internal.GTranfer.class, protobuf.generate.internal.Internal.GTranfer.Builder.class);
    }

    public static com.google.protobuf.Parser<GTranfer> PARSER =
        new com.google.protobuf.AbstractParser<GTranfer>() {
      public GTranfer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GTranfer(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GTranfer> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .Dest dest = 1;
    public static final int DEST_FIELD_NUMBER = 1;
    private protobuf.generate.internal.Internal.Dest dest_;
    /**
     * <code>required .Dest dest = 1;</code>
     */
    public boolean hasDest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .Dest dest = 1;</code>
     */
    public protobuf.generate.internal.Internal.Dest getDest() {
      return dest_;
    }

    // required uint64 userId = 2;
    public static final int USERID_FIELD_NUMBER = 2;
    private long userId_;
    /**
     * <code>required uint64 userId = 2;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 userId = 2;</code>
     */
    public long getUserId() {
      return userId_;
    }

    // required uint64 netId = 3;
    public static final int NETID_FIELD_NUMBER = 3;
    private long netId_;
    /**
     * <code>required uint64 netId = 3;</code>
     */
    public boolean hasNetId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint64 netId = 3;</code>
     */
    public long getNetId() {
      return netId_;
    }

    // required uint32 ptoNum = 4;
    public static final int PTONUM_FIELD_NUMBER = 4;
    private int ptoNum_;
    /**
     * <code>required uint32 ptoNum = 4;</code>
     */
    public boolean hasPtoNum() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required uint32 ptoNum = 4;</code>
     */
    public int getPtoNum() {
      return ptoNum_;
    }

    // required bytes msg = 5;
    public static final int MSG_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString msg_;
    /**
     * <code>required bytes msg = 5;</code>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required bytes msg = 5;</code>
     */
    public com.google.protobuf.ByteString getMsg() {
      return msg_;
    }

    private void initFields() {
      dest_ = protobuf.generate.internal.Internal.Dest.Client;
      userId_ = 0L;
      netId_ = 0L;
      ptoNum_ = 0;
      msg_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasDest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNetId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPtoNum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, dest_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, userId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, netId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, ptoNum_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, msg_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, dest_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, userId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, netId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, ptoNum_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, msg_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protobuf.generate.internal.Internal.GTranfer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.generate.internal.Internal.GTranfer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf.generate.internal.Internal.GTranfer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GTranfer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protobuf.generate.internal.Internal.GTranferOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.generate.internal.Internal.internal_static_GTranfer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.generate.internal.Internal.internal_static_GTranfer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.generate.internal.Internal.GTranfer.class, protobuf.generate.internal.Internal.GTranfer.Builder.class);
      }

      // Construct using protobuf.generate.internal.Internal.GTranfer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        dest_ = protobuf.generate.internal.Internal.Dest.Client;
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        netId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        ptoNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        msg_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.generate.internal.Internal.internal_static_GTranfer_descriptor;
      }

      public protobuf.generate.internal.Internal.GTranfer getDefaultInstanceForType() {
        return protobuf.generate.internal.Internal.GTranfer.getDefaultInstance();
      }

      public protobuf.generate.internal.Internal.GTranfer build() {
        protobuf.generate.internal.Internal.GTranfer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf.generate.internal.Internal.GTranfer buildPartial() {
        protobuf.generate.internal.Internal.GTranfer result = new protobuf.generate.internal.Internal.GTranfer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dest_ = dest_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.netId_ = netId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.ptoNum_ = ptoNum_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.msg_ = msg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.generate.internal.Internal.GTranfer) {
          return mergeFrom((protobuf.generate.internal.Internal.GTranfer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.generate.internal.Internal.GTranfer other) {
        if (other == protobuf.generate.internal.Internal.GTranfer.getDefaultInstance()) return this;
        if (other.hasDest()) {
          setDest(other.getDest());
        }
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        if (other.hasNetId()) {
          setNetId(other.getNetId());
        }
        if (other.hasPtoNum()) {
          setPtoNum(other.getPtoNum());
        }
        if (other.hasMsg()) {
          setMsg(other.getMsg());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDest()) {
          
          return false;
        }
        if (!hasUserId()) {
          
          return false;
        }
        if (!hasNetId()) {
          
          return false;
        }
        if (!hasPtoNum()) {
          
          return false;
        }
        if (!hasMsg()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protobuf.generate.internal.Internal.GTranfer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf.generate.internal.Internal.GTranfer) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .Dest dest = 1;
      private protobuf.generate.internal.Internal.Dest dest_ = protobuf.generate.internal.Internal.Dest.Client;
      /**
       * <code>required .Dest dest = 1;</code>
       */
      public boolean hasDest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .Dest dest = 1;</code>
       */
      public protobuf.generate.internal.Internal.Dest getDest() {
        return dest_;
      }
      /**
       * <code>required .Dest dest = 1;</code>
       */
      public Builder setDest(protobuf.generate.internal.Internal.Dest value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        dest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .Dest dest = 1;</code>
       */
      public Builder clearDest() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dest_ = protobuf.generate.internal.Internal.Dest.Client;
        onChanged();
        return this;
      }

      // required uint64 userId = 2;
      private long userId_ ;
      /**
       * <code>required uint64 userId = 2;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 userId = 2;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>required uint64 userId = 2;</code>
       */
      public Builder setUserId(long value) {
        bitField0_ |= 0x00000002;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 userId = 2;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userId_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 netId = 3;
      private long netId_ ;
      /**
       * <code>required uint64 netId = 3;</code>
       */
      public boolean hasNetId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint64 netId = 3;</code>
       */
      public long getNetId() {
        return netId_;
      }
      /**
       * <code>required uint64 netId = 3;</code>
       */
      public Builder setNetId(long value) {
        bitField0_ |= 0x00000004;
        netId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 netId = 3;</code>
       */
      public Builder clearNetId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        netId_ = 0L;
        onChanged();
        return this;
      }

      // required uint32 ptoNum = 4;
      private int ptoNum_ ;
      /**
       * <code>required uint32 ptoNum = 4;</code>
       */
      public boolean hasPtoNum() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required uint32 ptoNum = 4;</code>
       */
      public int getPtoNum() {
        return ptoNum_;
      }
      /**
       * <code>required uint32 ptoNum = 4;</code>
       */
      public Builder setPtoNum(int value) {
        bitField0_ |= 0x00000008;
        ptoNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 ptoNum = 4;</code>
       */
      public Builder clearPtoNum() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ptoNum_ = 0;
        onChanged();
        return this;
      }

      // required bytes msg = 5;
      private com.google.protobuf.ByteString msg_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes msg = 5;</code>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required bytes msg = 5;</code>
       */
      public com.google.protobuf.ByteString getMsg() {
        return msg_;
      }
      /**
       * <code>required bytes msg = 5;</code>
       */
      public Builder setMsg(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes msg = 5;</code>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000010);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:GTranfer)
    }

    static {
      defaultInstance = new GTranfer(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GTranfer)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_GTranfer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GTranfer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033internal_def/internal.proto\"[\n\010GTranfe" +
      "r\022\023\n\004dest\030\001 \002(\0162\005.Dest\022\016\n\006userId\030\002 \002(\004\022\r" +
      "\n\005netId\030\003 \002(\004\022\016\n\006ptoNum\030\004 \002(\r\022\013\n\003msg\030\005 \002" +
      "(\014*\'\n\004Dest\022\n\n\006Client\020\001\022\010\n\004Auth\020\002\022\t\n\005Logi" +
      "c\020\003B&\n\032protobuf.generate.internalB\010Inter" +
      "nal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_GTranfer_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_GTranfer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_GTranfer_descriptor,
              new java.lang.String[] { "Dest", "UserId", "NetId", "PtoNum", "Msg", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
