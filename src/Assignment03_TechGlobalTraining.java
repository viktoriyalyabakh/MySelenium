import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;
import utills.TechGlobalUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment03_TechGlobalTraining {
    public static void main(String[] args) {
        /*
        TEST CASE 1
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Programming Languages list items below
        Java
        JavaScript
        C#
         */


        WebDriver driver = Driver.getDriver();
        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

        List<WebElement> plList = driver.findElements(By.xpath("(//ul)[2]/li"));
        String[] elemText = {"Java", "JavaScript", "C#"};

        for (int i = 0; i < plList.size(); i++) {
            System.out.println(plList.get(i).getText().equals(elemText[i]));
            System.out.println(plList.get(i).isDisplayed());
        }
        /*
        TEST CASE 2
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Automation Tools list items below
        Selenium WebDriver
        WebDriverIO
        Cypress
        Playwright
         */

        List<WebElement> atList = driver.findElements(By.xpath("(//ul)[3]/li"));

        for (WebElement webElement : atList) {
            System.out.println(webElement.getText());
            System.out.println(webElement.isDisplayed());
        }


       Driver.quitDriver();
    }
}
