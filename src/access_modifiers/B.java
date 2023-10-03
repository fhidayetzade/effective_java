package access_modifiers;

public class B extends Protected{
    String s;

    int x=1;

    protected void s(){
       Protected b1=new B();
        System.out.println(b1.x);
    }
    public static void main(String[] args) {
       // Protected b=new B();
        B b2=new B();
        b2.s();
    }
}
