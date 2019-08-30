package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	public static WebDriver driver;
	
	By LoginLink=By.xpath("//*[@id='pt-login']/a");
	By Username=By.xpath("//*[@id='wpName1']");
	By Password=By.xpath("//*[@id='wpPassword1']");
	By Loginbutton=By.xpath("//*[@id='wpLoginAttempt']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void clickLoginLink() {
		driver.findElement(LoginLink).click();
	
	}
	public void typeUserName()
	{
		driver.findElement(Username).sendKeys("Mutaparthi Thulasi");
	}
	public void typePassword() {
		driver.findElement(Password).sendKeys("Thulasi@1234");
	}
	public void ClickLoginButton() {
		driver.findElement(Loginbutton).click();
		}
}
