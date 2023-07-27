package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.items_sortby;

public class Sort_by extends basepage {
	
	@Test
	
	public void sortby() {
		
//		for sort by item
		driver.findElement(items_sortby.btn_sortby).click();
		
//		select sort by
		driver.findElement(items_sortby.btn_new).click();
		
	}

}
