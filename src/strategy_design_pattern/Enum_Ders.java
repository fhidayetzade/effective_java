package strategy_design_pattern;

public enum Enum_Ders {

    AZERBACAN_DILI("Azerbacan dili"),
    MENTIQ("Mentiq"),
    QANUNVERICILIK("Qanunvericilik");

    private String ders;
    Enum_Ders(String ders) {
        this.ders=ders;
    }

    @Override
    public String toString() {
        return
                ders;
    }
}
