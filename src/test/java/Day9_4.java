
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_4 {
	
	// directory where output is to be printed
	ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	ExtentReports extent = new ExtentReports();
	static ExtentTest test;
	WebDriver driver;
    @BeforeMethod
    public void beforetest()
    {
    	  extent.attachReporter(spark);
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
    }
    @Test
    public void tc_2() throws InterruptedException {
  	  test = extent.createTest("tc_001","Login into OrangeHRM page");
  	  test.log(Status.PASS,"TC_001");
  	  Thread.sleep(5000);
  	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
  	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
  	  String url = driver.getCurrentUrl();
  	  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  	  Thread.sleep(3000);
    }
  
  @AfterSuite
  public void tc_3() {
	  extent.flush();
	  driver.quit();
  }
}