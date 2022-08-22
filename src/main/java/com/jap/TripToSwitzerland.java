package com.jap;

import java.util.Arrays;

public class TripToSwitzerland {
    public static void main(String[] args) {
        String[] cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distances = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        // declare and initialise an onject of the class
        TripToSwitzerland trip = new TripToSwitzerland();
        //method calling
        String upperCase = trip.convertToUpperCase(Arrays.toString(cities));
        System.out.println("Converted Upper Case Cities = " + upperCase);
        // calling cityAt52Km
        String result = trip.CityAt52Km(cities);
        System.out.println("City at 52Km = " + result);
        // calling cityGraterThanOeEqualTo270;
        String result2 = trip.CityGraterThanOrEqual270Km(distances, cities);
        System.out.println("City grater than or equal to 270Km = " + result2);
    }

    //The Cities are not given in same case, convert all the cities in uppercase.
    public String convertToUpperCase(String cities) {
        return cities.toUpperCase();
    }

    //Find the city which is 52 kms from Zurich
    public String CityAt52Km(int[] distances, String[] cities) {
        String city52 = " ";
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == 52) ;
            city52 = cities[i];
        }
        return city52;
    }

    public String CityGraterThanOrEqual270Km(int[] distance, String[] cities) {
        String cityFartest = " ";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] >= 270) ;
            cityFartest = cities[i];
        }
        return cityFartest;
    }
}
