package SeleniumAssignment.TestCases;

import org.testng.annotations.Test;

import com.selenuim.utilities.ReadingPropertiesFile;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.review;

public class Review_Order extends basepage{
	
	@Test
	
	public void review() {
		
		driver.findElement(review.btn_order).click();
		driver.findElement(review.btn_review).click();
		driver.findElement(review.stars).click();
		driver.findElement(review.headline).sendKeys(ReadingPropertiesFile.getProperty("headline"));
//		driver.findElement(review.add_img).click();
		driver.findElement(review.review).sendKeys(ReadingPropertiesFile.getProperty("review"));
	}

}
