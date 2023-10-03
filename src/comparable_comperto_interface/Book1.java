package comparable_comperto_interface;

public class Book1 implements Comparable<Book1>{
    private String name;
    private int sheet;

    public Book1(String name, int sheet) {
        this.name = name;
        this.sheet = sheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSheet() {
        return sheet;
    }

    public void setSheet(int sheet) {
        this.sheet = sheet;
    }

    @Override
    public int compareTo(Book1 o) {
       return this.sheet-o.sheet;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", sheet=" + sheet +
                '}';
    }
}
