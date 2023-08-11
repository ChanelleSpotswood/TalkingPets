package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void petInheritanceTest() {
        Pet cat = new Cat();
        Assert.assertTrue(cat instanceof Pet);
    }
    @Test
    public void petInheritanceTest2() {
        Pet dog = new Dog();
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void setCatName() {
        Cat c = new Cat();
        c.setName("CoCo");

        String expected = "CoCo";

        String actual = c.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatNameTest() {
        Cat c = new Cat();
        c.setName("CoCo");

        String expected = "CoCo";

        String actual = c.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDogName() {
        Dog d = new Dog();
        d.setName("Cash");

        String expected = "Cash";

        String actual = d.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogNameTest() {
        Dog d = new Dog();
        d.setName("Cash");

        String expected = "Cash";

        String actual = d.getName();

        Assert.assertEquals(expected, actual);
    }
}
