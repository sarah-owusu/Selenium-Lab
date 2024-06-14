package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormFields {
    WebDriver driver ;
    private final WebDriverWait wait;

    public FormFields(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    By namefield = By.id("name");
    By favoriteDrink = By.id("drink1");
    By Color = By.id("color1");

    By siblings = By.id("siblings");
    By fastAnimal = By.xpath("//*[@id=\"feedbackForm\"]/ul/li[1]");
    By myEmail = By.id("email");
    By myMessage = By.name("message");
    By submit = By.xpath("//button[@id=\"submit-btn\"]");
    public void enterUserName(){
        driver.findElement(namefield).sendKeys("John");
    }
    public void selectDrink(){
        driver.findElement(favoriteDrink).click();
    }
    public void selectColour(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Color));
        WebElement target = driver.findElement(Color);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", target);
        wait.until(ExpectedConditions.elementToBeClickable(target));
        target.isSelected();
    }

    public void selectSiblings(){
        Select dropDown = new Select(driver.findElement(siblings));
        dropDown.selectByVisibleText("Yes");
    }
    public void fastAnimals(){
        WebElement myFasrAnimal = driver.findElement(fastAnimal);
        System.out.println(myFasrAnimal.getText());
    }

    public void EnterEmail(){
        driver.findElement(myEmail).sendKeys("me2@gmail.cwom");
    }

    public void enterMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(myMessage));
        WebElement message = driver.findElement(myMessage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", message);
        message.sendKeys("Hey there, my name is Sarah");
    }

    public  void clickSubmit() throws InterruptedException {

        WebElement send = driver.findElement(submit);
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        send.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

}
