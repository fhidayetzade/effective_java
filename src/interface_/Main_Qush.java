package interface_;

public class Main_Qush {
    public static void main(String[] args) {
        Uchan_Qush uchanQush=new Qush();
        uchanQush.ucuram(); // ancaq interface`in icerisinde olan metodlari cagira bilir.
      //  uchanQush. fikir versek Qush sinifinde ancaq Uchan_Qush interface`in icerisinde olan metodlari cagirir.
        // Eger Qush icerisinde olan butun metodlari cagirmaq isteyirikse, o zaman Qush q=new Qush(); kimi cagira bilerik.
        // Interface buna gore istifade etmek daha elverishlidir.
    }
}
