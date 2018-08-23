package validate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestyouLogin {
	public static WebDriver driver;

	@Test
	public static void TestYouLoginCase1() throws Exception {

		System.out.println(" Executing Testyou urls Case1");
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://testyou.in/Login.aspx");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("ctl00$CPHContainer$txtUserLogin")).sendKeys("macadmin");
		driver.findElement(By.name("ctl00$CPHContainer$txtPassword")).sendKeys("macadmin");
		driver.findElement(By.name("ctl00$CPHContainer$btnLoginn")).click();
		Thread.sleep(3000);
		driver.close();
	}

	
}
