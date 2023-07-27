package SeleniumAssignment.testpages;

import org.openqa.selenium.By;

public class review {
	
	public static By btn_order = By.xpath("//span[normalize-space()='& Orders']");
	public static By btn_review = By.xpath("//a[@id='Write-a-product-review_1']");
	public static By stars = By.xpath("//img[@alt='select to rate item five star.']");
	public static By headline = By.xpath("//input[@id='scarface-review-title-label']");
	public static By review = By.xpath("//textarea[@id='scarface-review-text-card-title']");
	public static By btn_submit = By.xpath("//button[@value='Submit']");
	public static By add_img = By.xpath("//div[@aria-label='Add a photo or video']");

}
