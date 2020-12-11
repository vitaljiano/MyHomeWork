package HW_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static HW_23.Sex.MEN;
import static HW_23.Sex.WOMEN;

public class Main {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("Vasia", 23, MEN));
        peoples.add(new People("Oleksa", 45, MEN));
        peoples.add(new People("Sandra", 20, WOMEN));
        peoples.add(new People("Antonia", 33, WOMEN));
        peoples.add(new People("Roman", 15, MEN));
        peoples.add(new People("Volodia", 40, MEN));
        peoples.add(new People("Viktoria", 18, WOMEN));
        peoples.add(new People("Ivanna", 36, WOMEN));
        peoples.add(new People("Vitalik", 34, MEN));
        peoples.add(new People("Yuriy", 55, MEN));

        peoples.stream()
                .filter((people) -> people.getAge() >= 18 && people.getAge() <= 27 && people.getSex().equals(MEN))
                .forEach(System.out::println);
        System.out.println("------------------------------");
        System.out.println(peoples.stream().filter(people -> people.getSex() == MEN).mapToInt(People::getAge).average().getAsDouble());
        System.out.println("------------------------------");
// Знайти кількість потенційно працездатних людей у
// вибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)

        long contOfWorkerPeople = peoples.stream()
                .filter(people -> people.getAge() > 18).filter(people -> people.getSex() == MEN && people.getAge() < 60
                        || people.getSex() == WOMEN && people.getAge() < 55).count();
        System.out.println(contOfWorkerPeople);

        System.out.println("------------------------------");
        //Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
        System.out.println("------------------------------");
        peoples.stream().sorted((o1, o2) -> -o1.getName().compareTo(o2.getName())).forEach(System.out::println);

        System.out.println("------------------------------");
        //Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
        peoples.stream().sorted().forEach(System.out::println);
        System.out.println("------------------------------");
        peoples.stream().sorted(Comparator.comparingInt(People::getAge)).forEach(System.out::println);
        System.out.println("------------------------------");

        //Знайти найстаршу людину
        System.out.println(peoples.stream().max((p1, p2) -> p1.getAge() - (p2.getAge())).get());
        System.out.println("------------------------------");

        // Знайти наймолодшу людину
        System.out.println(peoples.stream().min((p1, p2) -> p1.getAge() - (p2.getAge())).get());
        System.out.println("------------------------------");

        // Вивести скільки є чоловіків
        peoples.stream().filter(men -> men.getSex() == MEN).forEach(System.out::println);
        System.out.println("------------------------------");

        //Вивести скільки є жінок
        peoples.stream().filter(women -> women.getSex() == WOMEN).forEach(System.out::println);
        System.out.println("------------------------------");

        //Вивеcти всіх жінок в яких ім’я починається на “A”
        peoples.stream().filter(people -> people.getName().startsWith("A")
                && people.getSex() == WOMEN).forEach(System.out::println);


    }
}
