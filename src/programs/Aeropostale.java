package programs;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aeropostale {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  
  @Test
  public void testUntitled2() throws Exception {
    driver.get(baseUrl + "/search?q=hollister&form=U270DF&pc=U270");
    driver.findElement(By.cssSelector("li.b_algo > h2 > a > strong")).click();
    driver.findElement(By.cssSelector("a.nav__utility-link.nav__utility-link--account")).click();
    driver.findElement(By.cssSelector("div.account-v2-inner.account-v2-inner--sign-in")).click();
    driver.findElement(By.linkText("Become a Member")).click();
    driver.findElement(By.id("create-account-form__input--firstname")).clear();
    driver.findElement(By.id("create-account-form__input--firstname")).sendKeys("subbu");
    driver.findElement(By.id("create-account-form__input--lastname")).clear();
    driver.findElement(By.id("create-account-form__input--lastname")).sendKeys("chunduru");
    driver.findElement(By.id("create-account-form__input--phone")).clear();
    driver.findElement(By.id("create-account-form__input--phone")).sendKeys("5182532657");
    driver.findElement(By.id("create-account-form__input--email")).clear();
    driver.findElement(By.id("create-account-form__input--email")).sendKeys("subbu.chunduru9@gmail.com");
    driver.findElement(By.id("create-account-form__input--password")).clear();
    driver.findElement(By.id("create-account-form__input--password")).sendKeys("Newosian@1234");
    driver.findElement(By.id("create-account-form__input--password2")).clear();
    driver.findElement(By.id("create-account-form__input--password2")).sendKeys("Newosian@1234");
    driver.findElement(By.id("optIn")).click();
  }


      }
