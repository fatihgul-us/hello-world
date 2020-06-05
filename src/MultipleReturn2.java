public class MultipleReturn2 {

    int getStringBuilder(){
      int a=0, b=5, c=10;
        try{

            String[] students = {"Henry", "Paul"};
            System.out.println(students[5]);
        }catch (Exception e){

            System.out.println("about to return: "+a);
            return a;
        }finally {
            a=a+7;
            System.out.println("Return value is now: "+a);
        }
        return c;
    }

    public static void main(String[] args) {
        MultipleReturn2 var = new MultipleReturn2();

        System.out.println("In Main: "+var.getStringBuilder());
    }
}
