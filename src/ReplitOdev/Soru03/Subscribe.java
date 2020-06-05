package ReplitOdev.Soru03;
//There are two classes one Main and Subscribe
//        In the Subscribe class
//Create variables private String name , whichTypeOfMember
//        Create variables private int memberCount , price
//        Variable types of name , memberCount  and whichTypeOfMember as just write-only.
//        Make the price as just read-only.

//        There are 3 type of memberShip Gold  , Silver and Bronze.

//        Create a toString method. And do following example.
//        Example:
//        Name is Victoria , whichTypeOfMember Gold, memberCount 2.
//        Gold membership count is 50 for month.
//        Print Welcome to membership Victoria. Your membership is 100 dollar for month you can enjoy the videos , all homework and see you soon.

//        Name is Rinda , whichTypeOfMember Silver, memberCount 3.
////        Silver membership count is 40 for month.
//        print Welcome to membership Rinda. Your membership is 120 dollar for month you can enjoy the videos.
////        Name is Steven, whichTypeOfMember Bronze , memberCount 1.
//        Bronze membership count is 30 for month.
//        print Welcome to membership Steven. Your membership is 30 dollar for month you can enjoy and all homework.
//        Note: Price calculation should be done in the getPrice method.
//        In the Main class.
//        Call the setter methods in the subscribe class.
//        While calling the setName method use variable name in line 10.
//        Same for whichMember and memberCount variables.
//        print the Subscribe Object.
public class Subscribe {
    private String name;
    private String whichTypeOfMember;
    private int memberCount, price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWhichTypeOfMember(String whichTypeOfMember) {
        this.whichTypeOfMember = whichTypeOfMember;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public int getPrice() {
        if (whichTypeOfMember.equalsIgnoreCase("GOLD"))
            price =50;
        else if(whichTypeOfMember.equalsIgnoreCase("SILVER"))
            price =40;
        else if(whichTypeOfMember.equalsIgnoreCase("BRONZE"))
            price =30;

            return price*memberCount;
    }

//        Name is Victoria , whichTypeOfMember Gold, memberCount 2.
//        Gold membership count is 50 for month.
//        Print Welcome to membership Victoria. Your membership is 100 dollar for month you can enjoy the videos , all homework and see you soon.


    public String toString() {
        String ret="";
        if (whichTypeOfMember.equalsIgnoreCase("GOLD")){
         ret=
                "Welcome to membership " + name + "."+
                " Your membership is " +getPrice() +" dollar for month you can enjoy the videos , all homework and see you soon.";

    }else if(whichTypeOfMember.equalsIgnoreCase("SILVER")){
  //          Name is Rinda , whichTypeOfMember Silver, memberCount 3.
////        Silver membership count is 40 for month.
//        print Welcome to membership Rinda. Your membership is 120 dollar for month you can enjoy the videos.
             ret="Welcome to membership "+name +"."+ " Your membership is "+getPrice() +" dollar for month you can enjoy the videos.";

        }else if(whichTypeOfMember.equalsIgnoreCase("BRONZE")){
 //           Name is Steven, whichTypeOfMember Bronze , memberCount 1.
//        Bronze membership count is 30 for month.
//        print Welcome to membership Steven. Your membership is 30 dollar for month you can enjoy and all homework.
            ret="Welcome to membership "+name+". Your membership is "+getPrice()+" dollar for month you can enjoy and all homework.";
        }
        return ret;
    }

}
