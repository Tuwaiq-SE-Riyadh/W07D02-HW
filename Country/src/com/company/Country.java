package com.company;

public class Country {
    String name;

    String language;
    int population;
    String capital;
    int cities;

    Country(String name, String language, int population, String capital, int cities) {
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    public String toString() {
        String output = "name: " + name;
        output += "language: " + language;
        output += "population: " + population;
        output += "capital: " + capital;
        output += "cities: " + cities;
        return output;
    }
}
