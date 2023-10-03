package aggregation;

public class Employee {

    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println();
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("Astara","Respublica","Azeri");
        Address address2=new Address("Istanbul","Cumuhr","Turkey");

        Employee e1=new Employee(1,"Farid",address1);
        Employee e2=new Employee(2,"Ramin",address2);
    }
}
