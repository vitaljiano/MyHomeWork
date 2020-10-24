package JavaCoreBasics.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Kolo kolo = new Kolo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter diameter:");
        kolo.setDiameter(scanner.nextFloat());
        System.out.println("Enter radius: ");
        kolo.setRadius(scanner.nextFloat());

        kolo.areaKolo();
        kolo.lengthKolo();




    }
}
