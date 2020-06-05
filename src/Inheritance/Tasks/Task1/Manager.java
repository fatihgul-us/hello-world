package Inheritance.Tasks.Task1;

public class Manager extends Employee {

    String department;

    public Manager(String name, int age) {
        super(name, age);
    }

    public String getName(){
        return name; //inherited variable
    }

//
//    @Override
//    public String toString() {
//        return "Manager{" +
//                "department='" + department + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
