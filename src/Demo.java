import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/viktoriyalyabakh/IdeaProjects/MySelenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        String title = driver.getTitle();

        if(title.equals("Facebook - log in or sign up")){
            System.out.println("Title is validated");
        }
        else
            System.out.println("The title is wrong ");

        List<WebElement> footers = driver.findElements(By.cssSelector("#pageFooterChildren>ul>li"));
        ArrayList<String> elements = new ArrayList<>();

        for (WebElement f : footers) {
            elements.add(f.getText());
        }


        boolean allElementsMatched = true;

        for (int i = 0; i < footers.size(); i++) {
            if(!footers.get(i).getText().equals(elements.get(i))) {
                allElementsMatched = false;
                System.out.println("non matching element");
                break;
            }
        }

        if(allElementsMatched)
            System.out.println("everything is right");



        driver.quit();
    }
}
