package HW_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fibonachi number: ");
        int number = scanner.nextInt();
        MyThread myThread = new MyThread(number);

        RunnableThread rt = new RunnableThread(number);
        Thread tr1 = new Thread(rt);


        myThread.start();
      //  System.out.println(" ");
        tr1.start();

    }
}
