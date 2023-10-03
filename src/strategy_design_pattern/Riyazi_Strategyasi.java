package strategy_design_pattern;

public class Riyazi_Strategyasi implements Imtahan_Strategyasi {
    @Override
    public Enum_Ders getBirinci() {
        return Enum_Ders.MENTIQ;
    }

    @Override
    public Enum_Ders getIkinci() {
        return Enum_Ders.QANUNVERICILIK;
    }

    @Override
    public Enum_Ders getUcuncu() {
        return Enum_Ders.AZERBACAN_DILI;
    }
}
