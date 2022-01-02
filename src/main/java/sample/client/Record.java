package sample.client;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Record<K, V> {
    public long offset;
    @NonNull
    private K key;
    private V val;
    @NonNull
    private String topic;
}
