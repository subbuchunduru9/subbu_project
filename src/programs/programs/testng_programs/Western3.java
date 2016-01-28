package programs.programs.testng_programs;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.PageFactory;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class Western3 {
	public String baseURL;
    public WebDriver driver = new FirefoxDriver();
    By reset_password_email = By.id("wu-reset-password-email");
     By reset_password_birth_month =By.id("wu-reset-password-birth-month");
    By reset_password_birth_day = By.id("wu-reset-password-birth-day");
     By reset_password_birth_year =By.id("wu-reset-password-birth-year");
     By wu_register_captcha_text =By.id("wu_register_captcha_text");
     By reset_password_title =By.cssSelector(".reset-password-title>h1");
     By register_email = By.id("wu_register_email");
	    By register_password=By.id("wu_register_password");
   	

	@Test
	 public void Western_test() {
		 driver.get(baseURL + "/us/en/password-recovery.html"); 
		  driver.findElement(reset_password_email).sendKeys("schund05");
		  driver.findElement(reset_password_birth_month).sendKeys("4-april");
		  driver.findElement(reset_password_birth_day).sendKeys("10");
		  driver.findElement(reset_password_birth_year).sendKeys("1991");
		  driver.findElement(wu_register_captcha_text).sendKeys("v4ch36");
		  String x = driver.findElement(reset_password_title).getText();
		   assertEquals("Reset Password",x);
		   System.out.println(x);

	}
	 @Test
	  public void testNewtestcase() throws Exception {
	    driver.get(baseURL + "/us/en/register.html");
	    driver.findElement(register_email).clear();
	    driver.findElement(By.id("wu_register_email")).sendKeys("sachin9900@gmail.com");
	    driver.findElement(By.id("wu_register_password")).clear();
	    driver.findElement(register_password).sendKeys("9030767549");
	    driver.findElement(By.id("wu_register_password")).click();
	    driver.findElement(By.id("wu_register_password")).click();
	    driver.findElement(By.id("wu_register_password")).click();
	    driver.findElement(By.id("wu_register_password")).clear();
	    driver.findElement(By.id("wu_register_password")).sendKeys("Newosian@1234");
	    driver.findElement(By.id("wu_register_password_repeat")).clear();
	    driver.findElement(By.id("wu_register_password_repeat")).sendKeys("Newosian@1234");
	    driver.findElement(By.id("wu_register_phone")).clear();
	    driver.findElement(By.id("wu_register_phone")).sendKeys("5182560000");
	    driver.findElement(By.cssSelector("div.wu-web-template-main-content")).click();
	    driver.findElement(By.cssSelector("div.wu-web-template-main-content")).click();
	    driver.findElement(By.id("wu_register_first_name")).clear();
	    driver.findElement(By.id("wu_register_first_name")).sendKeys("sachin");
	    driver.findElement(By.id("wu_register_last_name")).clear();
	    driver.findElement(By.id("wu_register_last_name")).sendKeys("tendulkar");
	    driver.findElement(By.id("register-page")).click();
	    driver.findElement(By.id("register-page")).click();
	    driver.findElement(By.id("wu_register_addr_line1")).clear();
	    driver.findElement(By.id("wu_register_addr_line1")).sendKeys("211 n 2 nd street");
	    driver.findElement(By.id("wu_register_city")).clear();
	    driver.findElement(By.id("wu_register_city")).sendKeys("harrison");
	    driver.findElement(By.id("wu_register_state")).click();
	    new Select(driver.findElement(By.id("wu_register_state"))).selectByVisibleText("NJ : New Jersey");
	    driver.findElement(By.cssSelector("option[value=\"NJ\"]")).click();
	    driver.findElement(By.id("wu_register_postal_code")).clear();
	    driver.findElement(By.id("wu_register_postal_code")).sendKeys("07029");
	    driver.findElement(By.cssSelector("div.wu-web-template-middle-frame")).click();
	    driver.findElement(By.id("wu_register_birth_month")).click();
	    new Select(driver.findElement(By.id("wu_register_birth_month"))).selectByVisibleText("1-Jan");
	    driver.findElement(By.cssSelector("option[value=\"01\"]")).click();
	    driver.findElement(By.id("wu_register_birth_day")).click();
	    new Select(driver.findElement(By.id("wu_register_birth_day"))).selectByVisibleText("05");
	    driver.findElement(By.cssSelector("#wu_register_birth_day > option[value=\"05\"]")).click();
	    driver.findElement(By.id("wu-register-birth-year_txt")).clear();
	    driver.findElement(By.id("wu-register-birth-year_txt")).sendKeys("1990");
	  }
	 @BeforeTest
	  public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    baseURL = "https://www.westernunion.com/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }
     @AfterTest
      public void afterTest() {
	         driver.quit();
 }

}
