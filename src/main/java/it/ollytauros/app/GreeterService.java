package com.example.app;

import com.example.app.proto.GreeterGrpc;
import com.example.app.proto.GreeterOuterClass;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {

  @Override
  public void sayHello(final GreeterOuterClass.HelloRequest request,
                       final StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
    final GreeterOuterClass.HelloReply.Builder replyBuilder =
        GreeterOuterClass.HelloReply.newBuilder().setMessage("Hello " + request.getName());
    responseObserver.onNext(replyBuilder.build());
    responseObserver.onCompleted();
  }
}
