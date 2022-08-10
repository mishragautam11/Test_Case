package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    By signinbtn = By.xpath("//a[normalize-space()='Sign in']");

    By id = By.xpath("//input[@placeholder='Email']");
    By pwd = By.xpath("//input[@placeholder='Password']");
    By signbtnbtn= By.xpath("//button[normalize-space()='Sign in']");

    WebDriver driver;

    public Login(WebDriver driver){
        this.driver=driver;
    }

    public void signinbtnclick(){
        driver.findElement(signinbtn).click();
    }

    public void performsignin(String uid, String pass){

        driver.findElement(id).sendKeys(uid);
        driver.findElement(pwd).sendKeys(pass);
        driver.findElement(signbtnbtn).click();
    }
}
