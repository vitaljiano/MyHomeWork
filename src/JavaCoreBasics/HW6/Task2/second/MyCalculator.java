package JavaCoreBasics.HW6.Task2.second;

import JavaCoreBasics.HW6.Task2.first.Numerable;

public class MyCalculator implements Numerable {
    private int a;
    private int b;

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public float toDivide() {
        return ((float) a/b);
    }

    @Override
    public int toMinus() {
        return a-b;
    }

    @Override
    public int toMultiply() {
        return a*b;
    }

    @Override
    public int toPlus() {
        return a+b;
    }


    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
