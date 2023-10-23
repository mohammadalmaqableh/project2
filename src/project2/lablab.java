package project2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class lablab {
	WebDriver driver = new EdgeDriver();

	@BeforeTest
	public void mySetup() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().maximize();
		//Add in All Cart
				List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn_primary"));
				for(int i = 0; i<AddtoCartButtons.size();i=i+2) {
					AddtoCartButtons.get(i).click();}
				
					
	}

	@Test()
	public void myTest() {


}

	@AfterTest
	public void myAfter() {
	}
}