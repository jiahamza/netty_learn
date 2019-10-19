package com.jyf.grpc;

import com.jyf.protobuf.MyRequest;
import com.jyf.protobuf.MyResponse;
import com.jyf.protobuf.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {
    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("客户端传来的username" + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("这里是真名").build());
        responseObserver.onCompleted();
    }
}
