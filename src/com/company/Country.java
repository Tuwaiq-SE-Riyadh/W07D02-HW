package com.company;

import java.util.Arrays;

public class Country
{
    // (name, language, population, capital and cities)
    String name;
    String language;
    String population;
    String capital;
    String [] cities;

    public Country(String name, String language, String population, String capital, String[] cities)
    {
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
