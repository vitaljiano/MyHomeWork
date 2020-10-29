package java_core_basics.hw4.task_2.subClass;

public class Helm {
    private int radius;
    private boolean regulation;
    private boolean multiHelm;

    public Helm(int radius, boolean regulation, boolean multiHelm) {
        this.radius = radius;
        this.regulation = regulation;
        this.multiHelm = multiHelm;
    }
    public int changeRadiusOfHelm(int onNumber){
        radius = radius+onNumber;
        return radius;
    }



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isRegulation() {
        return regulation;
    }

    public void setRegulation(boolean regulation) {
        this.regulation = regulation;
    }

    public boolean isMultiHelm() {
        return multiHelm;
    }

    public void setMultiHelm(boolean multiHelm) {
        this.multiHelm = multiHelm;
    }
}