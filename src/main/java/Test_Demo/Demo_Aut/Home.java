package Test_Demo.Demo_Aut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	public static WebElement element=null;
	
	public static void open_url(WebDriver driver,String url) {
		
		driver.get(url);		
		
	}
	
	public static void Home_Page(WebDriver driver,String xpath) {
		
		element= driver.findElement(By.xpath(xpath));		
		element.click();
		
	}

	

}
