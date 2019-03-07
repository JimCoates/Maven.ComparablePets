package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void getNameTest() {
        //Given
        String expectedName = "Name of parrot";
        Parrot parrot = new Parrot(expectedName);

        //When
        String acutal = parrot.getName();

        //Then
        Assert.assertEquals(expectedName,acutal);


    }

    @Test
    public void speakTest() {
        //Given
        Parrot parrot = new Parrot();
        String expected = "Hello";

        //When
        String actual = parrot.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
