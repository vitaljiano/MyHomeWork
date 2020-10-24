package JavaCoreBasics.Task_2;

public class Kolo {
    private float radius;
    private float diameter;
    private final static double PI = 3.14;

    public void areaKolo() {
        float area = (float) (PI/4 * (diameter * diameter));
        System.out.println("Площа кола рівна " + area);
    }

    public void lengthKolo() {
        float length = (float) (2 * PI * radius);
        System.out.println("Довжинакола рівна " + length);
    }


    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
