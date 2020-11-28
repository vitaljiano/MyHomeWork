package HW_18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyEntry<String, Integer> map = new MyEntry<>();
        map.put("1", 10);
        map.put("1", 10);
        map.put("2", 20);
        map.put("3", 30);
        map.put("4", 40);
        map.put("5", 50);

        map.viewMap();
        map.removeValue(40);
        map.viewSetV();
        map.removeKey("2");
        map.viewSetValue();
        map.viewSetKey();


    }
}
