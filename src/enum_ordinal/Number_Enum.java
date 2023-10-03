package enum_ordinal;

public enum Number_Enum {

    FOUR(4),ONE(1), TWO(2), THREE(3);

    private final int value ;

    Number_Enum(int value) {
        this.value = value;
    }

    public int valueOrdinal() {
        return ordinal() ;
    }

    public int valueStored() {
        return value ;
    }

    public static void main(String[] args) {
        System.out.println(FOUR.ordinal());         // 0
        System.out.println(FOUR.valueStored());     // 4
    }
}
