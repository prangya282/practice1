package businessComponents;
import org.openqa.selenium.WebDriver;

import pages.HomePage;

import pages.LoginPage;

import utility.ExcelUtils;

public class SignIn_MyAccount {
	

// Now this method does not need any arguments


	public static void Execute(WebDriver driver) throws Exception{

		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);

		HomePage.link_MyAccount(driver).click();;
		Thread.sleep(4000);
		//HomePage.;
		LoginPage.txtbx_UserName(driver).sendKeys(sUserName);
		Thread.sleep(2000);
		LoginPage.txtbx_Password(driver).sendKeys(sPassword);
		Thread.sleep(2000);
		LoginPage.btn_LogIn(driver).click();
		Thread.sleep(2000);
		//LoginPage.UserName.sendKeys(sUserName);
		//LoginPage.passWord.sendKeys(sPassword);
        //LoginPage.btnLogin.click();

    }


}
