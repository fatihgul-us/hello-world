package ReplitOdev.Soru4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarWebSite {
    //        In the  CarWebSite  class
//Create private String brandOfCar , manufacturedYear
//Create private int doorCount
    private String brandOfCar;
    private String manufacturedYear;
    private int doorCount;
    //        All instance variables are write only.
//        Note: Check age and door count code should be done in the set methods.
//        While checking the age just check the year month is not required.
//        Create a toString method
//
//        In the toString method
//        If car older then 10 years old or car door count is NOT 2 or 4

//        Return This is not a valid search
//        If the car less then 10 years old or door count is 2 or 4
//        Return in order
//        brand of the car =  .....
//        manufactured date = .......
//        door count = .....
//        For example:
//        brand  = bmw
//        ManufacturedYear = 05/25/2015
//        doorCount = 2

    public void setBrandOfCar(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public boolean setManufacturedYear(String manufacturedYear) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate year = LocalDate.parse(manufacturedYear, formatter);
        boolean ret;
        if (date.getYear() - year.getYear() <= 10) {
            this.manufacturedYear = manufacturedYear;
            ret = true;
        } else {
            this.manufacturedYear=manufacturedYear;
            ret = false;
        }
        return ret;
    }

    public boolean setDoorCount(int doorCount) {
        boolean ret;
        if (doorCount == 4 || doorCount == 2) {
            this.doorCount = doorCount;
            ret = true;
        } else
            ret = false;

        return ret;
    }


    public String toString() {
        String ret = "";


         if (setDoorCount(this.doorCount) && setManufacturedYear(this.manufacturedYear)) {

            ret = "brand of the car = " + this.brandOfCar +
                    "\nmanufactured date = " + this.manufacturedYear +
                    "\ndoor count = " + this.doorCount;
        }else
             ret = "This is not a valid search";

        return ret;
    }
}
