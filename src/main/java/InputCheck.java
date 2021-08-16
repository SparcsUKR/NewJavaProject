import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class InputCheck {
    WebDriver driver;

        public void takeScreenshot(String filename) throws IOException {
            TakesScreenshot ts =(TakesScreenshot)driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File trg = new File("./screenshot" + filename +".png");
            FileHandler.copy(src,trg);
        }



    @BeforeMethod
        public void preConditions() {
            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.redmine.org/account/register");


    }

    @Test
        public void userInputCheck() throws IOException {
            RegisterPage.userInput(driver).sendKeys("DADA");
            assert RegisterPage.userInput(driver).getAttribute("value").equals("DADA");
            takeScreenshot("userinputSCR");


        }


    @Test
        public void passInputCheck() throws IOException {
            RegisterPage.userInput(driver).sendKeys("pass");
            assert RegisterPage.passInput(driver).getAttribute("value").equals("pass");
            takeScreenshot("passinputSCR");


    }


    @Test
        public void passConfirmCheck() throws IOException {
            RegisterPage.userInput(driver).sendKeys("pass");
            assert RegisterPage.passConfirm(driver).getAttribute("value").equals("pass");
            takeScreenshot("passConfirmSCR");


    }

    @Test
        public void firstNameInputCheck() throws IOException {
            RegisterPage.userInput(driver).sendKeys("first name");
            assert RegisterPage.firstNameInput(driver).getAttribute("value").equals("first name");
            takeScreenshot("firstNameInputSCR");


    }

    @Test
        public void secondNameInputCheck() throws IOException {
            RegisterPage.userInput(driver).sendKeys("second name");
            assert RegisterPage.secondNameInput(driver).getAttribute("value").equals("second name");
            takeScreenshot("secondNameInputSCR");


    }

    @Test
        public void emailInputCheck() throws IOException {
            RegisterPage.userInput(driver).sendKeys("email@dot.com");
            assert RegisterPage.emailInput(driver).getAttribute("value").equals("email@dot.com");
            takeScreenshot("emailInputSCR");


    }

    @Test
        public void langChoice() throws IOException {
            RegisterPage.selectLang(driver).sendKeys("Deutsch");
            takeScreenshot("langChoice");


    }

    @Test
        public void ircNickInputCheck() throws IOException {
            RegisterPage.ircNick(driver).sendKeys("IRC nick");
            assert RegisterPage.emailInput(driver).getAttribute("value").equals("IRC nick");
            takeScreenshot("IRCnickInputSCR");


    }




    @AfterMethod
        public void driverClose() {
            driver.quit();
    }
}


