package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUps extends FormFields {


    public PopUps(WebDriver driver) {
        super(driver);
    }

    By popup1 = By.id("alert");
    By popup2 = By.id("prompt");
    By popup3 = By.id("confirm");
    By popMessage = By.xpath("//p[@id='confirmResult']");

    public void alertPopUp(){
        driver.findElement(popup1).click();

        //clicking on alert

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

        if (!"Hi there, pal!".equals(alertText)) {
            throw new AssertionError("Unexpected alert text: " + alertText);
        }
        alert.accept();
    }

    public void ConfirmPopUp(){
        driver.findElement(popup3).click();
        driver.switchTo().alert().accept();
    }

    public void PromptPopUp(){
        driver.findElement(popup2).click();
        Alert Alert = driver.switchTo().alert();
        Alert.sendKeys("Sarah");
        Alert.accept();

    }

    }





