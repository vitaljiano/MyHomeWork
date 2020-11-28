package HW_18;


import java.util.HashMap;
import java.util.Map;


public class MyEntry<K, V> {

    HashMap<K, V> hashMap = new HashMap<>();

    public void put(K key, V value) {
        hashMap.put(key, value);
    }

    public void removeKey(K key) {
        hashMap.remove(key);
    }

    public void removeValue(V value) {
        hashMap.values().remove(value);
    }

    public void viewSetKey() {
        for (K key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public void viewSetV() {
        for (V value : hashMap.values()) {
            System.out.println(value);
        }
    }

    public void viewSetValue() {
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void viewMap() {
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    @Override
    public String toString() {
        return "MyEntry{" +
                "hashMap=" + hashMap +
                '}';
    }
}
