package strategy_design_pattern;

public class Filoloq_Strategyasi implements Imtahan_Strategyasi{
    @Override
    public Enum_Ders getBirinci() {
        return Enum_Ders.AZERBACAN_DILI;
    }

    @Override
    public Enum_Ders getIkinci() {
        return Enum_Ders.QANUNVERICILIK;
    }

    @Override
    public Enum_Ders getUcuncu() {
        return Enum_Ders.MENTIQ;
    }


}
