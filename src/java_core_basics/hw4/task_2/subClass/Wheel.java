package java_core_basics.hw4.task_2.subClass;

public class Wheel {
    private float radius; // in cm
    private int profil;
    private int width;
    private String winterOrSummer;

    public Wheel(float radius, int profil, int width, String winterOrSummer) {
        this.radius = radius;
        this.profil = profil;
        this.width = width;
        this.winterOrSummer = winterOrSummer;
    }

    public float erasingWheel(int year) { // 1 year wheel be erase on 0.2 cm
        for (int i = 0; i < year; i++) {
            radius = radius - 0.2f;
        }
        return radius;
    }


    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getProfil() {
        return profil;
    }

    public void setProfil(int profil) {
        this.profil = profil;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getWinterOrSummer() {
        return winterOrSummer;
    }

    public void setWinterOrSummer(String winterOrSummer) {
        this.winterOrSummer = winterOrSummer;
    }
}
