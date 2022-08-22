package com.jap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripToSwitzerlandTest {
    TripToSwitzerland tripToSwitzerland;

    @Before
    public void setUp()  {
        tripToSwitzerland = new TripToSwitzerland();
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void stringArray() {
        //arrange
        String city = "Bern";
        //act
        String expectedResult = "Bern";
        String actualResult = tripToSwitzerland.main(new String[]{"Bern"});
        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void intArray() {
        //arrange
        int distance= 138;
        //act
        int expectedResult = 138;
        String actualResult = String.valueOf(138);
        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void convertToUpperCase() {
        //arrange
        String city = "Bern";
        //act
        String expectedResult = "BERN";
        String actualResult = tripToSwitzerland.toUpperCase();
        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}