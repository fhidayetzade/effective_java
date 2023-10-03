package strategy_design_pattern;

public class Main_Imtahan {

    public static void main(String[] args) {
        Telebe_Strategyasi telebeStrategyasi=new Telebe_Strategyasi(Enum_Bolum.RIYAZI);
        String ilkSiralanma = telebeStrategyasi.getOncelikSiralamasi();
        System.out.println(ilkSiralanma);
    }
}
