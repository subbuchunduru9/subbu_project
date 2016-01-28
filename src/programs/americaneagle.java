package programs;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class americaneagle {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.americaneagle.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAmerican() throws Exception {
    driver.get(baseUrl + "/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath(".//*[@id='mainNav']/ul/li[1]/div/a/span")).click();
    driver.findElement(By.linkText("About Us")).click();
    driver.findElement(By.xpath("//nav[@id='mainNav']/ul/li[3]/div/a/span")).click();
    driver.findElement(By.xpath("//nav[@id='mainNav']/ul/li[2]/div/a/span")).click(); 
    driver.findElement(By.cssSelector("span.menuText")).click();
   
  }
  @Test
  public void testorderStatus() throws Exception {
	  driver.get(baseUrl+ "/contact/chicago");
      driver.manage().window().maximize();
      driver.findElement(By.id("Content_TC6393BD9011_tbName")).sendKeys("rahul");
      driver.findElement(By.id("Content_TC6393BD9011_tbCompany")).sendKeys("AmericanEagle");
      driver.findElement(By.id("Content_TC6393BD9011_tbPhone")).sendKeys("5182532657");
      driver.findElement(By.id("Content_TC6393BD9011_tbEmail")).sendKeys("rahulpromod44");
      driver.findElement(By.id("Content_TC6393BD9011_tbEmail")).sendKeys("rahulpromod44");
      driver.get("http://www.selenium.com/");
	   String testUrl = driver.getCurrentUrl();
	    assertEquals("http://www.selenium.com/", testUrl);
	    System.out.println(testUrl);
	    String x = driver.findElement(By.xpath(".//*[@id='Content_TC6393BD9004_Col00']/div[1]/h5")).getText();
		   assertEquals("Let's get started today!",x);
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
