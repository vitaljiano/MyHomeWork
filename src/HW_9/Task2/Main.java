package HW_9.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a");
            a = scanner.nextInt();
            System.out.println("Enter b");
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You are enter invalid type of number. Number must be integer!");
        } finally {
            System.out.println("Restart  program and enter valid number");
            System.exit(0);
        }
        System.out.println(a + b);
    }
}
