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
public class LoginTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

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
  public void loginTest() {
    // Test name: LoginTest
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.meetup.com/");
    // 2 | setWindowSize | 1051x798 | 
    driver.manage().window().setSize(new Dimension(1051, 798));
    // 3 | click | id=login-link | 
    driver.findElement(By.id("login-link")).click();
    // 4 | type | id=email | anna_ershova.2002@mail.ru
    driver.findElement(By.id("email")).sendKeys("anna_ershova.2002@mail.ru");
    // 5 | click | id=current-password | 
    driver.findElement(By.id("current-password")).click();
    // 6 | type | id=current-password | Sosiska170808
    driver.findElement(By.id("current-password")).sendKeys("Sosiska170808");
    // 7 | type | id=current-password | Sosiska170808
    driver.findElement(By.id("current-password")).sendKeys("Sosiska170808");
    // 8 | click | css=.mr-2 > .block | 
    driver.findElement(By.cssSelector(".mr-2 > .block")).click();
    // 9 | click | css=.fill-current:nth-child(3) | 
    driver.findElement(By.cssSelector(".fill-current:nth-child(3)")).click();
    // 10 | click | css=.mr-2 > .block | 
    driver.findElement(By.cssSelector(".mr-2 > .block")).click();
    // 11 | click | name=submitButton | 
    driver.findElement(By.name("submitButton")).click();
    // 12 | click | css=.DayPicker-NavButton--prev | 
    driver.findElement(By.cssSelector(".DayPicker-NavButton--prev")).click();
    // 13 | click | css=.DayPicker-NavButton--next | 
    driver.findElement(By.cssSelector(".DayPicker-NavButton--next")).click();
    // 14 | click | css=.DayPicker-NavButton--next | 
    driver.findElement(By.cssSelector(".DayPicker-NavButton--next")).click();
    // 15 | click | css=.DayPicker-NavButton--prev | 
    driver.findElement(By.cssSelector(".DayPicker-NavButton--prev")).click();
    // 16 | click | css=.DayPicker-Week:nth-child(2) > .DayPicker-Day:nth-child(4) | 
    driver.findElement(By.cssSelector(".DayPicker-Week:nth-child(2) > .DayPicker-Day:nth-child(4)")).click();
    // 17 | click | css=.DayPicker-Week:nth-child(4) > .DayPicker-Day:nth-child(4) | 
    driver.findElement(By.cssSelector(".DayPicker-Week:nth-child(4) > .DayPicker-Day:nth-child(4)")).click();
    // 18 | click | css=.DayPicker-Day--today | 
    driver.findElement(By.cssSelector(".DayPicker-Day--today")).click();
    // 19 | runScript | window.scrollTo(0,168.8000030517578) | 
    js.executeScript("window.scrollTo(0,168.8000030517578)");
    // 20 | click | linkText=Показать все | 
    driver.findElement(By.linkText("Показать все")).click();
    // 21 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 22 | click | css=.hidden > .hidden .rounded-lg > .cursor-pointer:nth-child(2) | 
    driver.findElement(By.cssSelector(".hidden > .hidden .rounded-lg > .cursor-pointer:nth-child(2)")).click();
    // 23 | click | css=.hidden > .hidden .cursor-pointer:nth-child(3) | 
    driver.findElement(By.cssSelector(".hidden > .hidden .cursor-pointer:nth-child(3)")).click();
    // 24 | click | css=.hidden > .hidden .cursor-pointer:nth-child(4) | 
    driver.findElement(By.cssSelector(".hidden > .hidden .cursor-pointer:nth-child(4)")).click();
    // 25 | click | css=.hover\3Ano-underline > img | 
    driver.findElement(By.cssSelector(".hover\\3Ano-underline > img")).click();
    // 26 | runScript | window.scrollTo(0,251.1999969482422) | 
    js.executeScript("window.scrollTo(0,251.1999969482422)");
    // 27 | runScript | window.scrollTo(0,251.1999969482422) | 
    js.executeScript("window.scrollTo(0,251.1999969482422)");
    // 28 | runScript | window.scrollTo(0,412) | 
    js.executeScript("window.scrollTo(0,412)");
    // 29 | click | linkText=See all your groups | 
    driver.findElement(By.linkText("See all your groups")).click();
    // 30 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 31 | click | css=.hover\3Ano-underline > img | 
    driver.findElement(By.cssSelector(".hover\\3Ano-underline > img")).click();
    // 32 | runScript | window.scrollTo(0,260.79998779296875) | 
    js.executeScript("window.scrollTo(0,260.79998779296875)");
    // 33 | runScript | window.scrollTo(0,731.2000122070312) | 
    js.executeScript("window.scrollTo(0,731.2000122070312)");
    // 34 | click | linkText=See all your interests | 
    driver.findElement(By.linkText("See all your interests")).click();
    // 35 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 36 | click | css=.mb-4:nth-child(5) > #add-btn .injected-svg | 
    driver.findElement(By.cssSelector(".mb-4:nth-child(5) > #add-btn .injected-svg")).click();
    // 37 | click | id=submit | 
    driver.findElement(By.id("submit")).click();
    // 38 | click | css=.mb-4:nth-child(18) > #remove-btn .injected-svg | 
    driver.findElement(By.cssSelector(".mb-4:nth-child(18) > #remove-btn .injected-svg")).click();
    // 39 | click | id=submit | 
    driver.findElement(By.id("submit")).click();
    // 40 | click | css=g > path:nth-child(2) | 
    driver.findElement(By.cssSelector("g > path:nth-child(2)")).click();
    // 41 | click | id=main | 
    driver.findElement(By.id("main")).click();
    // 42 | click | css=.flex:nth-child(1) > li:nth-child(1) .hidden | 
    driver.findElement(By.cssSelector(".flex:nth-child(1) > li:nth-child(1) .hidden")).click();
    // 43 | click | css=.flex:nth-child(1) > li:nth-child(2) .hidden | 
    driver.findElement(By.cssSelector(".flex:nth-child(1) > li:nth-child(2) .hidden")).click();
    // 44 | click | css=li:nth-child(3) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(3) .hidden")).click();
    // 45 | click | css=li:nth-child(4) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(4) .hidden")).click();
    // 46 | click | css=li:nth-child(5) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(5) .hidden")).click();
    // 47 | click | css=li:nth-child(6) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(6) .hidden")).click();
    // 48 | click | css=li:nth-child(7) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(7) .hidden")).click();
    // 49 | click | css=li:nth-child(8) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(8) .hidden")).click();
    // 50 | click | css=li:nth-child(9) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(9) .hidden")).click();
    // 51 | click | css=li:nth-child(10) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(10) .hidden")).click();
    // 52 | click | css=li:nth-child(11) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(11) .hidden")).click();
    // 53 | click | css=li:nth-child(12) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(12) .hidden")).click();
    // 54 | click | css=li:nth-child(13) .hidden | 
    driver.findElement(By.cssSelector("li:nth-child(13) .hidden")).click();
    // 55 | click | css=.mt-5 > li:nth-child(1) .hidden | 
    driver.findElement(By.cssSelector(".mt-5 > li:nth-child(1) .hidden")).click();
    // 56 | click | css=.fill-current .injected-svg | 
    driver.findElement(By.cssSelector(".fill-current .injected-svg")).click();
    // 57 | click | id=personal-events-link | 
    driver.findElement(By.id("personal-events-link")).click();
    // 58 | click | css=.hover\3Ano-underline > img | 
    driver.findElement(By.cssSelector(".hover\\3Ano-underline > img")).click();
    // 59 | click | css=.mb-10:nth-child(1) .flex > .flex > .overflow-hidden | 
    driver.findElement(By.cssSelector(".mb-10:nth-child(1) .flex > .flex > .overflow-hidden")).click();
    // 60 | runScript | window.scrollTo(0,172) | 
    js.executeScript("window.scrollTo(0,172)");
    // 61 | runScript | window.scrollTo(0,244.8000030517578) | 
    js.executeScript("window.scrollTo(0,244.8000030517578)");
    // 62 | click | css=.ml-5 > .text-viridian | 
    driver.findElement(By.cssSelector(".ml-5 > .text-viridian")).click();
    // 63 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 64 | runScript | window.scrollTo(0,172) | 
    js.executeScript("window.scrollTo(0,172)");
    // 65 | click | css=.avatar--medium .svg | 
    driver.findElement(By.cssSelector(".avatar--medium .svg")).click();
    // 66 | click | linkText=Log out | 
    driver.findElement(By.linkText("Log out")).click();
  }
}
