package sample.client;

import io.grpc.stub.StreamObserver;
import io.helidon.microprofile.grpc.core.ClientStreaming;
import io.helidon.microprofile.grpc.core.Grpc;
import io.helidon.microprofile.grpc.core.GrpcMarshaller;

@Grpc
@GrpcMarshaller("jsonb")
public interface PublishService {
    @ClientStreaming
    public StreamObserver<Record<String, String>> publish(StreamObserver<String> response);
}
