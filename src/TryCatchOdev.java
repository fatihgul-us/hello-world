import java.util.ArrayList;

public class TryCatchOdev {
//    Create a method name is nullPointer()
//    Parameter is String array and , one int
//return type is String
//if the number is in the array length print the String
//if the number is more than array length then return  "Invalid number!!!"
//    Note: Do not use if statement use try catch block

    public static String nullPointer(String str[], int a) {

        String x = "";

        try {
            System.out.println(str[a]);
            x = str[a];
        } catch (ArrayIndexOutOfBoundsException e) {

            x = "Invalid number!!!";
        }
        return x;
    }
//    Create Method divide()
//    This method has 2 int parameters num1 , num2 return is int
//    Divide num1 to num2 and return the result.
//            if num2 is 0 then return should be -1
//    NOTE : Use try catch block not if statement


    public static int divide(int num1, int num2) {
        int x = 0;
        try {
            x = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            x = -1;
        }
        return x;
    }

//    Create a method sum()
//    parameter is one ArrayList Integer return type is int
//    sum all the numbers in the Arraylist and return the total.
//    If there is a null in the arraylist return -1
//    NOTE : Do not use if statement use try catch block

    public static int sum(ArrayList<Integer> arr) {

        int total = 0;
        try {

            for (Integer integer : arr) {
                total += integer;
            }
        } catch (NullPointerException a) {
            total = -1;
        }
        return total;
    }


//    Create method name is getCharacter()
//    Parameter is one String str1 and one int num
//    Return type is String
//    Get the char in the position of num from the str1
//if the num is bigger then str1 length then return Invalid number!!!
//    NOTE: Do not use if statement use try catch block

    public static String getCharacter(String str1, int num) {
        String x = "";

        try {
            x = x.valueOf(str1.charAt(num));

        } catch (Exception e) {
            x = "Invalid number!!!";
        }

        return x;
    }


//    Create a method name is getChar()
//    Parameter is one string and one int
//return type is String
//    Get the char in the position of num from the str1
//if the String is null
//            return String can not be null
//    NOTE: Do not use if statement use try catch block


    public static String getChar(String str, int a) {
        String x = "";

        try {
            x = x.valueOf(str.charAt(a));

        } catch (NullPointerException e) {
            x = "return String can not be null";
        }

        return x;

    }

//
//    Create a method name is myFancyPants
//    Parameters are 4 integers (low , high , A , B)
//    Return type is ArrayList<String>
//    Note: low ,high , A , B positive numbers
//    You method need to count from low to high
//    If the number evenly divisible by A --> add Fancy to ArrayList
//    If the number evenly divisible by B --> add Pants to ArrayList
//    If the number evenly divisible by A and B --> add FancyPants to ArrayList
//return ArrayList

    public static ArrayList<String> myFancyPants(int low, int high, int a, int b) {
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = low; i <= high; i++) {
            if (i % a == 0 && i % b == 0)
                arr.add("FancyPants");
            else if (i % b == 0)
                arr.add("Pants");
            else if (i % a == 0)
                arr.add("Fancy");
            else
                arr.add(String.valueOf(i));

        }
        return arr;
    }


    public static void main(String[] args) {
//        String []a={"aaa","bbb","ccc"};
//        System.out.println(nullPointer(a,1));

        //       System.out.println(divide(10,0));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(null);
        a.add(5);
        a.add(6);
        a.add(null);

//        System.out.println(  sum(a) );

        //       System.out.println( getCharacter("ali",1)  );
  //      System.out.println(getChar(null, 1));
        System.out.println( myFancyPants(10,20,2,4) );
    }
}
