import Pages.PopUps;
import Pages.Tables;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TablesTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();

        String url = "https://practice-automation.com/tables/";
        driver.get(url);
    }

    @Test
    public void runTest() throws InterruptedException {
        Tables tableData = new Tables(driver);
        //tableData.simpleTable1();
        //tableData.sortableTable();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        tableData.VerifyRecord();
    }
}
