// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FilterGroupsTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void filterGroupsTest() {
    // Test name: FilterGroupsTest
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.meetup.com/");
    // 2 | setWindowSize | 1072x693 | 
    driver.manage().window().setSize(new Dimension(1072, 693));
    // 3 | runScript | window.scrollTo(0,828) | 
    js.executeScript("window.scrollTo(0,828)");
    // 4 | click | id=search-keyword-input | 
    driver.findElement(By.id("search-keyword-input")).click();
    // 5 | type | id=search-keyword-input | games
    driver.findElement(By.id("search-keyword-input")).sendKeys("games");
    // 6 | click | id=location-typeahead-searchLocation | 
    driver.findElement(By.id("location-typeahead-searchLocation")).click();
    // 7 | type | id=location-typeahead-searchLocation | new york
    driver.findElement(By.id("location-typeahead-searchLocation")).sendKeys("new york");
    // 8 | click | css=.h-12 | 
    driver.findElement(By.cssSelector(".h-12")).click();
    // 9 | click | id=find-groups-tab | 
    driver.findElement(By.id("find-groups-tab")).click();
    // 10 | mouseOver | id=event-distance-filter-drop-down | 
    {
      WebElement element = driver.findElement(By.id("event-distance-filter-drop-down"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 11 | click | id=event-distance-filter-drop-down | 
    driver.findElement(By.id("event-distance-filter-drop-down")).click();
    // 12 | mouseOut | id=event-distance-filter-drop-down | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 13 | click | id=event-distance-25-miles-option | 
    driver.findElement(By.id("event-distance-25-miles-option")).click();
    // 14 | mouseOver | id=event-distance-filter-drop-down | 
    {
      WebElement element = driver.findElement(By.id("event-distance-filter-drop-down"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 15 | mouseOut | id=event-distance-filter-drop-down | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 16 | click | id=event-distance-filter-drop-down | 
    driver.findElement(By.id("event-distance-filter-drop-down")).click();
    // 17 | click | id=event-distance-50-miles-option | 
    driver.findElement(By.id("event-distance-50-miles-option")).click();
    // 18 | click | id=category-filter-drop-down | 
    driver.findElement(By.id("category-filter-drop-down")).click();
    // 19 | click | id=metacategory-games-option | 
    driver.findElement(By.id("metacategory-games-option")).click();
    // 20 | mouseOver | css=div:nth-child(1) > .text-viridian | 
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(1) > .text-viridian"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 21 | mouseOut | css=div:nth-child(1) > .text-viridian | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 22 | mouseOver | css=.gl\3Awhitespace-nowrap | 
    {
      WebElement element = driver.findElement(By.cssSelector(".gl\\3Awhitespace-nowrap"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 23 | click | css=.gl\3Awhitespace-nowrap | 
    driver.findElement(By.cssSelector(".gl\\3Awhitespace-nowrap")).click();
    // 24 | mouseOut | css=.gl\3Awhitespace-nowrap | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 25 | click | id=event-distance-filter-drop-down | 
    driver.findElement(By.id("event-distance-filter-drop-down")).click();
    // 26 | click | id=event-distance-2-miles-option | 
    driver.findElement(By.id("event-distance-2-miles-option")).click();
    // 27 | click | id=category-filter-drop-down | 
    driver.findElement(By.id("category-filter-drop-down")).click();
    // 28 | mouseOver | id=category-filter-drop-down | 
    {
      WebElement element = driver.findElement(By.id("category-filter-drop-down"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 29 | mouseOut | id=category-filter-drop-down | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 30 | click | id=metacategory-arts-culture-option | 
    driver.findElement(By.id("metacategory-arts-culture-option")).click();
    // 31 | mouseOver | css=.gl\3Awhitespace-nowrap | 
    {
      WebElement element = driver.findElement(By.cssSelector(".gl\\3Awhitespace-nowrap"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 32 | click | css=.gl\3Awhitespace-nowrap | 
    driver.findElement(By.cssSelector(".gl\\3Awhitespace-nowrap")).click();
    // 33 | mouseOut | css=.gl\3Awhitespace-nowrap | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
