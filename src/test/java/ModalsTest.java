import Pages.Modals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ModalsTest {

    WebDriver driver;

    @BeforeTest

    public void beforeTest(){
        driver = new ChromeDriver();

        String url = "https://practice-automation.com/modals/";
        driver.get(url);
    }
    @Test
    public void runTest(){
        Modals modalTest = new Modals(driver);
        modalTest.simpleModal();
        modalTest.assertCard();
    }
}
