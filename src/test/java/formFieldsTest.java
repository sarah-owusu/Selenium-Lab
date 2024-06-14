import Pages.FormFields;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class formFieldsTest {
    WebDriver driver;
    @BeforeTest
    public void BeforeTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/form-fields/");
    }

    @Test
    public void Test() throws InterruptedException {
        FormFields forms = new FormFields(driver);
        forms.enterUserName();
        forms.selectDrink();
        forms.selectColour();
        forms.selectSiblings();
        forms.fastAnimals();
        forms.EnterEmail();
        forms.enterMessage();
        forms.clickSubmit();
    }

    @AfterTest
    public void Closs(){
        driver.close();
    }
}
