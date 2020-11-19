package HW_9.Task3;

public class Methods {
    private int a;
    private int b;


    public Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() throws IllegalAccessException, MyException {
        ifAB_1();
        ifAB_2();
        ifAB_3();
        ifAB_4();
        System.out.println(a+b);
    }

    public void minus() throws IllegalAccessException, MyException {
        ifAB_1();
        ifAB_2();
        ifAB_3();
        ifAB_4();
        System.out.println(a-b);
    }

    public void multiplay() throws IllegalAccessException, MyException {
        ifAB_1();
        ifAB_2();
        ifAB_3();
        ifAB_4();
        System.out.println(a*b);
    }
    public void div() throws IllegalAccessException, MyException {
        ifAB_1();
        ifAB_2();
        ifAB_3();
        ifAB_4();
        System.out.println(a/b);
    }
    private void ifAB_1() {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a<0 and b<0");
        }
    }

    private void ifAB_2() {
        if ((a != 0 && b == 0) || (a == 0 && b != 0)) {
            throw new ArithmeticException("(a!=0&&b==0)||(a==0&&b!=0)");
        }
    }

    private void ifAB_3() throws IllegalAccessException {
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("a==0&&b==0");
        }
    }

    private void ifAB_4() throws MyException {
        if (a > 0 && b > 0) {
            throw new MyException("a>0&&b>0");
        }
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
