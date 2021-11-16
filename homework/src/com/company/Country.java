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
        return"The country name is:\t"+name+"\nthe language is:\t"+language+"\nthe population is:\t"
                +population+"\n the cities number is: "+cities ;
    }


}
