package HW_17;

import java.util.Scanner;

public class Case {
    public static void case1() {
        Scanner goods = new Scanner(System.in);
        System.out.println("Назва товару:");
        String nameG = goods.nextLine();
        System.out.println("Ширина товару: ");
        int width = goods.nextInt();
        System.out.println("Довжина товару:");
        int length = goods.nextInt();
        System.out.println("Вага товару:");
        float weight = goods.nextFloat();
        Commodity.addGoods(nameG, width, length, weight);
        System.out.println("Товар успішно доданий");
        System.out.println("Виберіть наступну дію");
    }

    public static void case2() {
        Scanner delete = new Scanner(System.in);
        System.out.println("Введіть номер позиції товару, що потрібно видалити:");
        Commodity.deleteGoods(delete.nextInt());
        System.out.println("Товар успішно видалено");
        System.out.println("Виберіть наступну дію");
    }

    public static void case3() {
        Scanner replace = new Scanner(System.in);
        System.out.println("Введіть номер позиції обєкта, що потребує заміни");
        Commodity.replaceGoods(replace.nextInt(), new Commodity("Default", 10,
                10, 10.0f));
        System.out.println("Виберіть наступну дію");
    }

    public static void case4() {
        System.out.println("Список відсортовано за назвою");
        Commodity.sortByName();
        System.out.println("Виберіть наступну дію");
    }

    public static void case5() {
        System.out.println("Список відсортовано за довжиною");
        Commodity.sortByLength();
        System.out.println("Виберіть наступну дію");
    }

    public static void case6() {
        System.out.println("Список відсортовано за шириною");
        Commodity.sortByWeight();
        System.out.println("Виберіть наступну дію");
    }

    public static void case7() {
        System.out.println("Список відсортовано за вагою");
        Commodity.sortByWidth();
        System.out.println("Виберіть наступну дію");
    }

    public static void case8() {
        Scanner getPosition = new Scanner(System.in);
        try {
            System.out.println("Введіть номер позиції товару");
            Commodity.getElementFromList(getPosition.nextInt());
            System.out.println("Виберіть наступну дію");
        } catch (Exception exception) {
            System.out.println("Ви ввели дані, що не відповідають номеру позиції товару");
            System.out.println("Виберіть наступну дію");
        }
    }

    public static void case9() {
        System.out.println("Список Ваших товарів");
        Commodity.showList();
        System.out.println("Виберіть наступну дію");
    }

    public static void case0() {
        Commodity.exit();
    }

}
