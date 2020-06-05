package Inheritance.Tasks.Task1;

public class Office {
    public static void main(String[] args) {


        Manager m1 = new Manager("Ali",35);
        Engineer e1 = new Engineer("Mehmet",40);

        m1.department="Engineering";
        e1.experience=15;

        System.out.println(m1);
        System.out.println(e1);
    }

}
