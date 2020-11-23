package HW15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Vitalik", 25);
        Person person2 = new Person("Bogdan", 5);
        Person person3 = new Person("Volodia", 64);
        Person person4 = new Person("Zoia", 64);
        Person person5 = new Person("Kolia", 64);

        Animal animal1 = new Animal("Cat" , "Barsik");
        Animal animal2 = new Animal("Dog" , "Barbos");
        Animal animal3 = new Animal("Perrot" , "Vaska");
        Animal animal4 = new Animal("Horse" , "Rudy");
        Animal animal5 = new Animal("Duck" , "Vasylyna");

        ZooClub zooClub = new ZooClub();
        zooClub.addPersonToClub(person1);
        zooClub.addPersonToClub(person2);
        zooClub.addAnimalToPerson(person2,animal1);
        zooClub.addAnimalToPerson(person1,animal1);
        zooClub.addAnimalToPerson(person1,animal2);
        zooClub.addAnimalToPerson(person1,animal3);

        zooClub.remoteAnimalFromPerson(person1,animal2);
        zooClub.addPersonToClub(person3);
        zooClub.addAnimalToPerson(person3,animal3);
        zooClub.addAnimalToPerson(person3,animal3);
        zooClub.addAnimalToPerson(person3,animal4);
        zooClub.addAnimalToPerson(person3,animal5);

        zooClub.addPersonToClub(person4);

        zooClub.addAnimalToPerson(person4,animal2);

        zooClub.addPersonToClub(person5);

        zooClub.viewClub();



    }
}
