package access_modifiers;

public class Protected {
   static final void x(){
        System.out.println("Protected");
    }

    //protected access modifiers - eyni paket ve sub classin instance ile erishmek olur.
    //default ise ancaq - eyni paket icersinde olan deyishen ve methodlara icazesi olur.
   protected  int x=2;

}
