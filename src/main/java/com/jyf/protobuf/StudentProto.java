// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.jyf.protobuf;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jyf_protobuf_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jyf_protobuf_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jyf_protobuf_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jyf_protobuf_MyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\020com.jyf.protobuf\"\035\n\tMyR" +
      "equest\022\020\n\010username\030\001 \001(\t\"\036\n\nMyResponse\022\020" +
      "\n\010realname\030\002 \001(\t2f\n\016StudentService\022T\n\025Ge" +
      "tRealNameByUsername\022\033.com.jyf.protobuf.M" +
      "yRequest\032\034.com.jyf.protobuf.MyResponse\"\000" +
      "B\"\n\020com.jyf.protobufB\014StudentProtoP\001b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_jyf_protobuf_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jyf_protobuf_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jyf_protobuf_MyRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_com_jyf_protobuf_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_jyf_protobuf_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jyf_protobuf_MyResponse_descriptor,
        new java.lang.String[] { "Realname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
