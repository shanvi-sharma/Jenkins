package SeleniumAssignment.testpages;

import org.openqa.selenium.By;

public @interface sign_out {
	
	public static By btn_menu = By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]");
	public static By btn_signout = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[30]/a[1]");

}
