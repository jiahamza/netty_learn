package com.jyf.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(8899).addService(new StudentServiceImpl()).build();
        System.out.println("server started");
        if (null != server) {
            server.awaitTermination();
        }
    }


}
