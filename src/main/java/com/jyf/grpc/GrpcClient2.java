package com.jyf.grpc;

import com.jyf.protobuf.MyRequest;
import com.jyf.protobuf.MyResponse;
import com.jyf.protobuf.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class GrpcClient2 {
    private final ManagedChannel channel;
    private final StudentServiceGrpc.StudentServiceBlockingStub blockingStub;

    public GrpcClient2(String host,int port){
        this(ManagedChannelBuilder.forAddress(host,port).usePlaintext(true).build());
    }

    public GrpcClient2(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = StudentServiceGrpc.newBlockingStub(channel);
    }
    public void shutdown() throws Exception{
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    public void get(){
        MyRequest request = MyRequest.newBuilder().setUsername("此为化名").build();
        MyResponse response;
        response = blockingStub.getRealNameByUsername(request);
        System.out.println("返回realname：" + response.getRealname());
    }
    public static void main(String[] args) throws Exception{
        GrpcClient2 client2 = new GrpcClient2("localhost", 8899);
        try {

            client2.get();
        }finally {
            client2.shutdown();
        }
    }
}
