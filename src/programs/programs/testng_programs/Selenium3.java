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

    public class Selenium3 {
	public String baseURL;
    public WebDriver driver = new FirefoxDriver();
    By navbtn_tutorials=By.id("navbtn_tutorials");
    By Learn_JavaScript=By.linkText("Learn JavaScript");
    By JS_Operators=By.linkText("JS Operators");
    By topnavbtn_references=By.cssSelector("#topnavbtn_references > i.fa.fa-caret-down");
    By SVG_Reference=By.linkText("SVG Reference");
    By topnavbtn_tutorials=By.id("topnavbtn_tutorials");
    By Learn_XSLT=By.linkText("Learn XSLT");

    @Test
    public void Selenium_Test() throws Exception {
      driver.get(baseURL + "/");
      driver.findElement(navbtn_tutorials).click();
      driver.findElement(Learn_JavaScript).click();
      driver.findElement(JS_Operators).click();
      driver.findElement(topnavbtn_references).click();
      driver.findElement(SVG_Reference).click();
      driver.findElement(topnavbtn_tutorials).click();
      driver.findElement(Learn_XSLT).click();
      driver.get("http://www.andhraguide.com/movies.php");
  	   String testUrl = driver.getCurrentUrl();
  	    assertEquals("http://www.andhraguide.com/movies.php", testUrl);
  	    System.out.println(testUrl);
    }
    @BeforeTest
    public void setUp() throws Exception {
  	    driver = new FirefoxDriver();
  	    baseURL = "http://www.w3schools.com/";
  	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
   @AfterTest
    public void afterTest() {
           driver.quit();
  }

	}


