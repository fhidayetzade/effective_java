package comparable_comperto_interface;

import java.util.Comparator;

public class Book2 implements Comparator<Book1> {

    @Override
    public int compare(Book1 o1, Book1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
