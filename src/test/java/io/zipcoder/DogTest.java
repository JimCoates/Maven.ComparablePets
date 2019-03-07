package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void getNameTest() {
        //Given
        String expectedName = "Name of dog";
        Dog dog = new Dog(expectedName);

        //When
        String acutal = dog.getName();

        //Then
        Assert.assertEquals(expectedName,acutal);


    }

    @Test
    public void speakTest() {
        //Given
        Dog dog = new Dog();
        String expected = "bark";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
