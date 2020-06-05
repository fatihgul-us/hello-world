package ReplitOdev.Soru03;

import java.util.Scanner;

//There are two classes one Main and Subscribe
//        In the Subscribe class
//Create variables private String name , whichTypeOfMember
//        Create variables private int memberCount , price
//        Variable types of name , memberCount  and whichTypeOfMember as just write-only.
//        Make the price as just read-only.
//        There are 3 type of memberShip Gold  , Silver and Bronze.
//        Create a toString method. And do following example.
//        Example:
//
//        Note: Price calculation should be done in the getPrice method.
//        In the Main class.
//        Call the setter methods in the subscribe class.
//        While calling the setName method use variable name in line 10.
//        Same for whichMember and memberCount variables.
//        print the Subscribe Object.
public class Main {

    public static void main(String[] args) {
        Subscribe s1 = new Subscribe();
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String  whichMember = scan.nextLine();
        int memberCount = scan.nextInt();
        s1.setName(name);
        s1.setWhichTypeOfMember(whichMember);
        s1.setMemberCount(memberCount);

//        Name is Victoria , whichTypeOfMember Gold, memberCount 2.
//        Gold membership count is 50 for month.
//        Print Welcome to membership Victoria. Your membership is 100 dollar for month you can enjoy the videos , all homework and see you soon.
//
//      Name is Rinda , whichTypeOfMember Silver, memberCount 3.
//        Silver membership count is 40 for month.
//        print Welcome to membership Rinda. Your membership is 120 dollar for month you can enjoy the videos.
//
//        Name is Steven, whichTypeOfMember Bronze , memberCount 1.
//        Bronze membership count is 30 for month.
//        print Welcome to membership Steven. Your membership is 30 dollar for month you can enjoy and all homework.
        System.out.println( s1 );
    }
}


