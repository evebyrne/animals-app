package com.myoverstock;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    @org.junit.Test
    public void testApp() {
        Dog dog = new Dog();

        Cat cat = new Cat();
        cat.food = "tuna";

        Wolf wolf = new Wolf();
        wolf.food = "meat";

        String expectedOutputDog = "dog eating peanut butter";
        String expectedOutputCat = "cat eating " + cat.food;
        String expectedOutputWolf = "wolf eating " + wolf.food;

        String actualOutputDog = dog.eat();
        String actualOutputCat = cat.eat();
        String actualOutputWolf = wolf.eat();

        assertEquals(expectedOutputDog, actualOutputDog);
        assertEquals(expectedOutputCat, actualOutputCat);
        assertEquals(expectedOutputWolf, actualOutputWolf);

    }
}
