package enum_;

import java.util.function.BiFunction;

public enum Operation_3 {

    PLUS ((a,b) -> a + b),
    MINUS ((a,b) -> a - b),
    TIMES ((a,b) -> a * b),
    DIVIDE ((a,b) -> a / b);

    private final BiFunction<Double,Double,Double> operation ;



     Operation_3(BiFunction<Double, Double, Double> operation) {
        this.operation = operation;
    }

    public Double compute(Double x, Double y) {
        return operation.apply(x,y);
    }
}
