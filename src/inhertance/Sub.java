package inhertance;

public class Sub extends Super{
    int i;
    public Sub(int i) {
        this.i=i;
    }

    @Override
  public     void x() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Sub sub = new Sub(10);



    }
}
