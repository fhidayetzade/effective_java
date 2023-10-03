package dependency_injection;

public class Luget {

    private String dil;

    public Luget(String dil) {
        this.dil = dil;
    }

    @Override
    public String toString() {
        return "Luget{" +
                "dil='" + dil + '\'' +
                '}';
    }
}
