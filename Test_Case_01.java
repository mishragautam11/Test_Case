import Pageobjects.Signup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Case_01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://demo.realworld.io/#/");

        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).isDisplayed();

        // Signup for a new user

        Signup signup = new Signup(driver);
        signup.clicksignup();
        signup.inputdata("user1","user1@gmail.com","user1@123");

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='article-preview']")));

        driver.findElement(By.xpath("//div[@class='article-preview']")).isDisplayed();
        driver.quit();

    }
}
