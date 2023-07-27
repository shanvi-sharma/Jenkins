package SeleniumAssignment.testpages;

import org.openqa.selenium.By;

public class loginpage {

	public static By txt_username = By.id("ap_email");
	public static By btn_continue = By.xpath("//input[@id='continue']");
	public static By txt_password = By.id("ap_password");
	public static By btn_signIn = By.xpath("//input[@id='signInSubmit']");
}
