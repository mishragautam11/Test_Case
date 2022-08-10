import Pageobjects.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_Case_03 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://demo.realworld.io/#/");

        Login login = new Login(driver);

        login.signinbtnclick();
        login.performsignin("testdat1", "testdata2");

        boolean visiable = driver.findElement(By.xpath("//a[normalize-space()='gautam']")).isDisplayed();
        if (visiable == true) {
            driver.findElement(By.xpath("//a[@ui-sref='app.settings']")).click();
        }
        boolean settingpage = driver.findElement(By.xpath("//h1[normalize-space()='Your Settings']")).isDisplayed();
        if (settingpage == true) {
            driver.findElement(By.xpath("//button[normalize-space()='Or click here to logout.']")).click();


        }
        driver.quit();
    }
}