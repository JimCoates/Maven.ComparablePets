package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetTest {
    List<Pet> petList;

    @Before
    public void setUp(){
        this.petList = new ArrayList<Pet>();
        Dog dog1 = new Dog("Fido");
        Dog dog2 = new Dog("Charley");
        Cat cat1 = new Cat("Carly");
        Cat cat2 = new Cat("Clay");
        Parrot parrot1 = new Parrot("Pete");
        Parrot parrot2 = new Parrot("Pedro");

        petList.add(dog1);
        petList.add(dog2);
        petList.add(cat1);
        petList.add(cat2);
        petList.add(parrot1);
        petList.add(parrot2);
    }
    @Test
    public void compareToTest(){
        String alphabeticalExpected = "Carly";

        Collections.sort(petList);

        String actual = petList.get(0).getName();

        Assert.assertEquals(alphabeticalExpected,actual);
    }

    @Test
    public void petComparatorTest(){
        String expected = petList.get(2).getType();

        Collections.sort(petList, Pet.PetTypeComparator);

        String actual = petList.get(0).getType();

        Assert.assertEquals(expected,actual);
    }
}
