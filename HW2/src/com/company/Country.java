package com.company;

import java.util.SplittableRandom;

public class Country {

    private String name;
    private String language;
    private String population;
    private int capital;
    private int cities;

    public Country(String name, String language, String population, int capital, int cities){
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    public String toString(){

        return name + " " + language + " " + population + " " + capital + " S" + cities ;
    }
}
