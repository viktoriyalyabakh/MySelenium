import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;
import utills.Waiter;

public class _04_Locators_className_name {
    public static void main(String[] args) {
        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Locators" card
        Validate the "Kiwi", "Orange" and "Grapes" items are displayed
         */

        //Set up
        try {
            WebDriver driver = Driver.getDriver();

            //validation
            driver.get("https://techglobal-training.netlify.app/");

            driver.findElement(By.id("dropdown-button")).click();

            driver.findElement(By.id("frontend-option")).click();

            driver.findElement(By.id("card-1")).click();

            Waiter.pause(3);
            WebElement kiwiElement = driver.findElement(By.id("item_kiwi"));
            WebElement orangeElement = driver.findElement(By.name("item_orange"));
            WebElement grapeElement = driver.findElement(By.className("item_grapes"));

            if(kiwiElement.isDisplayed()) System.out.println("Kiwi element is PASSED");
            else  System.out.println("Kiwi element is FAILD");

            if(orangeElement.isDisplayed()) System.out.println("Orange element is PASSED");
            else  System.out.println("Orange element is FAILD");

            if(grapeElement.isDisplayed()) System.out.println("Grape element is PASSED");
            else  System.out.println("Orange element is FAILD");



        }catch (Exception ignored){}

        //Teardown
        finally {
            Driver.quitDriver();
        }


    }
}
