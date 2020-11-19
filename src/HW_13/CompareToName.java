package HW_13;

import java.util.Comparator;

public class CompareToName implements Comparator <Commodity>{
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getNameGoods().compareTo(o2.getNameGoods());
    }
}
