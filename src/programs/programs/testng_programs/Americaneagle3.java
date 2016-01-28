package programs.programs.testng_programs;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.testng.asserts.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Americaneagle3 {
	public String baseURL;
    public WebDriver driver = new FirefoxDriver();
   	
  @Test
     public void Americaneagle_test() {
	  driver.get(baseURL+ "/contact/chicago");
      driver.manage().window().maximize();
      driver.findElement(By.id("Content_TC6393BD9011_tbName")).sendKeys("rahul");
      driver.findElement(By.id("Content_TC6393BD9011_tbCompany")).sendKeys("AmericanEagle");
      driver.findElement(By.id("Content_TC6393BD9011_tbPhone")).sendKeys("5182532657");
      driver.findElement(By.id("Content_TC6393BD9011_tbEmail")).sendKeys("rahulpromod44");
      driver.findElement(By.id("Content_TC6393BD9011_tbEmail")).sendKeys("rahulpromod44");
      driver.get("http://www.selenium.com/");
	   String testUrl = driver.getCurrentUrl();
	    assertEquals("http://www.selenium.com/", testUrl);

	}
  @BeforeTest
  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseURL = "http://www.americaneagle.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
 @AfterTest
  public void afterTest() {
         driver.quit();
}
}
