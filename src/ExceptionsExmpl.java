public class ExceptionsExmpl {

    public static void main(String[] args) {
        try{  method1();
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void method1(){
      method2(3,0);

    }
    public static int method2(int a, int b){
            int x=0;
    x=a/b;
        return x;
    }
}
