package reflection;

public class Worked {

    public String name;
    public String surname;
    public double salary;
    private int worked_no;
    private int worked_level;

    public Worked() {
        System.out.println("Default Constructor");
    }

    public Worked(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Arguments constructors");
    }

    public String getSurname(){
        System.out.println("method getSurname");
        return this.name+" "+this.surname;
    }

    public void changeSalary(int salary){
        this.salary=salary;
    }
}
