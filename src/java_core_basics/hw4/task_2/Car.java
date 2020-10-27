package java_core_basics.hw4.task_2;

import java_core_basics.hw4.task_2.subClass.BodyOfCar;
import java_core_basics.hw4.task_2.subClass.Helm;
import java_core_basics.hw4.task_2.subClass.Wheel;

public class Car {
    private String color;
    private int years;
    private String typeOfFuel;

    Helm helm = new Helm(15,true,true);
    Wheel wheel = new Wheel(16f,55,205,"Summer");
    BodyOfCar bodyOfCar = new BodyOfCar("Sedan",true);

    public Car(String color, int years, String typeOfFuel) {
        this.color = color;
        this.years = years;
        this.typeOfFuel = typeOfFuel;
    }
public void showMeCar(Car car){

    System.out.println("--------------------------------------------------------------------------------------");
    System.out.print("Color  ");System.out.print("Years ");System.out.print(" TypeOfFuel ");System.out.print("TypeOfBody");System.out.print("  HaveHatch  ");System.out.print(" helm.Radius ");System.out.print(" MultiHelm ");System.out.print(" helm.Regulation ");System.out.print(" wheel.Radius ");System.out.print(" wheel.Profil ");System.out.print(" Wheel.Width "); System.out.print(" Season ");
    System.out.println("");

    System.out.print(car.getColor()); System.out.print("    ");
    System.out.print(car.getYears());System.out.print("     ");
    System.out.print(car.getTypeOfFuel());System.out.print("       ");
    System.out.print(car.bodyOfCar.getTypeOfBody());System.out.print("      ");
    System.out.print(car.bodyOfCar.isHaveHatch());System.out.print("           ");
    System.out.print(car.helm.getRadius()); System.out.print("         ");
    System.out.print(car.helm.isMultiHelm());System.out.print("         ");
    System.out.print(car.helm.isRegulation());System.out.print("            ");
    System.out.print(car.wheel.getRadius());System.out.print("           ");
    System.out.print(car.wheel.getProfil());System.out.print("           ");
    System.out.print(car.wheel.getWidth());System.out.print("      ");
    System.out.print(car.wheel.getWinterOrSummer());
    System.out.println("");




}
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
