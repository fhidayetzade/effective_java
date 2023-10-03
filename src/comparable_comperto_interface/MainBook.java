package comparable_comperto_interface;

import java.util.ArrayList;
import java.util.Collections;

public class MainBook {
    public static void main(String[] args) {
        ArrayList<Book1> bookComparables =new ArrayList<>();
        bookComparables.add(new Book1("Ceza", 600));
        bookComparables.add(new Book1("Sefiller", 530));


        Collections.sort(bookComparables);
        System.out.println("Sehifelerin siralanmasi");
        for (Book1 bookComparable : bookComparables){
            System.out.println(" "+ bookComparable.toString());
        }

        Book2 book2=new Book2();
        System.out.println("Kitabin adina gore siralanma");
        Collections.sort(bookComparables, book2);
        for (Book1 book1: bookComparables){
            System.out.println(" "+book1);
        }

    }
}
