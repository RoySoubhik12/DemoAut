package Test_Demo.Demo_Aut;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static WebElement element=null;
	
	public static void email(WebDriver driver,String xpath,String email) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(email);
			
	}
	public static void click_Confirm(WebDriver driver,String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
