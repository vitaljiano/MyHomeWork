package HW_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Commodity goods1 = new Commodity("Phone", 12, 20, 0.354f);
        Commodity goods2 = new Commodity("Table", 1200, 85, 18.354f);
        Commodity goods3 = new Commodity("Keyboard", 25, 15, 0.24f);
        Commodity goods4 = new Commodity("Door", 122, 1900, 10.354f);
        Commodity goods5 = new Commodity("Lamp", 35, 65, 4.354f);
        Commodity.listGoods.add(goods1);
        Commodity.listGoods.add(goods2);
        Commodity.listGoods.add(goods3);
        Commodity.listGoods.add(goods4);
        Commodity.listGoods.add(goods5);
        System.out.println("Виберіть дію:" + "\n" +
                "1- Додати товар" + "\n" +
                "2 - Видалити товар" + "\n" +
                "3 - Замінити товар" + "\n" +
                "4- Сортувати заназвою" + "\n" +
                "5 - Сортувати за довжиною" + "\n" +
                "6 - Сортувати за шириною" + "\n" +
                "7 - Сортувати за вагою" + "\n" +
                "8 - Вивести і-тий елемнт" + "\n" +
                "9 - Вивести весь сптсок товарів" + "\n" +
                "0 - Вийти з програми");

        Scanner scanner1 = new Scanner(System.in);
        boolean notExit = true;
        do {

            switch (scanner1.nextLine()) {
                case "1":
                   Case.case1();
                    break;
                case "2":
                    Case.case2();
                    break;
                case "3":
                    Case.case3();
                    break;
                case "4":
                    Case.case4();
                    break;
                case "5":
                    Case.case5();
                    break;
                case "6":
                    Case.case6();
                    break;
                case "7":
                    Case.case7();
                    break;
                case "8":
                    Case.case8();
                    break;
                case "9":
                    Case.case9();
                    break;
                case "0":
                    Case.case0();
                    break;
                default:
                    System.out.println("Ви ввели не коректні дані!");

            }
        } while (notExit);
    }


}
