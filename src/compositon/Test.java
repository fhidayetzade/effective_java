package compositon;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Kitab k1=new Kitab("C#");
        Kitab k2=new Kitab("Java");

        List<Kitab> kitabList=new ArrayList<>();
        kitabList.add(k1);
        kitabList.add(k2);

        Kitabxana kitabxana=new Kitabxana(kitabList);
        List<Kitab> kitabs=kitabxana.kitabXanadakiButunKitablar();
        for (Kitab kitab: kitabs){
            System.out.println(" "+kitab);
        }
    }
}
