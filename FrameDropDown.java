package org.fb;



import org.openqa.selenium.WebElement;

public class FrameDropDown extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		Baseclass baseclass = new Baseclass();
		baseclass.getDriver();
		driver.get("https://adactinhotelapp.com/");

		LoginPage page = new LoginPage();

		WebElement txtUsername = page.getTxtUsername();
		txtUsername.sendKeys("hari");
		Thread.sleep(3000);
		driver.navigate().refresh();
		txtUsername.sendKeys("hariharan52");
		
		WebElement txtpassword = page.getTxtpassword();
		txtpassword.sendKeys("12345678");
		
		WebElement btnLogin = page.getBtnLogin();
		btnLogin.click();
		
		
		
		
		
	}
}
