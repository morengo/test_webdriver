import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By loginFieldLocator = By.xpath("//usr");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputLogin(String login){
        driver.findElement(loginFieldLocator).sendKeys(login);
    }

    public void inputPassword(String password){
        driver.findElement(By.id("pwd")).sendKeys(password);
    }

    public void submit() {
        driver.findElement(By.xpath("//input")).click();
    }

    public java.lang.String getTitle() {
        return driver.getTitle();
    }
}
