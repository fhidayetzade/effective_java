package dont_raw_type;

import java.util.ArrayList;
import java.util.List;

public class Raw_1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Farid");
        list.add(28);
        list.add(true);

        //tipi List teyin etsek, o zaman biz hansi tipden deyer elave edilmesini qabaqcadan bilerik. Yuxarida List teyin etmek dogru deyil.

        String s1= (String) list.get(0);

    }
}
