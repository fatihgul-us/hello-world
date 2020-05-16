import java.util.Scanner;

//Family class{
//        Create instance variables
//        2 Integer - amountOfUser , totalAmount
//        2 String - familyName , familyPrimaryUser
//        Create one method name is getTotalAmount
//        Parameter is PhonePlan (next Class)
//        This method will call the amount method from the PhonePlan class and multiply the result with amountOfUser
//        result should be equal to totalAmount
//        print  total Amount is : totalAmount
//        family name is : familyName
//        primary user is : familyPrimaryUser
//        Use toString method while printing
//        }
class Family{
    int amountOfUser=0 , totalAmount=0;
    String  familyName="", familyPrimaryUser="";

    public void getTotalAmount(PhonePlan plan){

        totalAmount = amountOfUser*plan.amount(amountOfUser);
        System.out.println("total Amount is :"+totalAmount);
        System.out.println("family name is : "+familyName);
        System.out.println("primary user is : "+familyPrimaryUser);
    }
}

//        PhonePlan class{
//        Create instance variables
//        1 String - planType
//        1 Integer - priceForEach
//        Create one method name is amount
//        Parameter is 1 int (totalUser from Family class)
//        if planType equal to eco and int is less or equal to 3  priceForEach is 50
//        if planType equal to eco and int is bigger then 3 and less or equal 5 priceForEach is 45
//        if planType equal to eco and int is bigger then 5 priceForEach is 40
//        if planType equal to premium and int is less or equal to 3 priceForEach is 70
//        if planType equal to premium and int is bigger then 3 and less or equal 5 priceForEach is 60
//        if planType equal to premium and int is bigger then 5 priceForEach is 55
//        return the priceForEach
//        }
class PhonePlan{
    String planType="";
    int priceForEach=0;

    public int amount(int totalUser){
        if(planType.equals("eco") && totalUser <= 3)
            priceForEach=50;
        else if (planType.equals("eco") && (totalUser <=5 && totalUser>3))
            priceForEach=45;
        else if (planType.equals("eco") && totalUser >5 )
            priceForEach=35;
        else if (planType.equals("premium") && totalUser <= 3 )
            priceForEach=70;
        else if (planType.equals("premium") && (totalUser > 3 && totalUser <= 5))
            priceForEach=60;
        else if (planType.equals("premium") && totalUser > 5 )
            priceForEach=55;

        return priceForEach;
    }

}
//        Main{
//        Use Main method here
//        Create 4 scanner variable
//        Integer - amountOfUser
//        String - familyName
//        String - familyPrimaryUser
//        String - planType
//        Create one object for each class While defining the instance variables use scanner variables Print the object
//                For example:
//        Scanner s1 = new Scanner(System.in);
//        String familyNameFromScanner = s1.nextLine();
//        Family f1 = new Family();
//        f1.familyName =familyNameFromScanner;
//        Print example
//        System.out.println(f1);
//      }

class Main {
}

public class replitClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Family f1 = new Family();

        String familyNameFrom = input.nextLine();
        f1.familyName=familyNameFrom;

        Integer amountOfUserFrom = input.nextInt();
        f1.amountOfUser=amountOfUserFrom;

        input.nextLine();
        String familyPrimaryUserFrom = input.nextLine();
        f1.familyPrimaryUser=familyPrimaryUserFrom;


        PhonePlan plan = new PhonePlan();
        String planTypeFrom = input.nextLine();
        plan.planType = planTypeFrom;

        f1.getTotalAmount(plan);

    }
}









