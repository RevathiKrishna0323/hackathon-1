package com.jap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripToSwitzerlandTest {
    SortingCities sortingCities;

    @Before
    public void setUp()  {
        sortingCities = new SortingCities();
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
        String actualResult = sortingCities.main(new String[]{"Bern"});
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
    public void convertToUpper() {
        //arrange
        String city = "Bern";
        //act
        String expectedResult = "BERN";
        String actualResult = sortingCities.toUpperCase();
        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}