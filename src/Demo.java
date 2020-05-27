import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("http://www.amazon.com");
        System.out.println("This is the title:" +driver.getTitle());


    }
}
