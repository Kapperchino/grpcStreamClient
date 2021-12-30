package sample.client;

import io.grpc.stub.StreamObserver;

public interface ConsumeService {
    public StreamObserver<Record<String, String>> consume(StreamObserver<String> response);
}
