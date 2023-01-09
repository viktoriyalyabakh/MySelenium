package utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "/Users/viktoriyalyabakh/IdeaProjects/MySelenium/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }


    public static void quitDriver(){
        if(driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
