package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		LoginPage login=new LoginPage(driver);
		login.clickLoginLink();
		login.typeUserName();
		login.typePassword();
		login.ClickLoginButton();
	}

}
