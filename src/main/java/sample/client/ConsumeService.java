package sample.client;

import io.grpc.stub.StreamObserver;
import io.helidon.microprofile.grpc.core.Grpc;
import io.helidon.microprofile.grpc.core.GrpcMarshaller;
import io.helidon.microprofile.grpc.core.ServerStreaming;

@Grpc
@GrpcMarshaller("jsonb")
public interface ConsumeService {
    @ServerStreaming
    public void consume(String topic, StreamObserver<Record<String, String>> response);
}
