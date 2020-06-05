package ReplitOdev.Soru4;
//Given 2 classes Main and CarWebSite
//        In the Main Class
//        Given Scanner object and String brand , String ManufacturedYear , int doorCount
//        While calling the set methods in the CarWebSite class use brand ,  ManufacturedYear and doorCountvariables.
//        print the CarWebSite  object
//
//
//        In the  CarWebSite  class
//Create private String brandOfCar , manufacturedYear
//Create private int doorCount
//

//
//        Result should be
//        brand of the car =  bmw
//        manufactured date = 05/25/2015
//        door count = 2
//
//        For example:
//        brand  = Mercedes
//        ManufacturedYear = 05/12/2005
//        doorCount = 2
//
//        Because of the date.
//
//        Result should be
//        This is not a valid search
public class Main {
    public static void main(String[] args) {
        CarWebSite c1= new CarWebSite();

        c1.setManufacturedYear("04/27/2015");
        c1.setDoorCount(0);
        c1.setBrandOfCar("Mercedes");

        System.out.println(c1);
    }
}
