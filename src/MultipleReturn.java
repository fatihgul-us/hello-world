import java.sql.SQLOutput;

public class MultipleReturn {

    StringBuilder getStringBuilder(){
        StringBuilder ret1 = new StringBuilder("ret1");
        StringBuilder ret2 = new StringBuilder("ret2");
        StringBuilder ret3 = new StringBuilder("ret3");
        try{

            String[] students = {"Henry", "Paul"};
            System.out.println(students[5]);
        }catch (Exception e){

            System.out.println("about to return: "+ret1);
            return ret1;
        }finally {
            ret2.append("10");
            System.out.println("Return value is now: "+ret2);
        }
        return ret3;
    }

    public static void main(String[] args) {
        MultipleReturn var = new MultipleReturn();

        System.out.println("In Main: "+var.getStringBuilder());
    }
}
