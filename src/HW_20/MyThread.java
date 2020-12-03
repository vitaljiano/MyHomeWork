package HW_20;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    private static  int id = 0;
    private final int threadID = id++;
    int n = 0;
    int sec = 1;

    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Usual_Thread " + threadID+": ");
        Thread.yield();

        long[] fibo = new long[n + 1];
        if (n <= 1) {
            for (int i = 0; i <= n; i++) {
                fibo[i] = i;
                System.out.println(fibo[i]);
                try {
                    TimeUnit.SECONDS.sleep(sec);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            fibo[0] = 0;
            fibo[1] = 1;
            System.out.print(fibo[1]+ ", ");
            for (int i = 2; i <= n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
                System.out.print(fibo[i] + ", ");

                try {
                    TimeUnit.SECONDS.sleep(sec);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
