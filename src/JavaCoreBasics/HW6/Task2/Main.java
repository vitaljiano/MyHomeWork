package JavaCoreBasics.HW6.Task2;

import JavaCoreBasics.HW6.Task2.second.MyCalculator;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(69,5);

        System.out.println(myCalculator.toDivide());
        System.out.println(myCalculator.toPlus());
        System.out.println(myCalculator.toMinus());
        System.out.println(myCalculator.toMultiply());
    }


}
