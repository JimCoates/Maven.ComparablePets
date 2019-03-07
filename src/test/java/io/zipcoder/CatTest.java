package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getNameTest() {
        //Given
        String expectedName = "Name of Cat";
        Cat cat = new Cat(expectedName);

        //When
        String acutal = cat.getName();

        //Then
        Assert.assertEquals(expectedName,acutal);


    }

    @Test
    public void speakTest() {
        //Given
        Cat cat = new Cat();
        String expected = "meow";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
