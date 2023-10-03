package lambda;

public class TestDrive {
    public static void main(String[] args) {


       /* Anonymous class kimi yazmaq*/

        AnonymousInterface a=new AnonymousInterface() {
            @Override
            public int age() {
                System.out.println("Interface implement etmeden, anonmyous yaratmaq olar.");
                return 28;
            }
        };

        /*Lambda function kimi yazmaq*/

        AnonymousInterface a_ = () -> {return 28;};
        System.out.println(a.age());

        SuperClass s=new SuperClass(){
            void method_1(){

            }
        };


    }
}
