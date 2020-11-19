package HW_14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Andrew", 25));
        list.add(new Person("Mykola", 15));
        list.add(new Person("Viktor", 43));
        list.add(new Person("Natasha", 27));
        list.add(new Person("Sergio", 54));
        Set<Person> treset = new TreeSet<>(list);
        Set<Person> heshSet = new HashSet<>(list);
        Set<Person> linkedHeshSet = new LinkedHashSet<>(list);

        for (Object s : treset ) {
            System.out.println(s);
        }
        System.out.println(" ");
        for (Object s : heshSet ) {
            System.out.println(s);
        }
    }

}

