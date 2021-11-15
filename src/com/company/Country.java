package com.company;

public class Country {

    String name;
    String  language;
    String capital ;
    String  cities;
    int population;



    public  Country (String name, String  language,String capital , String  cities,  int population){
        this.name=name;
        this.language=language;
        this.capital =capital ;
        this.cities =cities ;
        this.population =population ;
    }
    public String toString1(){
        String output= "name:" +name;
        output+="\n language:" +language;
        output+="\n capital:" +capital;
        output+="\n cities:" +cities;
        output+="\n population:" +population;
        return output;
    }
    public String getName(){

        return name;
    }
    public String getLanguage(){

        return language;
    }
    public String getCapital(){

        return capital;
    }
    public String getCities(){

        return cities;
    }

    public int getPopulation(){

        return population;
    }
}
