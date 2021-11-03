package Base;

import Constants.TestConstants;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class BaseTest {
    static WebDriver webDriver=null;
     @Before
    public void setUp(){
         System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
          webDriver = new ChromeDriver();
         webDriver.manage().window().maximize();

         // https://www.lcwaikiki.com/tr-TR/TR sitesi açılır.
         webDriver.get(TestConstants.link);

         //Ana sayfanın acildigi kontrol edilir.
         assertEquals(TestConstants.link, "https://www.lcwaikiki.com/tr-TR/TR");
     }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }
    public void tearDown(){
         getWebDriver().quit();
    }
}
