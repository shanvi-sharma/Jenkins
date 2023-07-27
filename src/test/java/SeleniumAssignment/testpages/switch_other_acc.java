package SeleniumAssignment.testpages;

import org.openqa.selenium.By;

public class switch_other_acc {
	
	public static By sel_btn = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	public static By sel_sw = By.xpath("//span[normalize-space()='Switch Accounts']");
	public static By add_acc = By.xpath("//div[contains(text(),'Add account')]");
	public static By user2 = By.xpath("//input[@id='ap_email']");
	public static By btn_cn = By.xpath("//input[@id='continue']");
	public static By pass2 = By.xpath("//input[@id='ap_password']");
	public static By sbmt= By.xpath("//input[@id='signInSubmit']");
	
	

}
