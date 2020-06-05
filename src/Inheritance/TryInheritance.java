package Inheritance;

public class TryInheritance {
    public static void main(String[] args) {
        Employee emp1 =new HRExecutive();
        Employee emp2 =new Employee();
        HRExecutive emp3 =new HRExecutive();

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("EMP1 -----------------Employee-HR");
        emp1.phoneNumber="123 2343 234";
        emp1.getName();
        emp1.address = "Suwanee";
        emp1.experience= 10;
        emp1.printName();
        emp1.printPhone();


        System.out.println("Emp2 -----------------Employee-Employee");
        emp2.phoneNumber="345 4231 234";
        emp2.getName();
        emp2.address = "Duluth";
        emp2.experience=5;
        emp2.printName();
        emp2.printPhone();

        System.out.println("Emp3--------------- HR");
        emp3.phoneNumber="675 4535 344";
        emp3.getName();
        emp3.address="Alpharetta";
        emp3.experience=7;
        emp3.printName();
        emp3.printPhone();
        emp3.specialization="Deneme";
        emp3.conductInterview();

    }
}
