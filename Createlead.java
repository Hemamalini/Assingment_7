package assingment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Createlead extends baseClass {
	@Test(invocationCount=3,threadPoolSize=2)
	public void createLead() {
		System.out.println("create");
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemamalini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrasekaran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BM");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("BM LOCATED IN CHENNAI");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hema@gmail.com");
		WebElement StateProvinceGeoIdElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		//StateProvinceGeoIdElement.sendKeys("New York");//or try by creating obj
		Select stateObj = new Select(StateProvinceGeoIdElement);
		stateObj.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String createTitlePage = driver.getTitle();
		System.out.println("The Title of the page is : "+createTitlePage);
	}
	
}

