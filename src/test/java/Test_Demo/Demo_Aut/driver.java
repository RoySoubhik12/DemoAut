package Test_Demo.Demo_Aut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	
	public static WebDriver driver=null;
		
public static void main(String args[]) {
	
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\Soubhik\\Desktop\\seleniumjar\\chromedriver.exe");
	driver=new ChromeDriver();
	Home.open_url(driver,"http://automationpractice.com");
	Home.Home_Page(driver, "//a[@class='login']");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Login.email(driver, "//input[@data-validate='isEmail' and @id='email_create']", "RoySou@gmail.com");
	Login.click_Confirm(driver, "//button[@id='SubmitCreate']/span");
	registration.radio_btn(driver, "");
}

}
