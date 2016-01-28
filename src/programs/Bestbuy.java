package programs;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
#Subbu changed
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bestbuy {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.bestbuy.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBestbuy() throws Exception {
    driver.get(baseUrl + "https://www-ssl.bestbuy.com/identity/newAccount?token=s0aXMHa1sEwYaIcmurFQxlpk280FBCITeGV6cAYg82r7QmQXe7trxSfWOn681HpNrsKexL2G%2F2gZDjwGev%2BCxLCL%2FmcBhbiWERf7%2FG%2FoplCj6qDsF2apAMxuZ3LsAkdVEPAaQmAEhjzJl%2B9VcnZlS2OxJYEkRBkn4%2BsMRi32WhRmlCpAlzHuUNeOQkklKck4i%2FvFUmbZ4Kh2qq431iyjeU9je72vb0NvIUKYbp%2FYPRIsTemeCWK%2Bmguga550O7iquc3HG5iCK%2Ffk2rz3fZxi%2BQ%3D%3D");
    driver.findElement(By.cssSelector("span.account")).click();
    driver.findElement(By.id("fld-firstName")).clear();
    driver.findElement(By.id("fld-firstName")).sendKeys("system");
    driver.findElement(By.id("fld-lastName")).clear();
    driver.findElement(By.id("fld-lastName")).sendKeys("touch");
    driver.findElement(By.id("fld-e")).clear();
    driver.findElement(By.id("fld-e")).sendKeys("systemtouch99@gmail.com");
    driver.findElement(By.id("fld-p1")).clear();
    driver.findElement(By.id("fld-p1")).sendKeys("Newosian@1234");
    driver.findElement(By.id("fld-p2")).clear();
    driver.findElement(By.id("fld-p2")).sendKeys("Newosian@1234");
    assertEquals("Create an Account", driver.getTitle());
  }
  @Test
  public void testAmerican() throws Exception {
    driver.get(baseUrl + "/site/store-locator");
    driver.manage().window().maximize();
    driver.findElement(By.id("zip")).sendKeys("07029");
    driver.findElement(By.id("city")).sendKeys("Harrison");
    driver.findElement(By.id("state")).sendKeys("NJ – New Jersey");
    String testUrl1 = driver.getCurrentUrl();
	   System.out.println(testUrl1);
	   String x = driver.findElement(By.xpath(".//*[@id='search-section']/div[1]/h1")).getText();
	   assertEquals("Find a Best Buy Store",x);
	   System.out.println(x);
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
