package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mano Chitra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mano");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeafPractice");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("chitra.eeedr@gmail.com");
	WebElement elem=	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd = new Select (elem);
	dd.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	// Edit
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.id("updateLeadForm_description")).clear();
	Thread.sleep(5000);
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TestLeaf");
	Thread.sleep(5000);
	driver.findElement(By.name("submitButton")).click();
	System.out.println("The title is"+ driver.getTitle());
	
	

	}

}
