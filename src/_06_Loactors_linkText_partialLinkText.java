import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;
import utills.TechGlobalUtil;

public class _06_Loactors_linkText_partialLinkText {
    public static void main(String[] args) {
        try {
            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontendTesting();
            driver.findElement(By.id("card-1")).click();

            WebElement redApple = driver.findElement(By.linkText("Red Apple"));
            WebElement greenApple = driver.findElement(By.linkText("Green Apple"));
            WebElement pineapple = driver.findElement(By.linkText("Pineapple"));

            System.out.println(redApple.isDisplayed());
            System.out.println(redApple.isEnabled());
            System.out.println(redApple.getText());

            System.out.println(greenApple.isDisplayed());
            System.out.println(greenApple.isEnabled());
            System.out.println(greenApple.getText());

            System.out.println(pineapple.isDisplayed());
            System.out.println(pineapple.isEnabled());
            System.out.println(pineapple.getText());

        }catch (Exception ignored){}

        finally {
            Driver.quitDriver();
        }
    }
}
