package Verify;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void ClientAdminUser() throws InterruptedException {
		System.out.println(" Executing SAF urls");
		System.setProperty("webdriver.chrome.driver", "F:\\Continues Integration & Testing\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://teammigrate:18080/#/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("hprasad");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector(".btn.btn-login")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void ManagerUser() throws InterruptedException {
		System.out.println(" Executing SAF urls...");
		System.setProperty("webdriver.chrome.driver", "F:\\Continues Integration & Testing\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://teammigrate:18080/#/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("hprasad");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector(".btn.btn-login")).click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Title";
		assertEquals(actualTitle, expectedTitle);
		Thread.sleep(3000);
		driver.close();
	}
}
