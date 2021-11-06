package ten;

public class Country {

    private String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
