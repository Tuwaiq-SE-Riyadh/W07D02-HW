package com.company;

public class Country {
    String name ;
    String language;
    int population;
    String capital;
    String cities;
    public Country(String name ,
            String language,
            int population,
            String capital,
            String cities) {
       this.name=name;
      this.language=language;
     this.population=population;
      this.capital=capital;
      this.cities=cities;}


    public String toString(){
        return "name : "+name+" ,language: "+language +" ,population: "+population+" ,capital: "+capital+" ,cities: "+cities;
    }



}
