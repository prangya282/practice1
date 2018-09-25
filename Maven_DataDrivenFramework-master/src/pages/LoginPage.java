package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver =null;
    private static WebElement element = null;


   

    public static WebElement txtbx_UserName(WebDriver driver){

        element= driver.findElement(By.id("log"));
        return element ;}
        
    public static WebElement txtbx_Password(WebDriver driver){
       element = driver.findElement(By.id("pwd"));
       return element;
       }

    public static WebElement btn_LogIn(WebDriver driver){

    element = driver.findElement(By.id("login"));

    return element;
    }
        
}
