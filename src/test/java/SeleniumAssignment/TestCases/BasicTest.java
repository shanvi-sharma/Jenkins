package SeleniumAssignment.TestCases;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenuim.utilities.ReadingPropertiesFile;

import SeleniumAssignment.testpages.SearchItem;
import SeleniumAssignment.testpages.basepage;
import SeleniumAssignment.testpages.buttom_to_top;
import SeleniumAssignment.testpages.cart;
import SeleniumAssignment.testpages.filters;
import SeleniumAssignment.testpages.homepage;
import SeleniumAssignment.testpages.items_sortby;
import SeleniumAssignment.testpages.language;
import SeleniumAssignment.testpages.loginpage;
import SeleniumAssignment.testpages.myaccount;
import SeleniumAssignment.testpages.review;
import SeleniumAssignment.testpages.select_item;
import SeleniumAssignment.testpages.sign_out;
import SeleniumAssignment.testpages.switch_other_acc;




public class BasicTest extends basepage{

	@SuppressWarnings("deprecation")
	@Test
	
	public void testcases() {
		
//		driver.findElement(homepage.btn_option);
		
		
//		for login
//		driver.findElement(homepage.btn_signIn).click();
//		
////		Enter Username
//		driver.findElement(loginpage.txt_username).sendKeys(ReadingPropertiesFile.getProperty("username"));	
//		
////		Press continue
//		driver.findElement(loginpage.btn_continue).click();
//		
////		Enter Password
//		driver.findElement(loginpage.txt_password).sendKeys(ReadingPropertiesFile.getProperty("password"));
//		
////		Press Login
//		driver.findElement(loginpage.btn_signIn).click();
//		JavascriptExecutor ab = (JavascriptExecutor) driver;
//		ab.executeScript("window.scrollBy(0,500)", "");
		
//		check the working of button from bottom to top
//		driver.findElement(buttom_to_top.btn_btp).click();
		
		

		
////		Navigate search bar and put item 
//		driver.findElement(SearchItem.search_bar).sendKeys(ReadingPropertiesFile.getProperty("item"));
//		
////		click for search
//		driver.findElement(SearchItem.search).click();
//		
//		Add filters for Product
//		driver.findElement(filters.btn_str).click();
//		driver.findElement(filters.btn_brand).click();
//		driver.findElement(filters.btn_rom).click();
		
		
////		for sort by item
//		driver.findElement(items_sortby.btn_sortby).click();
//		
////		select sort by
//		driver.findElement(items_sortby.btn_new).click();
//		

		
		
//		scroll down page
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
		
		
		
//		select item
//		driver.findElement(select_item.btn_select).click();
//		driver.findElement(By.className("a-text-left a-size-base")).submit();
//		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
//		driver.findElement(By.id("bylineInfo")).click();


//		write a review for item
//		driver.findElement(review.btn_order).click();
//		driver.findElement(review.btn_review).click();
//		driver.findElement(review.stars).click();
//		driver.findElement(review.headline).sendKeys(ReadingPropertiesFile.getProperty("headline"));
////		driver.findElement(review.add_img).click();
//		driver.findElement(review.review).sendKeys(ReadingPropertiesFile.getProperty("review"));
//		driver.findElement(review.btn_submit).click();
		
//		Showing Cart
//		driver.findElement(cart.cart).click();
//		JavascriptExecutor sl = (JavascriptExecutor) driver;
//		sl.executeScript("window.scrollBy(0,500)", "");
		
//		show My account 
//		driver.findElement(myaccount.add).click();
//		driver.findElement(myaccount.sel_myacc).click();
		
		

//		To Change the language of Amozon.in
//		driver.findElement(language.btn_lng_change).click();
//		driver.findElement(language.sel_lng).click();
//		driver.findElement(language.sel_change).click();
//		driver.findElement(language.btn_lng_change).click();
//		driver.findElement(language.sel_lng2).click();
//		driver.findElement(language.sel_change).click();
		

		
		
//		Sign Out Account
//		driver.findElement(sign_out.btn_menu).click();
//		driver.findElement(sign_out.btn_signout).click();
		
		
//		switch to another account
//		driver.findElement(switch_other_acc.sel_btn).click();
//		driver.findElement(switch_other_acc.sel_sw).click();
//		driver.findElement(switch_other_acc.add_acc).click();
//		driver.findElement(switch_other_acc.user2).sendKeys(ReadingPropertiesFile.getProperty("user2"));
//		driver.findElement(switch_other_acc.btn_cn).click();
//		driver.findElement(switch_other_acc.pass2).sendKeys(ReadingPropertiesFile.getProperty("pass2"));
//		driver.findElement(switch_other_acc.sbmt).click();
		
		
		System.out.println("Test passed");

		
		
	}
	
	
}
