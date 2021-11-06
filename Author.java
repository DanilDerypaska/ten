package ten;

public class Author {

    private String name;

    private int dataOfBirth;

    private Country country;

    public Author(String name, int dataOfBirth, Country country) {
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", dataOfBirth=" + dataOfBirth +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDataOfBirth() {
        return dataOfBirth;
    }

    public Country getCountry() {
        return country;
    }
}
