package SeleniumAssignment.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.cart;

public class View_Cart extends basepage{
	
	@Test
	
	public void card() {
		
		driver.findElement(cart.cart).click();
//		driver.findElement(cart.p_cart).click();
		
	}

}
