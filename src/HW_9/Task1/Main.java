package HW_9.Task1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int number = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You are enter invalid type of number. Number must be integer!");
        }finally {
            System.out.println("Restart  program and enter valid number");
            System.exit(0);
        }
        System.out.println(number % 2 == 0 ? "Number is parity" :"Number doesn't parity");

    }
}
