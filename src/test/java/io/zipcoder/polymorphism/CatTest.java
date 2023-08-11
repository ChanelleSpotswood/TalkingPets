package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest(){
        String expected = "meow";
        Cat cat = new Cat();

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
