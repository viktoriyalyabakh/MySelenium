import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;
import utills.TechGlobalUtil;

public class _05_Locators_tag_name {
    public static void main(String[] args) {

        try {
            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontendTesting();
            driver.findElement(By.id("card-1")).click();

            WebElement header = driver.findElement(By.id("main_heading"));

            if (header.isDisplayed()) System.out.println("Header display PASSED");
            else System.out.println("Header element is FAILD");

            if(header.getText().equals("Locators")) System.out.println("Header text PASSED");
            else System.out.println("Header text FAILD");

        }catch (Exception ignored){}
        finally {
            Driver.quitDriver();
        }


    }
}
