package programs;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class western {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.westernunion.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewtestcase() throws Exception {
    driver.get(baseUrl + "/us/en/register.html");
    driver.findElement(By.id("wu_register_email")).clear();
    driver.findElement(By.id("wu_register_email")).sendKeys("sachin9900@gmail.com");
    driver.findElement(By.id("wu_register_password")).clear();
    driver.findElement(By.id("wu_register_password")).sendKeys("9030767549");
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

  @Test 
  public void testreset() throws Exception {
	  driver.get(baseUrl + "/us/en/password-recovery.html"); 
	  driver.findElement(By.id("wu-reset-password-email")).sendKeys("schund05");
	  driver.findElement(By.id("wu-reset-password-birth-month")).sendKeys("4-april");
	  driver.findElement(By.id("wu-reset-password-birth-day")).sendKeys("10");
	  driver.findElement(By.id("wu-reset-password-birth-year")).sendKeys("1991");
	  driver.findElement(By.id("wu_register_captcha_text")).sendKeys("v4ch36");
	  String x = driver.findElement(By.cssSelector(".reset-password-title>h1")).getText();
	   assertEquals("Reset Password",x);
	   System.out.println(x);
	  
  }
    
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
