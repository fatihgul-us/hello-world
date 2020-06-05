package Inheritance;

public class Manager extends Employee implements Interviewer, Trainable{
    int teamSize=15;
    void reportProjectStatus(){
       // name = "Ali";
    }
    public void conductInterview() {
        System.out.println("Mng - conductInterview "+a);
    }
    public void attendTraining(String[] trainingSchedule) {
        System.out.println(" Mngr - attendTraining");
    }
}
