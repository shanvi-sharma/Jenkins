package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import com.selenuim.utilities.ReadingPropertiesFile;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.homepage;
import SeleniumAssignment.testpages.loginpage;

public class Login_Page extends basepage {
	
	@Test
	public void login() {
	
//		for login
		driver.findElement(homepage.btn_signIn).click();
		
//		Enter Username
		driver.findElement(loginpage.txt_username).sendKeys(ReadingPropertiesFile.getProperty("username"));	
		
//		Press continue
		driver.findElement(loginpage.btn_continue).click();
		
//		Enter Password
		driver.findElement(loginpage.txt_password).sendKeys(ReadingPropertiesFile.getProperty("password"));
		
//		Press Login
		driver.findElement(loginpage.btn_signIn).click();
		
	}

}
