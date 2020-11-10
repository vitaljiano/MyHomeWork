package HW_10.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 6 words");
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scanner.nextLine();
        }
        int k=0;
        String max = "";
        for (int i = 0; i < strArr.length; i++) {
            if (max.length() < strArr[i].length()) {
                max = strArr[i];
                k=i;
            }
        }
        System.out.println(max + " " + k);
        String min = max;
        for (int i = 0; i < strArr.length; i++) {
            if (min.length() > strArr[i].length()) {
                min = strArr[i];
                k=i;
            }
        }
        System.out.println(min + " " + k);


    }

}
