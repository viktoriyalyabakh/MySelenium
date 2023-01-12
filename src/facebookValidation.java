import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.Driver;

public class facebookValidation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        try{
            WebElement logo = driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']"));
            WebElement heading2 = driver.findElement(By.cssSelector("h2[class='_8eso']"));
            WebElement emailPhoneNumberBox = driver.findElement(By.id("email"));
            WebElement passworBox = driver.findElement(By.id("passContainer"));
            WebElement logInButton = driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_5_')]"));
            WebElement forgotPasswordLink = driver.findElement(By.cssSelector("div[class='_6ltj']"));
            WebElement createNewAccountButton = driver.findElement(By.cssSelector("a[id*='u_0_0_']"));

            if(driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title validation is PASSED");
            else System.out.println("Title validation is FAILED");

            if(driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation is PASSED");
            else System.out.println("URL validation is FAILED");

            if(logo.isDisplayed()) System.out.println("Logo validation is PASSED");
            else System.out.println("Logo validation is FAILED");

            if(heading2.isDisplayed()) System.out.println("Heading validation is PASSED");
            else System.out.println("Heading validation is FAILED");

            if(emailPhoneNumberBox.isDisplayed()) System.out.println("Email box validation is PASSED");
            else System.out.println("Email box validation is FAILED");

            if(passworBox.isDisplayed()) System.out.println("Password box validation is PASSED");
            else System.out.println("Password box validation is FAILED");

            if(logInButton.isDisplayed()) System.out.println("Login button is displayed");
            else System.out.println("Login button is not displayed");

            if(logInButton.isEnabled()) System.out.println("Login button is clickable");
            else System.out.println("Login button is not clickable");

            if(forgotPasswordLink.isDisplayed()) System.out.println("Forgot password link validation is PASSED");
            else System.out.println("Forgot password link validation is FAILED");

            if(createNewAccountButton.isDisplayed()) System.out.println("Create new account button validation is PASSED");
            else System.out.println("Create new account button  validation is FAILED");


        }catch (Exception ignored){}

        finally {
            Driver.quitDriver();
        }
    }
}
