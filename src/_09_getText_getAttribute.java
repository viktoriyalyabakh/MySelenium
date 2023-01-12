import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;

public class _09_getText_getAttribute {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com/
        Scroll down to the bottom of the page

        Validate the Subscribe form
        Validate "Subscribe" heading2 with its text
        Validate "Stay up to date!" paragraph with its text
        Validate "Enter your first name" input box with its placeholder
        Validate "Enter your last name" input box with its placeholder
        Validate "Add your email" input box with its placeholder
        Validate "SUBSCRIBE" button with its text
         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement heading = driver.findElement(By.cssSelector("#comp-keehv7pd1>h2"));
        WebElement text = driver.findElement(By.cssSelector("#comp-keei0711 span"));

    }
}
