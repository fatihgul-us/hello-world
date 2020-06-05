package Inheritance;

public class Employee {
    private String name;
    protected String address;
    public String phoneNumber;
    float experience;
    String getName(){
        return name;
    }
    void printName(){
        System.out.println("name: "+name);
    }
    void printPhone(){
        System.out.println("Phone: "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                '}';
    }
}
