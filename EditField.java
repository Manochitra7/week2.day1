package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mano");
		Thread.sleep(3000);
		// Clear field
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("chitra");
		// Get Attribute
		driver.findElement(By.name("username")).getAttribute("value");
        System.out.println("value");
		
		
		

	}

}
