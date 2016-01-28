package programs;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_first {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.w3schools.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled3() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("navbtn_tutorials")).click();
    driver.findElement(By.linkText("Learn JavaScript")).click();
    driver.findElement(By.linkText("JS Operators")).click();
    driver.findElement(By.cssSelector("#topnavbtn_references > i.fa.fa-caret-down")).click();
    driver.findElement(By.linkText("SVG Reference")).click();
    driver.findElement(By.id("topnavbtn_tutorials")).click();
    driver.findElement(By.linkText("Learn XSLT")).click();
    driver.get("http://www.andhraguide.com/movies.php");
	   String testUrl = driver.getCurrentUrl();
	    assertEquals("http://www.andhraguide.com/movies.php", testUrl);
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
