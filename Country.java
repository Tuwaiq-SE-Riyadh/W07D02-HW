package com.company;

public class Country {
     String name;
    String language;
    int population;
    String capital;
     String cities;

    public  Country(String n,String l,int p,String c,String cs){
        name= n;
        language=l;
        population=p;
        capital = c;
        cities = cs;

    }
    public void toSrting(){
        System.out.println("name= "+name+" language= "+language+" population= "+population +" capital= "+capital + " cities: "+cities);

    }
}
