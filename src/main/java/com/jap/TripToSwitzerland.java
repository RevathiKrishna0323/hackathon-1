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
    }

    //The Cities are not given in same case, convert all the cities in uppercase.
    public String convertToUpperCase(String cities) {
        return cities.toUpperCase();
    }
    //Find the city which is 52 kms from Zurich
    public String[] CityAt52Km(String[] cities, int[] distances) {
        String cityAt52Km = " ";
        for (int index = 0; index < distances.length; index++) {
            if (index == 52) ;
            cityAt52Km = cities[index];
        }
        return cityAt52Km();
    }

    //public String[] toUpperCase(String[] cities){
    //if(cities.equals(""))
}
