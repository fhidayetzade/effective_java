package dont_raw_type;

import java.util.ArrayList;
import java.util.List;

public class Raw {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));

        String s=strings.get(0);

    }

   static  void unsafeAdd(List list, Object o){
        list.add(o);
   }
}
