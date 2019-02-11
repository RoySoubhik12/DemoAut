package Test_Demo.Demo_Aut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class registration {
	
	public static void radio_btn(WebDriver driver,String xpath) {
		
		if(driver.findElement(By.xpath(xpath)).isSelected()) {
			
			System.out.println("The Element is already selected");
		}
		else {
			driver.findElement(By.xpath(xpath)).click();
		}
		
		
	}
	
	public static void txt_field(WebDriver driver,String xpath,String key) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(key);
		
	}
	
	public static void drop_Down(WebDriver driver,String xpath,String value) {
		
		Select select = new Select(driver.findElement(By.xpath(xpath)));
		select.selectByValue(value);
	}
	
	public static void btn_Click(WebDriver driver,String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	

}
