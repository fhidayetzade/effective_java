package compositon;

public class Kitab {

    private String name;

    public Kitab(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Kitab{" +
                "name='" + name + '\'' +
                '}';
    }
}
