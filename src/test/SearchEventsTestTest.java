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
public class SearchEventsTestTest {
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
  public void searchEventsTest() {
    // Test name: SearchEventsTest
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.meetup.com/");
    // 2 | setWindowSize | 1072x693 | 
    driver.manage().window().setSize(new Dimension(1072, 693));
    // 3 | click | xpath=//input[@id='search-keyword-input'] | 
    driver.findElement(By.xpath("//input[@id=\'search-keyword-input\']")).click();
    // 4 | type | xpath=//input[@id='search-keyword-input'] | games
    driver.findElement(By.xpath("//input[@id=\'search-keyword-input\']")).sendKeys("games");
    // 5 | click | xpath=//input[@id='location-typeahead-searchLocation'] | 
    driver.findElement(By.xpath("//input[@id=\'location-typeahead-searchLocation\']")).click();
    // 6 | type | xpath=//input[@id='location-typeahead-searchLocation'] | new york
    driver.findElement(By.xpath("//input[@id=\'location-typeahead-searchLocation\']")).sendKeys("new york");
    // 7 | click | xpath=//div[@id='page']/div[2]/main/div/div[4]/div/form/div[2]/input | 
    driver.findElement(By.xpath("//div[@id=\'page\']/div[2]/main/div/div[4]/div/form/div[2]/input")).click();
    // 8 | click | xpath=//a[@id='event-card-in-search-results']/div/div/div[2]/h2 | 
    driver.findElement(By.xpath("//a[@id=\'event-card-in-search-results\']/div/div/div[2]/h2")).click();
    // 9 | runScript | window.scrollTo(0,242.39999389648438) | 
    js.executeScript("window.scrollTo(0,242.39999389648438)");
    // 10 | click | xpath=//main[@id='main']/div[4]/div/div/div[2]/div/div[2]/div[2]/div/button/div/div[2] | 
    driver.findElement(By.xpath("//main[@id=\'main\']/div[4]/div/div/div[2]/div/div[2]/div[2]/div/button/div/div[2]")).click();
    // 11 | click | xpath=//div[@id='modal']/div/div/div/div/ul/li[5]/button/div/div[2] | 
    driver.findElement(By.xpath("//div[@id=\'modal\']/div/div/div/div/ul/li[5]/button/div/div[2]")).click();
    // 12 | click | css=.hidden > #close .injected-svg | 
    driver.findElement(By.cssSelector(".hidden > #close .injected-svg")).click();
  }
}
