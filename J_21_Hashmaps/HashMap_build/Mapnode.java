package J_21_Hashmaps.HashMap_build;

public class Mapnode<K,V> {
    K key;
    V value;
    Mapnode<K,V> next;
    public Mapnode(K key, V value){
        this.key = key;
        this.value = value;
    }
}