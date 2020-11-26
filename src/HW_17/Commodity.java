package HW_17;

import java.util.ArrayList;
import java.util.Comparator;

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
        Comparator<Commodity> compareToName = new Comparator<Commodity>() {    // Inner class
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getNameGoods().compareTo(o2.getNameGoods());
            }
        };
        listGoods.sort(compareToName);
        for (Commodity o : listGoods) {
            System.out.println(o);
        }
    }

    public static void sortByWidth() {
        Comparator <Commodity> compareToWidth = new Comparator<Commodity>() { // Inner class
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getWidthGoods() - o2.getWidthGoods();
            }
        };

        listGoods.sort(compareToWidth);
        for (Object o : listGoods) {
            System.out.println(o);
        }
    }

    public static void sortByLength() {
       Comparator<Commodity> compareToLength = new Comparator<Commodity>() { // Inner class
           @Override
           public int compare(Commodity o1, Commodity o2) {
               return o1.getLengthGoods() - o2.getLengthGoods();
           }
       } ;
        listGoods.sort(compareToLength);
        for (Object o : listGoods) {
            System.out.println(o);
        }
    }

    public static void sortByWeight() {
        Comparator <Commodity> compareToWeight = new Comparator<Commodity>() { // Inner class
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) o1.getWeightGoods()-o2.getWidthGoods();
            }
        };
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

    public String getNameGoods() {
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
