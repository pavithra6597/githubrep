package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JenkinsDemo {

	WebDriver driver;


  @Test
  public void TestCase1() {
	  driver.findElement(By.id("email")).sendKeys("veteranpavithra@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mypassWord6597");
		driver.findElement(By.id("u_0_b")).click();
	 
 
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\Selenium software\\chromedriver_win32 (2)\\chromedriver.exe");
	
		 driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

 }

