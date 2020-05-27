package Bolum05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("http://www.yahoo.com");
        System.out.println("This is the title: " +driver.getTitle());

       System.out.println( "Prints the name of current web Page: " +driver.getCurrentUrl()  );

     //   System.out.println("Prints the source code of current web page: " + driver.getPageSource() );

        driver.get("http://www.google.com");
        System.out.println("Prints the source code of current web page: " + driver.getPageSource() );

      //  driver.navigate().back();
       // driver.navigate().forward();
      //  driver.close(); // closes current broweser
       // driver.quit(); // close all the browsers opened by selenium script
    }
}
