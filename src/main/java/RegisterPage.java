import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;



public class RegisterPage {
    private static WebElement element;


   public static WebElement userInput(WebDriver driver) {
       element = driver.findElement(By.id("user_login"));
       return element;
   }


    public static WebElement passInput(WebDriver driver) {
        element = driver.findElement(By.id("user_password"));
        return element;
    }

    public static WebElement passConfirm(WebDriver driver) {
       element = driver.findElement(By.id("user_password_confirmation"));
       return element;
    }

    public static WebElement firstNameInput(WebDriver driver) {
       element = driver.findElement(By.id("user_firstname"));
       return element;
    }

    public static WebElement secondNameInput(WebDriver driver) {
        element = driver.findElement(By.id("user_lastname"));
        return element;
    }

    public static WebElement emailInput(WebDriver driver) {
        element = driver.findElement(By.id("user_mail"));
        return element;
    }

    public static WebElement selectLang(WebDriver driver) {
        element = driver.findElement(By.id("user_language"));
        return element;
    }

    public static WebElement ircNick(WebDriver driver) {
        element = driver.findElement(By.id("user_custom_field_values_3"));
        return element;
    }

    public static WebElement confirmButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("[name='commit']"));
        return element;
    }

    public static WebElement homeLink(WebDriver driver) {
        element = driver.findElement(By.className("home"));
        return element;
    }

    public static WebElement projectsLink(WebDriver driver) {
        element = driver.findElement(By.className("projects"));
        return element;
    }

    public static WebElement helpLink(WebDriver driver) {
        element = driver.findElement(By.className("help"));
        return element;
    }

    public static WebElement loginLink(WebDriver driver) {
        element = driver.findElement(By.className("login"));
        return element;
    }

    public static WebElement registerLink(WebDriver driver) {
        element = driver.findElement(By.className("register"));
        return element;
    }


    //WebElement passInput = driver.findElement(By.id("user_password"));
    //WebElement passConfirm = driver.findElement(By.id("user_password_confirmation"));
    //WebElement firstNameInput = driver.findElement(By.id("user_firstname"));
   // WebElement secondNameInput = driver.findElement(By.id("user_lastname"));
   // WebElement emailInput = driver.findElement(By.id("user_mail"));
    //WebElement selectLang = driver.findElement(By.id("user_language"));
   // WebElement ircNick = driver.findElement(By.id("user_custom_field_values_3"));
   // WebElement confirmButton = driver.findElement(By.cssSelector("[name='commit']"));
   // WebElement homeLink = driver.findElement(By.className("home"));
   // WebElement projectsLink = driver.findElement(By.cssSelector(".projects"));
   // WebElement helpLink = driver.findElement(By.className("help"));
   // WebElement loginLink = driver.findElement(By.className("login"));
   // WebElement registerLink = driver.findElement(By.className("register"));


}
