package HW;

public class Country {

    // Country class
    // Create class named Country should contain:
    // At least five attributes (name, language, population, capital and cities)
    String name;
    String language;
    String population;
    String capital;
    String cities;
    // A constructor

    public Country(String name, String language, String population, String capital, String cities) {
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    // A toString method to display the values of all the attributes of each class

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", population='" + population + '\'' +
                ", capital='" + capital + '\'' +
                ", cities='" + cities + '\'' +
                '}';
    }

    // In the main method create 3 instances of the class and run the toString method.
}
