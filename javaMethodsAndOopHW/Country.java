package javaMethodsAndOopHW;

public class Country {

	String Name = "";
	String Language = "";
	String Population = "";
	String Capital = "";
	String Cities = "";
	
//	constructor
	public Country(String name, String language, String population, String capital, String cities){
		this.Name = name;
		this.Language = language;
		this.Population = population;
		this.Capital = capital;
		this.Cities = cities;
	}
	
	@Override
	public String toString(){
		return "Country: " + this.Name + "\nLanguage: " + this.Language + "\nPopulation: " + this.Population + "\nCapital: " + this.Capital + "\nCities: " + this.Cities;
	}

	
	public static void main(String[] args) {
		Country country = new Country("Saudi Arabia", "Arabic", "34.81 million", "Riyadh", "Jeddah, Qassim, Makkah, Abha");
		Country country2 = new Country("United States", "English", "329.5 million", "Washington D.C", "New York, Los Angeles, Chicago");
		Country country3 = new Country("China", "Chinese", "1.402 billion", "Beijing", "Shanghai, Hong Kong, Wuhan");

		System.out.println(country.toString());
		System.out.println("-----------------------------------------------");
		System.out.println(country2.toString());
		System.out.println("-----------------------------------------------");
		System.out.println(country3.toString());
	}
}
