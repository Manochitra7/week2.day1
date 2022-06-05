package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
 {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		// Identify Select tag
		WebElement ele= driver.findElement(By.name("dropdown2"));
		//Select class
		Select dropDown = new Select(ele);
		// option based on Value
		dropDown.selectByValue("3");
		Thread.sleep(5000);
		// Based on Index
		dropDown.selectByIndex(1);
		Thread.sleep(5000);
		// based on visible text
		dropDown.selectByVisibleText("UFT/QTP");
		
		
		

	}

}
