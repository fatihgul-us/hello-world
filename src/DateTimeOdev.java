import jdk.dynalink.beans.StaticClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeOdev {

//    Instructions from your teacher:
//            1- Create a method name as checkAge
//    Parameter is: string(dateOfBirth)
//    Return type is int
//2- Compare today date to dateOfBirth .  Print the age
//for example:
//    dateOfBirth equal to 02/20/2000
//
//            return should be 20

//    public static int checkAge(String dateOfBirth){
//        LocalDate date = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//
//        LocalDate birthDay = LocalDate.parse(dateOfBirth, formatter);
//        int age = date.getYear() - birthDay.getYear();
//return age;
//    }


    public static int checkAge(String dateOfBirth){

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(dateOfBirth, formatter);

        Period age = Period.between(birthDay,today);

        return  age.getYears();
    }



//    1- Create a method without parameter and name of method is checkDates
//
//2- Return type: String
//
//3- Return today's date  (month / day / year )

    public static String checkDates(){

        LocalDate date = LocalDate.now();
        return date.format( DateTimeFormatter.ofPattern("MM/dd/yyyy")  ).toString();
    }

//    public static String checkDates(){
//
//        LocalDate date = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//
//        String strDate = date.format(formatter).toString();
//
//            return strDate;
//    }

//    1- Create a method name as future
//    Parameter is: int(howManyDays)
//    Return type is String
//2- Return the howManyDays ahead is the future date from today.
//    For Example:
//    howManyDays equal to 4
//    Today is 5/10/2020
//            return should be 5/14/2020
//    For Example:
//    howManyDays equal to 6
//    Today is 5/10/2020
//            return should be 5/16/2020
//public static String future(int howManyDays){
//        LocalDate date = LocalDate.now();
//
//        return date.plusDays(howManyDays).format( DateTimeFormatter.ofPattern("M/d/yyyy")  ).toString();
//}


    public static String future(int howManyDays){

        LocalDate date = LocalDate.now();
//        System.out.println("tarih: "+date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String strDate = date.plusDays(howManyDays).format(formatter).toString();

        return strDate;
    }
//
////1- Create a method name as previous
////    Parameter is: int(howManyDays)
////    Return type is String
//2- Return the howManyDays previous date from today.
//    For Example:
//    howManyDays equal to 4
//    Today is 5/10/2020

  //        return should be 5/06/2020
//    For Example:
//    howManyDays equal to 6
//    Today is 5/10/2020
//            return should be 5/04/2020

    public static String previous(int howManyDays){

        LocalDate date = LocalDate.now();
//        System.out.println("tarih: "+date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String strDate = date.minusDays(howManyDays).format(formatter).toString();

        return strDate;
    }

    public static void main(String[] args) {


            System.out.println(  checkAge("06/22/1988")  );

 //      System.out.println(  checkDates()   );
 //       System.out.println(  future(100)  );
   //     System.out.println( previous(10));
    }
}
