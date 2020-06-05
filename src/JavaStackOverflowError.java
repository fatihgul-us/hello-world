public class JavaStackOverflowError {

    public static void main(String[] args) {

myMethod();
}

    public static void myMethod(){

        myMethod();

    }
}
