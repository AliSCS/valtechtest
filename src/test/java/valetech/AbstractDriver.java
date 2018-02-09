package valetech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ali on 09/02/2018.
 */
public class AbstractDriver {
    static WebDriver driver;

    public WebDriver getDriver(){
        if(driver==null){
//            System.setProperty("webdriver.gecko.driver","C:\\Selenium\\selenium3\\Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return  driver;
    }

    public static void closeDriver(){
        driver.close();
    }


}
