package com.jyf.protobuf;

public class ProtoBufTest {
    public static void main(String[] args) throws Exception {
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("张三").setAge(20).setAddress("shenzhen").build();
        byte[] student2ByteArray = student.toByteArray();
        DataInfo.Student student1 = DataInfo.Student.parseFrom(student2ByteArray);

        System.out.println(student1 == student);
        System.out.println(student1);
        System.out.println(student1.toString());
        /*System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());*/
    }
}
