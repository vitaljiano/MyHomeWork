package JavaCoreBasics.Task_1;

public class Rectangle {
    private int sideA;
    private int sideB;


    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {
        sideA = 20;
        sideB = 30;
    }

    public int rectangleArea() {
        int area = sideA * sideB;
        return area;
    }

    public int rectanglePerymeter() {
        int perymeter = sideA + sideB;
        return perymeter;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
