import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass {

    WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome.driver", "/Users/Andrey/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

}
