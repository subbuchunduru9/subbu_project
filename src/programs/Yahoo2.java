package programs;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://edit.yahoo.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAmerican() throws Exception {
    driver.get(baseUrl + "/registration?.lang=en-US&.intl=us&.src=fpctx&.done=https%3A%2F%2Fwww.yahoo.com%2F&fsredirect=1&fs=YEBT80qHafCM1AOD4keDP_3Ee_If6rzIF.oglG7jLCWhgVP5HRNTSGQNUJxNlcMrzYBD1p_M");
    driver.manage().window().maximize();
    driver.findElement(By.id("first-name")).sendKeys("Madhu");
    driver.findElement(By.id("last-name")).sendKeys("Testing");
    driver.findElement(By.id("user-name")).sendKeys("Madhu1999");
    driver.findElement(By.id("password")).sendKeys("9912893858");
    driver.findElement(By.id("mobile")).sendKeys("5182532657");
    driver.findElement(By.id("month")).sendKeys("April");
    driver.findElement(By.id("day")).sendKeys("12");
    driver.findElement(By.id("year")).sendKeys("1991");
    driver.findElement(By.id("male")).click();
    assertEquals("Yahoo Registration", driver.getTitle());
  } 	
 @Test
  public void testSignIn() throws Exception {
	 driver.get(baseUrl + "/config/login?.src=fpctx&.intl=us&.done=https%3A%2F%2Fwww.yahoo.com%2F");
	 driver.manage().window().maximize();
	   driver.findElement(By.id("login-username")).sendKeys("schund05");
	   driver.findElement(By.id("login-passwd")).sendKeys("Newosian@1234");
	   driver.findElement(By.id("persistent")).click();
	   String testUrl1 = driver.getCurrentUrl();
	   System.out.println(testUrl1);
	   String x = driver.findElement(By.id("mbr-login-greeting")).getText();
	   assertEquals("Sign in to your account",x);
	   System.out.println(x);
	   driver.get("http://idlebrain.com/");
	   String testUrl = driver.getCurrentUrl();
	    assertEquals("http://idlebrain.com/", testUrl);
	    System.out.println(testUrl);
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
