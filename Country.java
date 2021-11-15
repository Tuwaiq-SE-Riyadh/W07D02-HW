package com.company;

public class Country {
    String name;
    String language;
    int population;
    String capital;
    String[] cities =new String[2];

    public Country(String name, String language, int population, String capital, String[] arr1) {
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }



    public void tostring() {
        System.out.println("Country name: " + name);
        System.out.println("Country language: " + language);
        System.out.println("Country population: " + population);
        System.out.println("Country capital: " + capital);
        System.out.println("Country cities: " + cities);

    }
}
