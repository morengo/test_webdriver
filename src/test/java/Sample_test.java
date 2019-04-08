import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_test extends BaseTestClass {


    @Test
    public void loginTest(){

        driver.manage().window().maximize();
        driver.get("http://testing-ground.scraping.pro/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputLogin("admin");
        loginPage.inputPassword("12345");
        loginPage.submit();

        Assert.assertEquals("Web Scraper Testing Ground", loginPage.getTitle());
//
//        driver.findElement(By.id("usr")).sendKeys("admin");
//        driver.findElement(By.name("pwd")).sendKeys("12345");
//        driver.findElement(By.xpath("//input")).click();

//        driver.close();
    }
}
