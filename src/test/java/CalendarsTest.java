import Pages.Calendars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalendarsTest {

    WebDriver driver;
    @BeforeTest

    public void BeforeTest(){
        driver = new ChromeDriver();

        String url = "https://practice-automation.com/calendars/";

        driver.get(url);
    }

    @Test
    public void runTest(){
        Calendars selectDate = new Calendars(driver);
        selectDate.clickOnCalendar();
        selectDate.selectADate();
        selectDate.clickOnSubmitButton();
    }

//    @AfterTest
//    public void closeTest(){
//        driver.close();
//    }
}
