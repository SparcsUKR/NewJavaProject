import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.poi.ss.formula.functions.Columns;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCheck {
    WebDriver driver;


    @BeforeMethod
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.redmine.org/account/register");
    }

    @DataProvider(name = "test_data")
    public Object[][] getDataFromExcelUsingFillo() {
        try {
            Fillo fillo = new Fillo();
            Object[][] object = null;
            Connection connection = fillo.getConnection("E:\\JavaProjects\\src\\main\\resources\\TestData.xls");
            Recordset recordset = connection.executeQuery("SELECT * FROM Sheet1");
            int numberOfRows = recordset.getCount();
            int numberOfColumns = recordset.getFieldNames().size();
            System.out.println("Size: " + numberOfRows + numberOfColumns);
            int i = 0;
            int c = 0;
            object = new Object[numberOfRows][numberOfColumns];
            while (recordset.next()) {
                object[i][c] = recordset.getField("Login") + ", " + recordset.getField("Password");
                System.out.println(object[i][c] + " " + i + c);
                i++;
                c++;
            }
            recordset.close();
            connection.close();
            return object;
        } catch (FilloException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }








    @Test(dataProvider = "test_data")
        public void loginTest(String userName, String password) { //String password, String confPassword, String firstName, String secondName, String emailName, String language) {
        RegisterPage.userInput(driver).sendKeys(userName);
        RegisterPage.passInput(driver).sendKeys(password);
       // RegisterPage.passConfirm(driver).sendKeys(confPassword);
       // RegisterPage.firstNameInput(driver).sendKeys(firstName);
       // RegisterPage.secondNameInput(driver).sendKeys(secondName);
       // RegisterPage.emailInput(driver).sendKeys(emailName);
       // RegisterPage.selectLang(driver).sendKeys(language);

    }







}

