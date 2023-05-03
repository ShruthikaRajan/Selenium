import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test3 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void f() throws InterruptedException
	{
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Mohana");
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Mohana123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterTest
	public void AfterMethod()
	{
		driver.close();
	}
}