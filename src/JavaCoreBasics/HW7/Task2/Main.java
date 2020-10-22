package JavaCoreBasics.HW7.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arrInvert = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr[" + i + "] ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your array {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}");
        System.out.print("Your invert array {");
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrInvert[j]=arr[i];
            System.out.print(arrInvert[j] + ", ");
            j++;
        }
        System.out.print("}");
    }

}
