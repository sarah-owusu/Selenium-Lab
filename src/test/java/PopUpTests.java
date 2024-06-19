import Pages.PopUps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUpTests {
    WebDriver driver;
    @BeforeTest
    public void beForeTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/popups/");

    }

    //creating an object for the method
    @Test
    public void runTest() {

        PopUps executeTest = new PopUps(driver);
        executeTest.alertPopUp();

        executeTest.ConfirmPopUp();
        executeTest.PromptPopUp();



    }
}
