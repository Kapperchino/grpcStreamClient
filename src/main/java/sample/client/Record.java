package sample.client;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Record<K,V> {
    public K key;
    public V val;
    public String topic;
}
