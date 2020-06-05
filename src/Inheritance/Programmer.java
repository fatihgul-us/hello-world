package Inheritance;

public class Programmer extends Employee implements Trainable {
    String[] progLang;
    Employee emp = new Employee();
    void writeCode(){}
    void accessBaseClassMemmbers() {
    }
    public void attendTraining(String[] trainingSchedule){
        System.out.println("Prog - AttendTrining");
    }

}
