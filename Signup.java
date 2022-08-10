package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {

By signupbtn= By.xpath("//a[normalize-space()='Sign up']");
By username = By.xpath("//input[@placeholder='Username']");
By email = By.xpath("//input[@placeholder='Email']");
By password= By.xpath("//input[@placeholder='Password']");
By submit = By.xpath("//button[normalize-space()='Sign up']");


WebDriver driver;

public Signup(WebDriver driver){
    this.driver=driver;}


    public void clicksignup(){
    driver.findElement(signupbtn).click();
    }
    public void inputdata(String data1, String data2 , String data3){
    driver.findElement(username).sendKeys(data1);
    driver.findElement(email).sendKeys(data2);
    driver.findElement(password).sendKeys(data3);
    driver.findElement(submit).click();

    }



}
