package Inheritance;

public class HRExecutive extends Employee implements Interviewer{
    String specialization="alistirma";
    public void conductInterview(){
        System.out.println("HR Executive - conducting interview");
    }

    @Override
    public String toString() {
        return "HRExecutive{" +
                "specialization='" + specialization + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                '}';
    }
}
