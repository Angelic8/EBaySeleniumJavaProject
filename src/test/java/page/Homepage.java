package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    // tools
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static WebElement element;

    /*
    public void setWebDriver(WebDriver driver){
        Homepage.driver = driver;
    } // end manual setter setWebDriver
    */

    public static void setDriver(WebDriver driver) {
        Homepage.driver = driver;
    }

    By navMenu1_home = By.xpath("//span[contains(text(),'Home')]");
    By navMenu2_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[2]/a[1]");
    By navMenu3_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]");
    By navMenu4_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]");
    By navMenu5_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]");
    By navMenu6_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[6]/a[1]");
    By navMenu7_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[7]/a[1]");
    By navMenu8_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]");
    By navMenu9_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[9]/a[1]");
    By navMenu10_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[10]/a[1]");
    By navMenu11_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[11]/a[1]");
    By navMenu12_home = By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[12]/a[1]");

    public void viewHomepage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu1_home));
        String actualNavMenu = element.getText();
        System.out.println("Navigation menu 1: " + actualNavMenu);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu2_home));
        String actualNavMenu2 = element.getText();
        System.out.println("Navigation menu 2: " +actualNavMenu2);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu3_home));
        String actualNavMenu3 = element.getText();
        System.out.println("Navigation menu 3: " + actualNavMenu3);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu4_home));
        String actualNavMenu4 = element.getText();
        System.out.println("Navigation menu 4: " + actualNavMenu4);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu5_home));
        String actualNavMenu5 = element.getText();
        System.out.println("Navigation menu 5: " + actualNavMenu5);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu6_home));
        String actualNavMenu6 = element.getText();
        System.out.println("Navigation menu 6: " + actualNavMenu6);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu7_home));
        String actualNavMenu7 = element.getText();
        System.out.println("Navigation menu 7: " + actualNavMenu7);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu8_home));
        String actualNavMenu8 = element.getText();
        System.out.println("Navigation menu 8: " + actualNavMenu8);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu9_home));
        String actualNavMenu9 = element.getText();
        System.out.println("Navigation menu 9: " + actualNavMenu9);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu10_home));
        String actualNavMenu10 = element.getText();
        System.out.println("Navigation menu 10: " + actualNavMenu10);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu11_home));
        String actualNavMenu11 = element.getText();
        System.out.println("Navigation menu 11: " + actualNavMenu11);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu12_home));
        String actualNavMenu12 = element.getText();
        System.out.println("Navigation menu 12: " + actualNavMenu12);
    } // end viewHomepage()


} // end Homepage
