package strategy_design_pattern;

public class Telebe_Strategyasi {

    private Enum_Bolum bolum;
    private Imtahan_Strategyasi imtahanStrategyasi;

    public Telebe_Strategyasi(Enum_Bolum bolum) {
        this.bolum = bolum;

        if(bolum == null){
        throw new NullPointerException("Bolum bosh ola bilmez!");
    }

        switch (bolum){
            case FILOLOQ:
                imtahanStrategyasi = new Filoloq_Strategyasi();
                break;
            case RIYAZI:
                imtahanStrategyasi = new Riyazi_Strategyasi();
                break;

            default:
                break;
        }


    }

    public String getOncelikSiralamasi(){
        System.out.println(bolum +" ucun strateji");

        String siralanma = "Evvel " + imtahanStrategyasi.getBirinci() +" hell et: \n" +
                            "Sonra " +imtahanStrategyasi.getIkinci() +" hell et: \n" +
                "Zaman qalarsa "+imtahanStrategyasi.getUcuncu() + " hell et:";
        return siralanma;

    }
}
