import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) {

        /*
        Go to https://techglobal-training.netlify.app/
        Validate the company logo is displayed
         */

        System.setProperty("wedriver.chrome.driver", "/Users/viktoriyalyabakh/IdeaProjects/MySelenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://techglobal-training.netlify.app/");
        WebElement logo = driver.findElement(By.id("logo"));

        if(logo.isDisplayed()) System.out.println("Log validation PASSED");
        else System.out.println("Log validation FAILED");

        driver.quit();
    }
}
