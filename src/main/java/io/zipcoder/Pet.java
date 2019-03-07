package io.zipcoder;

import java.util.Collections;
import java.util.Comparator;

public class Pet implements Comparable  {
    String name;
    String type;

    @Override
    public int compareTo(Object obj) {
        Pet otherPet = (Pet)obj;
        return this.getName().compareTo(otherPet.getName());
    }

    public String speak() {
        return "Bark";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType(){
        return this.type;
    }

    public static Comparator<Pet> PetTypeComparator = new Comparator<Pet>() {
        @Override
        public int compare(Pet pet1, Pet pet2) {
            return pet1.getType().compareTo(pet2.getType());
        }
    };

}

