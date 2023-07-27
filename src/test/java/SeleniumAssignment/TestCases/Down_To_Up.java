package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.buttom_to_top;

public class Down_To_Up extends basepage {
	
	@Test
	
	
	public void uptodown() {
		
		
		driver.findElement(buttom_to_top.btn_btp).click();
		
	}

}
