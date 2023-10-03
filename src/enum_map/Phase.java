package enum_map;

public enum Phase {

    // Tutalim bizim bitkilerimiz var ve bunlarin bir yasham dongusu var. Hansisa bitgi 1 il, hansisa bitki 2 il,
    // hansisa bitki daha cox - 10 il yashayir.
    // Bele bir dizayn edilen bir meseleni nece bir algoritma qura bilerik?
    // Misal: bir dene bitki adinda Plant class`imiz var.


        SOLID, LIQUID ;

        enum Transition {
            MELT, FREEZE ;

            private static final Transition[][] TRANSITIONS = {
                    {null,MELT},
                    {FREEZE,null}
            } ;

            public static final Transition from (Phase from, Phase to) {
                return TRANSITIONS[from.ordinal()][to.ordinal()] ;

            }
        }


        public static void main(String[] args) {
            System.out.println(Transition.from(Phase.LIQUID,Phase.SOLID)); // prints FREEZE
            System.out.println(Transition.from(Phase.SOLID,Phase.LIQUID)); // prints MELT
        }

    }
