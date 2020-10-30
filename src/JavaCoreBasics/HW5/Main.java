package JavaCoreBasics.HW5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Warrior warrior = new Warrior();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Гравець 1 введи своє імя:");
        String plName1 = scanner.nextLine();
        System.out.println("Гравець 2 введи своє імя:");
        String plName2 = scanner.nextLine();
        System.out.println("Гравець 1 вибери расу введи відповідний номер\n" +
                "  1- Людина \n" +
                "  2 - Гном \n" +
                "  3 - Ельф \n" +
                "  4 - Орг ");
        int selectRasaPl1 = scanner.nextInt();

        switch (selectRasaPl1) {
            case 1:
                Warrior human = new Human(plName1);
                warrior.createPlayers(human);
                break;
            case 2:
                Warrior gnom = new Gnom(plName1);
                warrior.createPlayers(gnom);
                break;
            case 3:
                Warrior elf = new Elf(plName1);
                warrior.createPlayers(elf);
                break;
            case 4:
                Warrior org = new Org(plName1);
                warrior.createPlayers(org);
                break;
        }
        System.out.println("Гравець 2 вибери расу введи відповідний номер\n" +
                "  1- Людина \n" +
                "  2 - Гном \n" +
                "  3 - Ельф \n" +
                "  4 - Орг ");
        int selectRasaPl2 = scanner.nextInt();

        switch (selectRasaPl2) {
            case 1:
                Warrior human = new Human(plName2);
                warrior.createPlayers(human);
                break;
            case 2:
                Warrior gnom = new Gnom(plName2);
                warrior.createPlayers(gnom);
                break;
            case 3:
                Warrior elf = new Elf(plName2);
                warrior.createPlayers(elf);
                break;
            case 4:
                Warrior org = new Org(plName2);
                warrior.createPlayers(org);
                break;
        }


        battle.Fight(warrior.getPlayers());


    }


}
