import Pageobjects.Create_Article;
import Pageobjects.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_Case_02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://demo.realworld.io/#/");


        Login login= new Login(driver);

        login.signinbtnclick();
        login.performsignin("testdat1","testdata2");
        driver.findElement(By.xpath("//a[normalize-space()='gautam']")).isDisplayed();

        driver.findElement(By.xpath("//a[@ui-sref='app.editor']")).click();

        Create_Article article = new Create_Article(driver);

        article.createnewarticle("Testdata1","Testdata2","Testdata3","Testdata4");

        driver.quit();
    }
}
