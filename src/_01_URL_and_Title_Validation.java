import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) {

        //Set up
        System.setProperty("wedriver.chrome.driver", "/Users/viktoriyalyabakh/IdeaProjects/MySelenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Validation
        driver.get("https://www.techglobalschool.com/");

        if("https://www.techglobalschool.com/".equals(driver.getCurrentUrl())) System.out.println("URL validation PASSED");
        else System.out.println(("URL validation FAILED"));

        if("SDET Bootcamp | TechGlobal".equals(driver.getTitle())) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");;


        //Teardown
        driver.quit();
    }
}
