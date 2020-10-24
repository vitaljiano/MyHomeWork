package JavaCoreBasics.Task_1;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A for Rectangle:");
        int sideA = scanner.nextInt();
        System.out.println("Enter side B for Rectangle:");
        int sideB = scanner.nextInt();

        Rectangle rectangle_1 = new Rectangle(sideA, sideB);
        Rectangle rectangle_2 = new Rectangle();

        System.out.println("Площа прямокутника = " + rectangle_1.rectangleArea());
        System.out.println("Периметр прямокутника = " + rectangle_1.rectanglePerymeter());
        System.out.println("  " );
              System.out.println("Площа прямокутника = " + rectangle_2.rectangleArea());
        System.out.println("Периметр прямокутника = " + rectangle_2.rectanglePerymeter());
    }

}
