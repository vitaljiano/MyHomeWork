package JavaCoreBasics.HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class Battle {




    public void Fight(ArrayList arrayPlayers) {


        Scanner scanner = new Scanner(System.in);
        Warrior player1 = (Warrior) arrayPlayers.get(0);
        Warrior player2 = (Warrior) arrayPlayers.get(1);
        float kickPlayer1 = (player1.getSrong() * player1.getWeapon()) / player1.getIntelect();
        float kickPlayer2 = (player2.getSrong() * player2.getWeapon()) / player2.getIntelect();
        float blockPlayer1 = player1.getArmor() * player1.getArmorItem() / player1.getIntelect();
        float blockPlayer2 = player2.getArmor() * player2.getArmorItem() / player2.getIntelect();
        float damagePlayer1;
        float damagePlayer2;
        if (kickPlayer1 >= blockPlayer2) {
            damagePlayer1 = kickPlayer1 - blockPlayer2 ;
        } else damagePlayer1 = blockPlayer2 - kickPlayer1 ;

        if (kickPlayer2 >= blockPlayer1) {
            damagePlayer2 = kickPlayer2 - blockPlayer1  ;
        } else damagePlayer2 = blockPlayer1 - kickPlayer2 ;


        System.out.println("Воїн 1: " + player1.getRasa() + " " + player1.getName());
        System.out.println("Здоров'я:  " + player1.getHp());
        System.out.println("Сила:  " + player1.getSrong());
        System.out.println("Інтелект:  " + player1.getIntelect());
        System.out.println("Броня:  " + player1.getArmor());
        System.out.println("Зброя:  " + player1.getWeapon());
        System.out.println("Амуніція:  " + player1.getArmorItem());
        System.out.println(" ---------------------------------------------------------------------");
        System.out.println("Воїн 1: " + player2.getRasa() + " " + player2.getName());
        System.out.println("Здоров'я:  " + player2.getHp());
        System.out.println("Сила:  " + player2.getSrong());
        System.out.println("Інтелект:  " + player2.getIntelect());
        System.out.println("Броня:  " + player2.getArmor());
        System.out.println("Зброя:  " + player2.getWeapon());
        System.out.println("Амуніція:  " + player2.getArmorItem());
        System.out.println(" ---------------------------------------------------------------------");
        System.out.println();
        System.out.println("Нехай переможе сильніший! " +
                "\n Розпочни биту - натисни Enter");
        System.out.println(" ---------------------------------------------------------------------");
        System.out.println();


        while ((player1.getHp() > 0) && (player2.getHp() > 0)) {
            damagePlayer1 = (int) (kickPlayer1 + (Math.random() * 40));
            damagePlayer2 = (int) (kickPlayer2 + (Math.random() * 40));
            scanner.nextLine();
            player1.setHp((int) (player1.getHp() - damagePlayer2 ));
            player2.setHp((int) (player2.getHp() - damagePlayer1));
            System.out.println("Воїн " + player1.getName() + " наніс удар на " + damagePlayer1);

            System.out.println("У воїна " + player2.getName() + " зилишилось " + player2.getHp() + " одиниць життя");
            System.out.println("");
            System.out.println("Воїн " + player2.getName() + " наніс удар на " + damagePlayer2);

            System.out.println("У воїна " + player1.getName() + " зилишилось " + player1.getHp() + " одиниць життя");

            System.out.println("<><><><><><><><><><><><><><<><><><><><><><><><><><><><><><><><><<><><<");
            if (player1.getHp()<=0){
                System.out.println("Воїн " + player2.getName() + " переміг");
            } else if (player2.getHp()<=0){
                System.out.println("Воїн " + player1.getName() + " переміг");
            } else  System.out.println("Наступний раунд Тисни Enter");
        }
    }
}
