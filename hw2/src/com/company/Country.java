package com.company;

public class Country {
//name, language, population, capital and cities)
    String name;
    String language;
    int population;
    String capital;
    String cities;
    public Country(String name,String language,int population,String capital,String cities){
        this.name=name;
        this.language=language;
        this.population=population;
        this.capital=capital;
        this.cities=cities;
    }


    public String toString(){
        String output="";
        output+="\n name : "+name;
        output+="\n Language : "+language;
        output+="\n population : "+population;
        output+="\n Capital : "+capital;
        output+="\n cities : "+cities;
        return output;
    }
}