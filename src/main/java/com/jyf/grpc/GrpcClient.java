package com.jyf.grpc;

import com.jyf.protobuf.MyRequest;
import com.jyf.protobuf.MyResponse;
import com.jyf.protobuf.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class GrpcClient {
    public static void main(String[] args) throws Exception {
        ManagedChannel managedChannel = null;
        try {
            managedChannel = ManagedChannelBuilder.forAddress("127.0.0.1", 8899).usePlaintext(true).build();
            StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);
            MyResponse response = blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("这是艺名").build());
            System.out.println("真名是" + response.getRealname());
        } finally {
            managedChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }

    }
}
