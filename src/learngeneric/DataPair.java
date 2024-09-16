package learngeneric;

public class DataPair<K,V> {
    private K key;
    private V value;
    DataPair(K key, V value){
        this.key = key;
        this.value = value;
    }
    K getKey() {return key;}
    V getValue() {return value;}
}
