package HW_16;

public class CustomClass {
    private static int count;
    private String name;
    private int a;
    private int b;

    public CustomClass() {
    }

    public CustomClass(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public CustomClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public CustomClass(String name) {
        this.name = name;
    }
    public void tryTest(int a){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
