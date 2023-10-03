package enum_;

public enum Operation_1 {

    PLUS, MINUS, TIMES, DIVIDE;

    public double apply(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                return a / b;
        }
        throw new AssertionError("Not handled operation : " + this);
    }
}
