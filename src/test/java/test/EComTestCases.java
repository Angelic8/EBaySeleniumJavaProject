package test;

/*
  @author angel
 * @date 22 June 2021
 * @project ECommerce Selenium Java
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Homepage;

import java.util.HashMap;
import java.util.Map;

public class EComTestCases {

    // tool
    private static WebDriver driver;

    // pages
    protected static Homepage homepageObj;

    @BeforeTest
    public void setupTest(){

        // Push Notifications
        // 1 - Create a map to store preferences (Chrome)
        Map<String, Object> prefs = new HashMap<String, Object>();

        // 2- Add key and value to map as follow to switch off browser notification
        // Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 1);

        // 3- Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // 4 - Set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();

        // 5 - Now Pass ChromeOptions instance to ChromeDriver Constructor
        // To initialize chrome driver which will switch off this browser notification on the chrome browser
        driver = new ChromeDriver(options);

        // browser resolution
        driver.manage().window().maximize();

        String appURL = "https://www.ebay.com/";
        driver.get(appURL);
        driver.manage().deleteAllCookies();

        // set Homepage as the parent; this is the base page - child inherits the manual setter setWebDriver
        homepageObj = new Homepage();
        homepageObj.setDriver(driver);

    } // end setupTest()

    @Test(priority = 1)
    public void testHomepage(){
        homepageObj.viewHomepage();
    } // end testHomepage()

    @AfterTest
    public void quitBrowser() {
        driver.close();
        driver.quit();
    } // end method quitBrowser()

} // end EComTestCases
