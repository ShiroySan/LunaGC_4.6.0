// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamAvatar.proto

package emu.grasscutter.net.proto;

public final class DungeonCandidateTeamAvatarOuterClass {
  private DungeonCandidateTeamAvatarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamAvatarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamAvatar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarInfo avatar_info = 13;</code>
     * @return Whether the avatarInfo field is set.
     */
    boolean hasAvatarInfo();
    /**
     * <code>.AvatarInfo avatar_info = 13;</code>
     * @return The avatarInfo.
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo();
    /**
     * <code>.AvatarInfo avatar_info = 13;</code>
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder();

    /**
     * <code>uint32 player_uid = 12;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
     * @return Whether the ugcAvatarInfo field is set.
     */
    boolean hasUgcAvatarInfo();
    /**
     * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
     * @return The ugcAvatarInfo.
     */
    emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo getUgcAvatarInfo();
    /**
     * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
     */
    emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfoOrBuilder getUgcAvatarInfoOrBuilder();
  }
  /**
   * <pre>
   * Obf: LEJPPHJPGDD
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamAvatar}
   */
  public static final class DungeonCandidateTeamAvatar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamAvatar)
      DungeonCandidateTeamAvatarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamAvatar.newBuilder() to construct.
    private DungeonCandidateTeamAvatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamAvatar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamAvatar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonCandidateTeamAvatar(
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
            case 96: {

              playerUid_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder subBuilder = null;
              if (avatarInfo_ != null) {
                subBuilder = avatarInfo_.toBuilder();
              }
              avatarInfo_ = input.readMessage(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatarInfo_);
                avatarInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 2082: {
              emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = ugcAvatarInfo_.toBuilder();
              }
              ugcAvatarInfo_ = input.readMessage(emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ugcAvatarInfo_);
                ugcAvatarInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.class, emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.Builder.class);
    }

    private int bitField0_;
    public static final int AVATAR_INFO_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatarInfo_;
    /**
     * <code>.AvatarInfo avatar_info = 13;</code>
     * @return Whether the avatarInfo field is set.
     */
    @java.lang.Override
    public boolean hasAvatarInfo() {
      return avatarInfo_ != null;
    }
    /**
     * <code>.AvatarInfo avatar_info = 13;</code>
     * @return The avatarInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
      return avatarInfo_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
    }
    /**
     * <code>.AvatarInfo avatar_info = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
      return getAvatarInfo();
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 12;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 12;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int UGC_AVATAR_INFO_FIELD_NUMBER = 260;
    private emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo ugcAvatarInfo_;
    /**
     * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
     * @return Whether the ugcAvatarInfo field is set.
     */
    @java.lang.Override
    public boolean hasUgcAvatarInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
     * @return The ugcAvatarInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo getUgcAvatarInfo() {
      return ugcAvatarInfo_ == null ? emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.getDefaultInstance() : ugcAvatarInfo_;
    }
    /**
     * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfoOrBuilder getUgcAvatarInfoOrBuilder() {
      return ugcAvatarInfo_ == null ? emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.getDefaultInstance() : ugcAvatarInfo_;
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
      if (playerUid_ != 0) {
        output.writeUInt32(12, playerUid_);
      }
      if (avatarInfo_ != null) {
        output.writeMessage(13, getAvatarInfo());
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(260, getUgcAvatarInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, playerUid_);
      }
      if (avatarInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getAvatarInfo());
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(260, getUgcAvatarInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar other = (emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar) obj;

      if (hasAvatarInfo() != other.hasAvatarInfo()) return false;
      if (hasAvatarInfo()) {
        if (!getAvatarInfo()
            .equals(other.getAvatarInfo())) return false;
      }
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (hasUgcAvatarInfo() != other.hasUgcAvatarInfo()) return false;
      if (hasUgcAvatarInfo()) {
        if (!getUgcAvatarInfo()
            .equals(other.getUgcAvatarInfo())) return false;
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
      if (hasAvatarInfo()) {
        hash = (37 * hash) + AVATAR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfo().hashCode();
      }
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      if (hasUgcAvatarInfo()) {
        hash = (37 * hash) + UGC_AVATAR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getUgcAvatarInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar prototype) {
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
     * <pre>
     * Obf: LEJPPHJPGDD
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamAvatar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamAvatar)
        emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.class, emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.newBuilder()
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
          getUgcAvatarInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = null;
        } else {
          avatarInfo_ = null;
          avatarInfoBuilder_ = null;
        }
        playerUid_ = 0;

        if (ugcAvatarInfoBuilder_ == null) {
          ugcAvatarInfo_ = null;
        } else {
          ugcAvatarInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar build() {
        emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar buildPartial() {
        emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar result = new emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (avatarInfoBuilder_ == null) {
          result.avatarInfo_ = avatarInfo_;
        } else {
          result.avatarInfo_ = avatarInfoBuilder_.build();
        }
        result.playerUid_ = playerUid_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (ugcAvatarInfoBuilder_ == null) {
            result.ugcAvatarInfo_ = ugcAvatarInfo_;
          } else {
            result.ugcAvatarInfo_ = ugcAvatarInfoBuilder_.build();
          }
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
        if (other instanceof emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar other) {
        if (other == emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.getDefaultInstance()) return this;
        if (other.hasAvatarInfo()) {
          mergeAvatarInfo(other.getAvatarInfo());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.hasUgcAvatarInfo()) {
          mergeUgcAvatarInfo(other.getUgcAvatarInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatarInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarInfoBuilder_;
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       * @return Whether the avatarInfo field is set.
       */
      public boolean hasAvatarInfo() {
        return avatarInfoBuilder_ != null || avatarInfo_ != null;
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       * @return The avatarInfo.
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
        if (avatarInfoBuilder_ == null) {
          return avatarInfo_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
        } else {
          return avatarInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      public Builder setAvatarInfo(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatarInfo_ = value;
          onChanged();
        } else {
          avatarInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      public Builder setAvatarInfo(
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = builderForValue.build();
          onChanged();
        } else {
          avatarInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      public Builder mergeAvatarInfo(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarInfoBuilder_ == null) {
          if (avatarInfo_ != null) {
            avatarInfo_ =
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.newBuilder(avatarInfo_).mergeFrom(value).buildPartial();
          } else {
            avatarInfo_ = value;
          }
          onChanged();
        } else {
          avatarInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      public Builder clearAvatarInfo() {
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = null;
          onChanged();
        } else {
          avatarInfo_ = null;
          avatarInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder getAvatarInfoBuilder() {
        
        onChanged();
        return getAvatarInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
        if (avatarInfoBuilder_ != null) {
          return avatarInfoBuilder_.getMessageOrBuilder();
        } else {
          return avatarInfo_ == null ?
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
        }
      }
      /**
       * <code>.AvatarInfo avatar_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> 
          getAvatarInfoFieldBuilder() {
        if (avatarInfoBuilder_ == null) {
          avatarInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder>(
                  getAvatarInfo(),
                  getParentForChildren(),
                  isClean());
          avatarInfo_ = null;
        }
        return avatarInfoBuilder_;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 12;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 12;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo ugcAvatarInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo, emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.Builder, emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfoOrBuilder> ugcAvatarInfoBuilder_;
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       * @return Whether the ugcAvatarInfo field is set.
       */
      public boolean hasUgcAvatarInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       * @return The ugcAvatarInfo.
       */
      public emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo getUgcAvatarInfo() {
        if (ugcAvatarInfoBuilder_ == null) {
          return ugcAvatarInfo_ == null ? emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.getDefaultInstance() : ugcAvatarInfo_;
        } else {
          return ugcAvatarInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      public Builder setUgcAvatarInfo(emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo value) {
        if (ugcAvatarInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ugcAvatarInfo_ = value;
          onChanged();
        } else {
          ugcAvatarInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      public Builder setUgcAvatarInfo(
          emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.Builder builderForValue) {
        if (ugcAvatarInfoBuilder_ == null) {
          ugcAvatarInfo_ = builderForValue.build();
          onChanged();
        } else {
          ugcAvatarInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      public Builder mergeUgcAvatarInfo(emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo value) {
        if (ugcAvatarInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              ugcAvatarInfo_ != null &&
              ugcAvatarInfo_ != emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.getDefaultInstance()) {
            ugcAvatarInfo_ =
              emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.newBuilder(ugcAvatarInfo_).mergeFrom(value).buildPartial();
          } else {
            ugcAvatarInfo_ = value;
          }
          onChanged();
        } else {
          ugcAvatarInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      public Builder clearUgcAvatarInfo() {
        if (ugcAvatarInfoBuilder_ == null) {
          ugcAvatarInfo_ = null;
          onChanged();
        } else {
          ugcAvatarInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      public emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.Builder getUgcAvatarInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getUgcAvatarInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      public emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfoOrBuilder getUgcAvatarInfoOrBuilder() {
        if (ugcAvatarInfoBuilder_ != null) {
          return ugcAvatarInfoBuilder_.getMessageOrBuilder();
        } else {
          return ugcAvatarInfo_ == null ?
              emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.getDefaultInstance() : ugcAvatarInfo_;
        }
      }
      /**
       * <code>optional .UgcAvatarInfo ugc_avatar_info = 260;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo, emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.Builder, emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfoOrBuilder> 
          getUgcAvatarInfoFieldBuilder() {
        if (ugcAvatarInfoBuilder_ == null) {
          ugcAvatarInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo, emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfo.Builder, emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.UgcAvatarInfoOrBuilder>(
                  getUgcAvatarInfo(),
                  getParentForChildren(),
                  isClean());
          ugcAvatarInfo_ = null;
        }
        return ugcAvatarInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamAvatar)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamAvatar)
    private static final emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar();
    }

    public static emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamAvatar>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamAvatar>() {
      @java.lang.Override
      public DungeonCandidateTeamAvatar parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonCandidateTeamAvatar(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonCandidateTeamAvatar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamAvatar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamAvatar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DungeonCandidateTeamAvatar.proto\032\020Avat" +
      "arInfo.proto\032\023UgcAvatarInfo.proto\"\225\001\n\032Du" +
      "ngeonCandidateTeamAvatar\022 \n\013avatar_info\030" +
      "\r \001(\0132\013.AvatarInfo\022\022\n\nplayer_uid\030\014 \001(\r\022-" +
      "\n\017ugc_avatar_info\030\204\002 \001(\0132\016.UgcAvatarInfo" +
      "H\000\210\001\001B\022\n\020_ugc_avatar_infoB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_DungeonCandidateTeamAvatar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamAvatar_descriptor,
        new java.lang.String[] { "AvatarInfo", "PlayerUid", "UgcAvatarInfo", "UgcAvatarInfo", });
    emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.UgcAvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}