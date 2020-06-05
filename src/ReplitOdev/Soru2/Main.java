package ReplitOdev.Soru2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//        In the Main class.
//
//        Example:
//        Name is Fernando
//        Salary is 80000
//        dob is 11/23/2000
//
//        Note:  Format of the dob is MM/dd/yyyy format never change
//        Note: Create one method which is ageCalculator current year - dob year = employee age
//        In the main method
//        While setting the name use variable String name.
//        Same for salary and dob .
//        If the employee is older then 18 years old
//        Print Welcome to our company Fernando your salary is 80000.
//        If  Fernando younger then 18 years old
//        Print come back when you are 18 years old.
//        If Fernando 18 years old
//        Print we can have inter with you after that you can have a 80000 salary
public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee();
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String dop = scan.nextLine();
        int salary = scan.nextInt();

        e1.setName(name);
        e1.setSalary(salary);
        e1.setDob(dop);

        ageCalculator( e1.getDob(), e1.getName(),e1.getSalary());

    }

    public static void ageCalculator(String dob, String name, int salary){

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
date.getYear();

        Period p = Period.between(birthDate,date);
        if(p.getYears() > 18){
            System.out.println("Welcome to our company "+name+" your salary is "+salary +".");

        }else if(p.getYears()<18)
            System.out.println("come back when you are 18 years old.");
        else if(p.getYears()==18)
            System.out.println("we can have inter with you after that you can have a "+salary+"salary");
    }
}
