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
                    break;
                case "2":
                    Scanner delete = new Scanner(System.in);
                    System.out.println("Введіть номер позиції товару, що потрібно видалити:");
                    Commodity.deleteGoods(delete.nextInt());
                    System.out.println("Товар успішно видалено");
                    System.out.println("Виберіть наступну дію");
                    break;
                case "3":
                    Scanner replace = new Scanner(System.in);
                    System.out.println("Введіть номер позиції обєкта, що потребує заміни");
                    Commodity.replaceGoods(replace.nextInt(), new Commodity("Default", 10,
                            10, 10.0f));
                    System.out.println("Виберіть наступну дію");
                    break;
                case "4":
                    System.out.println("Список відсортовано за назвою");
                    Commodity.sortByName();
                    System.out.println("Виберіть наступну дію");
                    break;
                case "5":
                    System.out.println("Список відсортовано за довжиною");
                    Commodity.sortByLength();
                    System.out.println("Виберіть наступну дію");
                    break;
                case "6":
                    System.out.println("Список відсортовано за шириною");
                    Commodity.sortByWeight();
                    System.out.println("Виберіть наступну дію");
                    break;
                case "7":
                    System.out.println("Список відсортовано за вагою");
                    Commodity.sortByWidth();
                    System.out.println("Виберіть наступну дію");
                    break;
                case "8":
                    Scanner getPosition = new Scanner(System.in);
                    try {
                        System.out.println("Введіть номер позиції товару");
                        Commodity.getElementFromList(getPosition.nextInt());
                        System.out.println("Виберіть наступну дію");
                    } catch (Exception exception) {
                        System.out.println("Ви ввели дані, що не відповідають номеру позиції товару");
                        System.out.println("Виберіть наступну дію");
                    }
                    break;
                case "9":
                    System.out.println("Список Ваших товарів");
                    Commodity.showList();
                    System.out.println("Виберіть наступну дію");
                    break;
                case "0":
                    Commodity.exit();
                    break;
                default:
                    System.out.println("Ви ввели не коректні дані!");

            }
        } while (notExit);
    }


}
