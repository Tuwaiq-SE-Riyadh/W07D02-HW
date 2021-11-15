package com.company;

public class Country {
    String name;
    String language;
    double population;
    String capital;
    String[] cities ;

    public Country(String name,String language,double population,String capital,String[] cities){
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }
    public String toString(){
        String output = "Name of the Country is "+ name;
        output += ", it's Language is "+language;
        output+= ", the population is "+population+" million";
        output+=", capital city is "+capital+" and three cities of "+name+" is:\n";
        for (int i = 0; i < cities.length; i++) {
            output+= cities[i]+"\n";
        }
        return output;
    }
}
