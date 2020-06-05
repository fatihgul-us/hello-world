package Inheritance.Tasks.Task1;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee->>" +
                "\nName: " + name  +
                "\nAge: " + age;
    }
}
