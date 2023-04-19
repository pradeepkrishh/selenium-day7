package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
	@Test
		public void practice()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String exp="Guest Registration Form-User Registration";
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(exp, actual);
		}
}