package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.myaccount;

public class My_Account extends basepage {
	
	@Test
	
	public void myacc() {
		
		driver.findElement(myaccount.sel_myacc).click();
		
	}

}
