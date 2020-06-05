package ReplitOdev.Soru2;

//There are two classes one Main other one Employees
//        In the Employees class
//
//Create variables private String name , int salary , String dob  (date of birth )
//        Create a getter and setter
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
public class Employee {
    private String name;
    private int salary;
    private String dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
