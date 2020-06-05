package Inheritance.Tasks.Task1;

public class Engineer  extends Employee{
    int experience;

    public Engineer(String name, int age) {
        super(name, age);
    }

//    @Override
//    public String toString() {
//        return "Engineer{" +
//                "experience=" + experience +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
