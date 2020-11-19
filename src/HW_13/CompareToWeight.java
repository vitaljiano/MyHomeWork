package HW_13;

import java.util.Comparator;

public class CompareToWeight implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (int)(o1.getWeightGoods()-o2.getWeightGoods());
    }
}
