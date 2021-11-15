package com.company;

public class Country {
    String name;
    String Language;
    double population;
    String capital;
     int cities;
    public Country(String name,  String Language, String capital,double population, int cities ){
        this.name=name;
        this.Language=Language;
        this.population=population;
        this.cities=cities;

    }


    public String toString() {
        return "Country" +
                "name='" + name + '\'' +
                ", Language='" + Language + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", cities=" + cities ;
    }
}
