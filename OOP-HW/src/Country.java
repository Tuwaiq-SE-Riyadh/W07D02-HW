public class Country {
    String name;
    String language;
    int population;
    String capital;
    String cities;

    public Country(String name, String language, int population, String capital, String cities) {
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    public String toString() {
        String output = "Name: " + name;
        output += "\nLanguage: " + language;
        output += "\nPopulation: " + population;
        output += "\nCapital: " + capital;
        output += "\nCities: " + cities;
        return output;
    }
}
