package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendars extends PopUps{
    public Calendars(WebDriver driver) {
        super(driver);
    }

    By Calendar = By.xpath("//input[@id='g1065-selectorenteradate']");
    By date = By.cssSelector("[data-date=\"21\"]");
    By send = By.cssSelector("div[class='entry-content'] button[type='submit']");
    By submit = By.cssSelector("p[class=\"contact-submit\"] button[class=\"pushbutton-wide\"]");

    public void clickOnCalendar(){
        driver.findElement(Calendar).click();
    }

    public void selectADate(){
        driver.findElement(date).click();
    }

    public void clickOnSubmitButton(){
        driver.findElement(submit).click();
    }
}
