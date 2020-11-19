package HW_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Commodity {
    private String nameGoods;
    private int widthGoods;
    private int lengthGoods;
    private float weightGoods;

    public static ArrayList<Commodity> listGoods = new ArrayList<>();

    public Commodity(String nameGoods, int widthGoods, int lengthGoods, float weightGoods) {
        this.nameGoods = nameGoods;
        this.widthGoods = widthGoods;
        this.lengthGoods = lengthGoods;
        this.weightGoods = weightGoods;
    }

    public static void addGoods(String nameGoods, int widthGoods, int lengthGoods, float weightGoods) {
        listGoods.add(new Commodity(nameGoods, widthGoods, lengthGoods, weightGoods));
    }

    public static void deleteGoods(int id) {
        listGoods.remove(listGoods.get(id));
    }

    public static void replaceGoods(int position, Commodity goodsIn) {

        listGoods.remove(position);
        listGoods.add(position, goodsIn);
    }

    public static void sortByName() {
        CompareToName compareToName = new CompareToName();
        listGoods.sort(compareToName);
        for (Commodity o : listGoods) {
            System.out.println(o);
        }
    }

    public static void sortByWidth() {
        CompareToWidth compareToWidth = new CompareToWidth();
        listGoods.sort(compareToWidth);
        for (Object o : listGoods) {
            System.out.println(o);
        }
    }

    public static void sortByLength() {
        CompareToLength compareToLength = new CompareToLength();
        listGoods.sort(compareToLength);
        for (Object o : listGoods) {
            System.out.println(o);
        }
    }

    public static void sortByWeight() {
        CompareToWeight compareToWeight = new CompareToWeight();
        listGoods.sort(compareToWeight);
        for (Object o : listGoods) {
            System.out.println(o);
        }
    }

    public static void getElementFromList(int i) {
        System.out.println(listGoods.get(i));
    }

    public static void showList() {
        for (Commodity c : listGoods) {
            System.out.println(c);
        }
    }

    public static void exit() {
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "nameGoods='" + nameGoods + '\'' +
                ", widthGoods=" + widthGoods +
                ", lengthGoods=" + lengthGoods +
                ", weightGoods=" + weightGoods +
                '}';
    }

    public  String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    public int getWidthGoods() {
        return widthGoods;
    }

    public void setWidthGoods(int widthGoods) {
        this.widthGoods = widthGoods;
    }

    public int getLengthGoods() {
        return lengthGoods;
    }

    public void setLengthGoods(int lengthGoods) {
        this.lengthGoods = lengthGoods;
    }

    public float getWeightGoods() {
        return weightGoods;
    }

    public void setWeightGoods(float weightGoods) {
        this.weightGoods = weightGoods;
    }


}
