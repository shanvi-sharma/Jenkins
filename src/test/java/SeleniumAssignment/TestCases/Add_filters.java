package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.filters;

public class Add_filters extends basepage {
	
	@Test
	
	public void filter() {
		
		driver.findElement(filters.btn_str).click();
		driver.findElement(filters.btn_brand).click();
		driver.findElement(filters.btn_rom).click();
	}

}
