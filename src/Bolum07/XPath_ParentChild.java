package Bolum07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_ParentChild {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.google.com"); // open url in browser
// //div[@class='SDkEP']/div[2]/input  each /div shows parent and child relation of div s
        driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Merhaba");

    }
}
