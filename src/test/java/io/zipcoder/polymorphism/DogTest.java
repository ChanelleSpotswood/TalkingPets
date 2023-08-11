package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speak() {
        String expected = "roof";
        Dog dog = new Dog();

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
