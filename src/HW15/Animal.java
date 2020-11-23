package HW15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {
    private String animal;
    private String name;

    public Animal(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
Animal animal = (Animal) obj;
        return Objects.equals(this.animal, animal.animal);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{"+animal+" - "+name+"}";
    }
}
