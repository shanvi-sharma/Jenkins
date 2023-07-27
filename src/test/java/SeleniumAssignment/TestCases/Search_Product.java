package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import com.selenuim.utilities.ReadingPropertiesFile;

import SeleniumAssignment.testpages.SearchItem;
import SeleniumAssignment.testpages.basepage;

public class Search_Product extends basepage{

	@Test
	
	 public void search(){
//		Navigate search bar and put item 
		driver.findElement(SearchItem.search_bar).sendKeys(ReadingPropertiesFile.getProperty("item"));
		
//		click for search
		driver.findElement(SearchItem.search).click();
		
	}
}
