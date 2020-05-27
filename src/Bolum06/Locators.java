package Bolum06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
driver.get("http://www.facebook.com"); // open url in browser

        // finds the element in browser by its id name and then pass the value that we want
        driver.findElement(By.id("email")).sendKeys("asd@asd.com");
        driver.findElement(By.name("pass")).sendKeys("[pwer341+");
        driver.findElement(By.linkText("Forgot account?")).click();


//username and password has same className as inputtext. when we sendKeys, it will write it to first box (username)
// not password
        driver.findElement(By.className("inputtext")).sendKeys("Hello");

    }

}
