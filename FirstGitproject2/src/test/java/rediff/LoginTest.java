package rediff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.rediff.com");
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		driver.findElement(By.id("password")).sendKeys("Selenium321");
		driver.findElement(By.name("proceed")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
