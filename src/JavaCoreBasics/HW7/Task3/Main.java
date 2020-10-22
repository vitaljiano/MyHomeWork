package JavaCoreBasics.HW7.Task3;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][7];
        int a = -2;
        int b = 77;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = (a + (int)( Math.random() * b));
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j]+" ");

            }
        }
    }
}
