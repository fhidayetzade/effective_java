package enum_;

public class TestDrive {

    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 0;
    public static final int APPLE_GRANNY_SMITH = 0;
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 0;
    public static final int ORANGE_BLOOD = 0;

    public enum Apple {
        FUJI,
        PIPPIN,
        GRANNY_SMITH
    }
    public enum Orange{
        NAVEL,
        TEMPLE,
        BLOOD
    }
    // enum Singleton`nun inkishaf edilen halidir.

    /* Teyin edilen her bir enum sabitini public static final olaraq, xarici class`lara acilan bir class kimi dusune bilerik.
    *  Enum novleri varis almaq mumkun deyil, kənar class tərəfindən əldə edilə bilən constructor`ları olmadığından, başqa kod tərəfindən
       yaratmaq olmur.
    * */
}
