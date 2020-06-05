package ReplitOdev2.Soru2;

public class Divide extends Calculator{

   /*
   in the Divide class
       extends the Calculator class
         override the calculating method in the super class
            divide two parameters and return the result
    */
    static int calculating(int a, int b) {
        if(b==0)
            throw new ArithmeticException("Divide by Zero");
        else
            return a/b;
    }
}
