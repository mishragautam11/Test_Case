package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Create_Article {

    By arttitle= By.xpath("//input[@placeholder='Article Title']");
    By field1 = By.xpath("//input[@placeholder=\"What's this article about?\"]");
    By field2 = By.xpath("//textarea[@placeholder='Write your article (in markdown)']");
    By field3 = By.xpath("//input[@placeholder='Enter tags']");
    By submitbtn= By.xpath("//button[normalize-space()='Publish Article']");
    By validatearticle= By.xpath("//div[@class='container']//a[@class='btn btn-outline-secondary btn-sm'][normalize-space()='Edit Article']");


    WebDriver driver;

    public Create_Article(WebDriver driver){
        this.driver=driver;
    }

    public void createnewarticle(String data1, String data2, String data3, String data4){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(arttitle).sendKeys(data1);
        driver.findElement(field1).sendKeys(data2);
        driver.findElement(field2).sendKeys(data3);
        driver.findElement(field3).sendKeys(data4);
        driver.findElement(submitbtn).click();
        driver.findElement(validatearticle).isDisplayed();
    }
}
