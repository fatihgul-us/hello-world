package Bolum06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustimizedXPath_CSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

//        driver.get("http://login.salesforce.com"); // open url in browser
//        // finds the element in browser by its id name and then pass the value that we want
//        driver.findElement(By.id("username")).sendKeys("asd@asd.com");
//        driver.findElement(By.name("pw")).sendKeys("[pwer341+");
//        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
//        System.out.println(    driver.findElement(By.cssSelector("#error")).getText()   );

        driver.get("http://www.facebook.com"); // open url in browser
        // finds the element in browser by its id name and then pass the value that we want
        driver.findElement(By.id("email")).sendKeys("asd@asd.com");
        driver.findElement(By.name("pass")).sendKeys("[pwer341+");
        driver.findElement(By.linkText("Forgot account?")).click();
driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
