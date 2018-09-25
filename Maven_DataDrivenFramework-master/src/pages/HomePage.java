package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver =null;

    @FindBy(id="account")
    public static WebElement MyAccount ;


    @FindBy(xpath="//*[@href='http://store.demoqa.com/' and span]")
    public static WebElement HomeLink;
    
    private static WebElement element = null;

    
    public HomePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set user name in textbox

    
    public HomePage openClickMyAccount(WebDriver driver){

        if(MyAccount.isDisplayed())
        {
        	System.out.println(" MyAccount Displayed");
        	MyAccount.click();
        }
        return this;
    }
        public static WebElement link_MyAccount(WebDriver driver){
        	 
            element = driver.findElement(By.id("account"));
         
            return element;
         
            }

   
    public HomePage openHomePage(WebDriver driver){

    	if(HomeLink.isDisplayed())
        {
    		HomeLink.click();
        	System.out.println(" HomePage Displayed");
        }
        return this;


    }

    public HomePage closeBrowser(){

        driver.quit();
        return this;

    }
    

}
