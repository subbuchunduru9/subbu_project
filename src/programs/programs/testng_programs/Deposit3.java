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

    public class Deposit3 {
	public String baseURL;
    public WebDriver driver = new FirefoxDriver();
  
    By Register=By.linkText("Register.");
    By span_userGroup=By.cssSelector("span.userGroup");
    By username=By.name("username");
    By password_original=By.name("password[original]");
    By password_confirmed=By.name("password[confirmed]");


    @Test
    public void testUntitled() throws Exception {
      driver.get(baseURL + "/");
      driver.findElement(By.xpath(".//*[@id='top-menu']/ul/li[3]/a")).click();
      driver.findElement(Register).click();
      driver.findElement(span_userGroup).click();
      driver.findElement(username).click();
      driver.findElement(username).clear();
      driver.findElement(username).sendKeys("Subbu");
      driver.findElement(password_original).clear();
      driver.findElement(password_original).sendKeys("1234");
      driver.findElement(password_confirmed).clear();
      driver.findElement(password_confirmed).sendKeys("1234");
      String x = driver.findElement(By.xpath(".//*[@id='left-column']/div[1]/h1")).getText();
  	   assertEquals("Job Seeker Registration",x);
  	   System.out.println(x);
    }
    @BeforeTest
    public void setUp() throws Exception {
  	    driver = new FirefoxDriver();
  	    baseURL = "http://desiopt.com/";
  	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
   @AfterTest
    public void afterTest() {
           driver.quit();
  }
	}

