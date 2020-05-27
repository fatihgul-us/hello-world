package Bolum06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Rediff {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("http://www.rediff.com"); // open url in browser
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();

//      delay ekliyoruz sayfa yukleniyor
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebDriverWait w = new WebDriverWait(driver, 5);
//        w.wait(1000);
//         Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("deneme@gmail");
        driver.findElement(By.cssSelector("input#password")).sendKeys("deneme@");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
    }
}
