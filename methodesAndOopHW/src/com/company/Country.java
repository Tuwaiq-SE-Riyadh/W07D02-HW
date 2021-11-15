package com.company;

public class Country {

    String name;
    String language;
    String population;
    String capital;
    int cities;
    public Country(String name,String language,String population,String capital,int cities){
        this.name=name;
        this.language=language;
        this.population=population;
        this.capital=capital;
        this.cities=cities;
    }
    public String toString(){
        return"Country name is: "+name+" language is: "+language+" population is: "+population+" cities number is: "+cities ;
    }

}
