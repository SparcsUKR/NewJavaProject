import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;

public class LinkCheck {
        WebDriver driver;

        @BeforeTest
        public void preConditions() {
            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.redmine.org/account/register");

        }

        @Test
            public void homeLinkCheck() {
                RegisterPage.homeLink(driver).click();
                assert driver.getCurrentUrl().equals("https://www.redmine.org/");
    }

        @Test
            public void projectsLinkCheck() {
                RegisterPage.projectsLink(driver).click();
                assert driver.getCurrentUrl().equals("https://www.redmine.org/projects");
    }

        @Test
            public void helpLinkCheck() {
                RegisterPage.helpLink(driver).click();
                assert driver.getCurrentUrl().equals("https://www.redmine.org/guide");
    }

        @Test
            public void loginLinkCheck() {
                RegisterPage.loginLink(driver).click();
                assert driver.getCurrentUrl().equals("https://www.redmine.org/login");
    }
        @Test
            public void registerLinkCheck() {
            RegisterPage.registerLink(driver).click();
            assert driver.getCurrentUrl().equals("https://www.redmine.org/account/register");

        }


        @AfterMethod
            public void afterTest() {
                driver.get("https://www.redmine.org/account/register");
    }

        @AfterTest
            public void closeDriver(){
            driver.close();
        }


}


