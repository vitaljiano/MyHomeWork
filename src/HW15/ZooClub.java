package HW15;

import java.util.*;


public class ZooClub {

    // List<Animal> listAnimal = new ArrayList<>();


    private Map<Person, List<Animal>> mapZooClub = new HashMap<>();

    public void addPersonToClub(Person person) {
        mapZooClub.put(person, new ArrayList<>());
    }

    public void addAnimalToPerson(Person person, Animal animal) {

        mapZooClub.get(person).add(animal);

    }

    public void remoteAnimalFromPerson(Person person, Animal animal) {
        try {
            mapZooClub.get(person).remove(animal);
        } catch (Exception e) {
            System.out.println("This animal not exist");
        }

    }

    public void remotePerson(Person person) {
        try {
            mapZooClub.remove(person);
        } catch (Exception exception) {
            System.out.println("This person not exist in ZooClub");
        }
    }

    public void viewClub() {
        for (Map.Entry<Person, List<Animal>> map : mapZooClub.entrySet()) {
            System.out.println(map.getKey() + " :: " + map.getValue());
        }

    }


}
