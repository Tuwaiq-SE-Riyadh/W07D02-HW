package com.company;

public class Country {

    private String name;
    private String language;
    private double population;
    private String capital;
    private int cities;

    public Country(String name, String language, double population, String capital, int cities){
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }
    public String toString(){
        String output = "Country name: "+name+"\n";
        output += "Language: "+language+"\n";
        output += "Population: "+population+"\n";
        output += "Capital: "+capital+"\n";
        output += "Cities: "+cities+"\n";
        return output;
    }
}
