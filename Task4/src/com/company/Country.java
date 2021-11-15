package com.company;

public class Country {

    String name ;
    String language ;
    int population ;
    String capital ;
    int space ;

    public  Country (String name , String language , int population , String capital , int space){
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.space = space;
}


    public String toString() {

        String output  = "Country" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", space=" + space  ;
        return output ;
    }

    public String getName(){
        return name;
    }
    public String getLanguage(){
        return language;
    }
    public int getPopulation(){
        return population;
    }
    public String getCapital(){
        return capital;
    }
    public int getSpace(){
        return space;
    }

    }