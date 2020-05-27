package Bolum07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSalesforce {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://login.salesforce.com"); // open url in browser


        driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("asd@asd.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("[pwer341+");
driver.findElement(By.xpath("//input[@id='password']")).click();
    }
}
