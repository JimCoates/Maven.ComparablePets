package io.zipcoder;


import java.io.Console;
import java.sql.SQLOutput;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        IOConsole console = new IOConsole(System.in, System.out);
        List<Pet> petList = new ArrayList<Pet>();

        Integer numberPets = console.getIntegerInput("How many pets do you have");

        for (int i = 0; i < numberPets; i++) {
            String petName = console.getStringInput("What is your pet's name?");

            String petType = console.getStringInput("What type of pet is it?");

            if (petType.equals("dog")) {
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            if (petType.equals("cat")) {
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            if (petType.equals("parrot")) {
                Parrot parrot = new Parrot(petName);
                petList.add(parrot);
            }
        }

        for (Pet pet: petList) {
           String petType = pet.getType();
            System.out.println("Your pet's name is "+ pet.getName() + " it is a "+ petType + " it says " + pet.speak());
        }

        Collections.sort(petList);

        System.out.println("\nAlphabetically your pets names are:");
        for (Pet pet: petList) {
            System.out.println(pet.getName());
        }
        System.out.println("\nYour pets by type are:");
        Collections.sort(petList, Pet.PetTypeComparator);
        for (Pet pet: petList) {
            System.out.println(pet.getType()+" -> " + pet.getName());
        };
    }
    }



