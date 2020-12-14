package HW_22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        ReturnInt maxNum = ((num1, num2, num3) -> {
            if (num1 > num2 && num1 > num3) return num1;
            else return Math.max(num2, num3);
        });
        ReturnInt averageValue = ((num1, num2, num3) -> (num1 + num2 + num3) / 3);
        ReturnInt sumValue = ((num1, num2, num3) -> num1 + num2 + num3);

        int capture = (int) (Math.random() * 3);

        // Anonymous class ///////////////////////////////////////////////
        ReturnInt defaultValue1 = new ReturnInt() {                     //
            @Override                                                   //
            public int returnInt(int num1, int num2, int num3) {        //
                List<Integer> list = new ArrayList<>();                 //
                list.add(num1);                                         //
                list.add(num2);                                         //
                list.add(num3);                                         //
                return list.get(capture);                               //
            }                                                           //
        };                                                              //

        //  Lambda Expression   //////////////////////////////////////
        ReturnInt defaultValueLambda = (((num1, num2, num3) -> {    //
            List<Integer> list = new ArrayList<>();                 //
            list.add(num1);                                         //
            list.add(num2);                                         //
            list.add(num3);                                         //
            return list.get(capture);                               //
        }));                                                        //


        System.out.println(maxNum.returnInt(5, 6, 10));
        System.out.println(averageValue.returnInt(5, 6, 15));
        System.out.println(sumValue.returnInt(5, 6, 10));
        System.out.println(defaultValue1.returnInt(5, 6, 10));
        System.out.println(defaultValueLambda.returnInt(5, 6, 10));

    }

}
