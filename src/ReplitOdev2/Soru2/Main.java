package ReplitOdev2.Soru2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    /*
    in the main class
   create Scanner object
   create two int and assign scanner to these two int variables

call the calculating method in the Sum class
print the result
call the calculating method in the Divide class
print the result
call the calculating method in the Multiply class
print the result
call the calculating method in the Substract class
print the result
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Please enter firts number: ");
        int a = input.nextInt();
        System.out.print("Please Enter second Number: ");
        int b = input.nextInt();

        System.out.println("Result: "+Sum.calculating(a,b));
        System.out.println("Result: "+Divide.calculating(a,b));
        System.out.println("Result: "+Multiply.calculating(a,b));
        System.out.println("Result: "+Substract.calculating(a,b));
    }


}
