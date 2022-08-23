package com.jap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TripToSwitzerlandTest {
    TripToSwitzerland tripToSwitzerland;
    String[] cities;
    int[] distances;
    @BeforeEach
    public void setUp() {
        tripToSwitzerland = new TripToSwitzerland();
        cities = new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        distances = new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
    }
    @AfterEach
    public void tearDown() {
    }
    @Test    //write all the test cases here
    public void checkSortedCitiesInAlphabeticalOrderSuccess() {
        String[] expected = {"Basel", "Bern", "Engelberg", "Geneva", "Grindelwald", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        Assertions.assertEquals(expected[0], tripToSwitzerland.toSortCityArray(cities)[0]);
        Assertions.assertEquals(expected[1], tripToSwitzerland.toSortCityArray(cities)[1]);
        Assertions.assertEquals(expected[2], tripToSwitzerland.toSortCityArray(cities)[2]);
    }
    @Test    //write all the test cases here
    public void checkSortedCitiesInAlphabeticalOrderFailure() {
        String[] expected = {"Basel", "Bern", "Engelberg", "Geneva", "Grindelwald", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        Assertions.assertNotEquals(expected[0], tripToSwitzerland.toSortCityArray(cities)[3]);
        Assertions.assertNotEquals(expected[0], tripToSwitzerland.toSortCityArray(cities)[2]);
        Assertions.assertNotEquals(expected[0], tripToSwitzerland.toSortCityArray(cities)[5]);
    }
    @Test
    public void checkSortedDistanceInAscendingOrderSuccess() {
        int[] expected = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        Assertions.assertEquals(expected[0], tripToSwitzerland.toSortDistanceArray(distances)[0]);
        Assertions.assertEquals(expected[1], tripToSwitzerland.toSortDistanceArray(distances)[1]);
        Assertions.assertEquals(expected[2], tripToSwitzerland.toSortDistanceArray(distances)[2]);
    }
    @Test
    public void checkSortedDistanceInAscendingOrderFailure() {
        int[] expected = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        Assertions.assertNotEquals(expected[0], tripToSwitzerland.toSortDistanceArray(distances)[6]);
        Assertions.assertNotEquals(expected[0], tripToSwitzerland.toSortDistanceArray(distances)[1]);
        Assertions.assertNotEquals(expected[0], tripToSwitzerland.toSortDistanceArray(distances)[2]);
    }
   // @Test
   // public void cityNamesConvertedToUpperCaseSuccess() {
     //   Assertions.assertEquals("BERN", tripToSwitzerland.(cities)[0]);
     //   Assertions.assertEquals("LUCERNE", tripToSwitzerland.(cities)[1]);
 //   }
    //@TestL
   // public void cityNamesConvertedToUpperCaseFailure() {
     //   Assertions.assertNotEquals("INTERLAKEN", tripToSwitzerland.(cities)[0]);
     //   Assertions.assertNotEquals("BERN", tripToSwitzerland.(cities)[1]);
      //  Assertions.assertNotEquals("LUCERNE", tripToSwitzerland.(cities)[2]);

    @Test
    public void cityWhichIs52kmsFromZurichSuccess() {
        Assertions.assertEquals("Lucerne", tripToSwitzerland.toFindNearestCity(distances, cities));
    }
    @Test
    public void cityWhichIs52kmsFromZurichFailure() {
        Assertions.assertNotEquals("Basel", tripToSwitzerland.toFindNearestCity(distances, cities));
        Assertions.assertNotEquals("Geneva", tripToSwitzerland.toFindNearestCity(distances, cities));
    }
    @Test
    public void cityWhichIsGreaterThan270kmsFromZurichSuccess() {
        Assertions.assertEquals("Geneva", tripToSwitzerland.toFindFartestCity(distances, cities));
    }
    @Test
    public void cityWhichIsGreaterThan270kmsFromZurichFailure() {
        Assertions.assertNotEquals("Basel", tripToSwitzerland.toFindFartestCity(distances, cities));
        Assertions.assertNotEquals("Lucerne", tripToSwitzerland.toFindFartestCity(distances, cities));
        Assertions.assertNotEquals("INTERLAKEN", tripToSwitzerland.toFindFartestCity(distances, cities));
    }
}