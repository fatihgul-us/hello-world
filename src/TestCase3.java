import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "D:\\BrowserDriver\\IEDriverServer.exe");
        WebDriver drive =new InternetExplorerDriver();
        drive.get("http://www.google.com");
        System.out.println("This is the title:" +drive.getTitle());
    }
}

