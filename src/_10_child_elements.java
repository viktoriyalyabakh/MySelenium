import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;

import java.util.List;

public class _10_child_elements {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com/
        Validate the header items below
                HOME
        INTRO SESSION
        APPLY NOW
        COURSES
        CONTACT
        */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        List<WebElement> headerList = driver.findElements(By.cssSelector("#comp-kuiqjiulitemsContainer a"));

        for (WebElement webElement : headerList) {
            System.out.println(webElement.getText());
            System.out.println(webElement.isDisplayed());
            System.out.println(webElement.isEnabled());
        }




        Driver.quitDriver();
    }
}
