package day7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Question4 {
	WebDriver driver;
	@BeforeSuite
	void init()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(co);
	}
	@Test
	void Test1() throws InterruptedException
	{
		String url1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url1);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		String url2="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		driver.get(url2);
		WebElement l1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		l1.click();
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		logout.click();
	}
}
