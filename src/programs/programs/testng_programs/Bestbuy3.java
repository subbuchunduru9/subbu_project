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

    public class Bestbuy3 {
	public String baseURL;
    public WebDriver driver = new FirefoxDriver();
    
    By span_account=By.cssSelector("span.account");
    By fld_firstName=By.id("fld-firstName");
    By fld_lastName=By.id("fld-lastName");
    By fld_e=By.id("fld-e");
    By fld_p1=By.id("fld-p1");
    By fld_p2=By.id("fld-p2");
    

    @Test
    public void Americaneagle_test() {
	
	    driver.get(baseURL + "https://www-ssl.bestbuy.com/identity/newAccount?token=s0aXMHa1sEwYaIcmurFQxlpk280FBCITeGV6cAYg82r7QmQXe7trxSfWOn681HpNrsKexL2G%2F2gZDjwGev%2BCxLCL%2FmcBhbiWERf7%2FG%2FoplCj6qDsF2apAMxuZ3LsAkdVEPAaQmAEhjzJl%2B9VcnZlS2OxJYEkRBkn4%2BsMRi32WhRmlCpAlzHuUNeOQkklKck4i%2FvFUmbZ4Kh2qq431iyjeU9je72vb0NvIUKYbp%2FYPRIsTemeCWK%2Bmguga550O7iquc3HG5iCK%2Ffk2rz3fZxi%2BQ%3D%3D");
	    driver.findElement(span_account).click();
	    driver.findElement(fld_firstName).clear();
	    driver.findElement(fld_firstName).sendKeys("system");
	    driver.findElement(fld_lastName).clear();
	    driver.findElement(fld_lastName).sendKeys("touch");
	    driver.findElement(fld_e).clear();
	    driver.findElement(fld_e).sendKeys("systemtouch99@gmail.com");
	    driver.findElement(fld_p1).clear();
	    driver.findElement(fld_p1).sendKeys("Newosian@1234");
	    driver.findElement(fld_p2).clear();
	    driver.findElement(fld_p2).sendKeys("Newosian@1234");
	    assertEquals("Create an Account", driver.getTitle());
	  }
	
    @BeforeTest
    public void setUp() throws Exception {
  	    driver = new FirefoxDriver();
  	    baseURL = "http://www.bestbuy.com/";
  	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
   @AfterTest
    public void afterTest() {
           driver.quit();
  }
	}


