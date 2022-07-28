package assingment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findlead  extends baseClass   {
	@Test
public void FindLead() {
	
	//Find Leads
		System.out.println("find");
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hemamalini");
	driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Chandrasekaran");
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Amazon");
	driver.findElement(By.className("x-btn-text")).click();
}
}
