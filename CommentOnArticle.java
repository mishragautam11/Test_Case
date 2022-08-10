package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommentOnArticle {

    By putcomment = By.xpath("//textarea[@placeholder='Write a comment...']");
    By button = By.xpath("//button[normalize-space()='Post Comment']");


    WebDriver driver;

    public CommentOnArticle(WebDriver driver){
        this.driver=driver;
    }

    public void setcomment(String data1){

        driver.findElement(putcomment).sendKeys(data1);
        driver.findElement(button).click();
    }
}
