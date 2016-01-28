package programs;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class yahoo {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://edit.yahoo.com/registration?.lang=en-US&.intl=us&.src=fpctx&.done=https%3A%2F%2Fwww.yahoo.com%2F&fsredirect=1&fs=P.NbSDqHafCmz0HkmOuJWSzT.YPNVOGVDehqNBUpKayztLUHWU0KepvMI_AH_M6tojOSfk9x";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testYahoo() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("user-name")).click();
    driver.findElement(By.id("first-name")).sendKeys("swadesh");
    driver.findElement(By.id("last-name")).click();
    driver.findElement(By.id("last-name")).sendKeys("ram");
    driver.findElement(By.id("user-name")).click();
    driver.findElement(By.id("user-name")).sendKeys("swadeshram");
    driver.findElement(By.id("user-name")).clear();
    driver.findElement(By.id("user-name")).sendKeys("swadeshram99");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("8099733440");
    driver.findElement(By.id("mobile")).clear();
    driver.findElement(By.id("mobile")).sendKeys("(118) 239-1000");
    new Select(driver.findElement(By.id("month"))).selectByVisibleText("April");
    new Select(driver.findElement(By.id("day"))).selectByVisibleText("11");
    new Select(driver.findElement(By.id("year"))).selectByVisibleText("2008");
    driver.findElement(By.id("male")).click();
    driver.findElement(By.xpath("//input[@value='Create account']")).click();
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
