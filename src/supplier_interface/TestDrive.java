package supplier_interface;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class TestDrive {

    public static void main(String[] args) {
       Integer i=  Integer.sum(1,2);

        System.out.println(i);

        /*BinaryOperator<Integer> op = BinaryOperator.maxBy((a,b))*/

        Supplier<Integer> shorter = () -> LongNameMethod.LongNameMethod_Type_Int_Return_Int();
        shorter.get();

    }
}
