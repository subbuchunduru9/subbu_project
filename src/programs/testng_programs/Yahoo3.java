package programs.testng_programs;

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

public class Yahoo3 {
	public String baseURL;
    public WebDriver driver = new FirefoxDriver();
    By first_name=By.id("first-name");
    By last_name=By.id("last-name");
    By user_name=By.id("user-name");
    By password=By.id("password");
    By mobile=By.id("mobile");
    By month=By.id("month");
    By day=By.id("day");
    By year=By.id("year");
    By male=By.id("male");
   	
  @Test
  public void yahoo_test() {
	  driver.get(baseURL + "/registration?.lang=en-US&.intl=us&.src=fpctx&.done=https%3A%2F%2Fwww.yahoo.com%2F&fsredirect=1&fs=YEBT80qHafCM1AOD4keDP_3Ee_If6rzIF.oglG7jLCWhgVP5HRNTSGQNUJxNlcMrzYBD1p_M");
	    driver.manage().window().maximize();
	    driver.findElement(first_name).sendKeys("Madhu");
	    driver.findElement(last_name).sendKeys("Testing");
	    driver.findElement(user_name).sendKeys("Madhu1999");
	    driver.findElement(password).sendKeys("9912893858");
	    driver.findElement(mobile).sendKeys("5182532657");
	    driver.findElement(month).sendKeys("April");
	    driver.findElement(day).sendKeys("12");
	    driver.findElement(year).sendKeys("1991");
	    driver.findElement(male).click();
	    assertEquals("Yahoo Registration", driver.getTitle());
	  
  }
  @BeforeTest

	  public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    baseURL = "https://edit.yahoo.com";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
