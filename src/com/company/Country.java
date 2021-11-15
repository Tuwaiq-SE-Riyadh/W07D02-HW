package com.company;

public class Country {
    //Attributes
    String name;
    String language;
    String population;
    String capital;
    String cities;
    //Constructor
    public Country(String name,String language,String population,String capital, String cities){
        this.name=name;
        this.language=language;
        this.population=population;
        this.capital=capital;
        this.cities=cities;
    }

    //toString method
    public String toString(){
        return name +" "+language+" "+population+" "+capital+" "+cities;
    }
}
