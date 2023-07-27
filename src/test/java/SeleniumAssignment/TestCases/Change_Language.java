package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.language;

public class Change_Language extends basepage {

	@Test
	
	public void changelan() {
		
		driver.findElement(language.btn_lng_change).click();
		driver.findElement(language.sel_lng).click();
		driver.findElement(language.sel_change).click();
		driver.findElement(language.btn_lng_change).click();
		driver.findElement(language.sel_lng2).click();
		driver.findElement(language.sel_change).click();
	}
}
