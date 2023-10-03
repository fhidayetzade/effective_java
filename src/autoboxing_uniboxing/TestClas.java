package autoboxing_uniboxing;

public class TestClas {
    void probe(int... x) {
        System.out.println("In ...");
    }

    void probe(Integer x) {
        System.out.println("In Integer");
    }

    void probe(long x) {
        System.out.println("In long");
    }

    void probe(Long x) {
        System.out.println("In LONG");
    }

    public static void main(String[] args) {

        Integer a = 4;
        new TestClas().probe(a);
        int b = 4;
        new TestClas().probe(b);
        // In Integer ... In long ...
    }
}