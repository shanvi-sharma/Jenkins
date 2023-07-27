package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.sign_out;

public class Log_Out extends basepage {
	
	@Test
	
	public void signout() {
		
		driver.findElement(sign_out.btn_menu).click();
		driver.findElement(sign_out.btn_signout).click();
	}

}
