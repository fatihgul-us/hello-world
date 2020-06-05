package Inheritance;

public class OfficeWhyCasting {
    public static void main(String[] args) {
        Interviewer[] interviewers = new Interviewer[2];
        Manager man =new Manager();
        Programmer prg = new Programmer();
        interviewers[0] = new Manager();
        interviewers[1] = new HRExecutive();

        for (Interviewer interviewer : interviewers) {
            if (interviewer instanceof Manager) {
                int teamSize = ((Manager) interviewer).teamSize;
                if (teamSize > 10) {
                    interviewer.conductInterview();
                } else {
                    System.out.println("Mgr cant interview with team less then 10");
                }
            }else if(interviewer instanceof HRExecutive){

                interviewer.conductInterview();
            }
        }
    }
}
