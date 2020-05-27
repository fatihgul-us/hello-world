package Bolum06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_RegularExpression {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("http://www.facebook.com"); // open url in browser

        driver.findElement(By.id("email")).sendKeys("asd@gmail.com");
        //<input type="password" class="inputtext login_form_input_box" name="pass2324" id="pass" data-testid="royal_pass">
        //yukardaki gibi bir ifade de name=pass2324 olunca bu surekli degisiyor olabilir. her seferinde rakamlar degisiyordur.
        // o yuzden xpath de contains() metodunu kullanrak sadece 'pass' kelimesini arattik
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("fatihgul@gmail");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
