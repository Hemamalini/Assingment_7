package assingment7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead extends baseClass {
	@Test
	public void mergeLead() {
		//Merge Leads
		System.out.println("merge");
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys("10559");
		driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys("12446");
		driver.findElement(By.linkText("Merge")).click();
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
	}
}
