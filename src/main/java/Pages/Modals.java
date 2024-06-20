package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Modals extends Calendars{
    public Modals(WebDriver driver) {
        super(driver);
    }

    By simple = By.id("simpleModal");
    By Form = By.id("formModal");
    By simpleCard = By.xpath("//*[@id=\"pum_popup_title_1318\"]");
    By simpleText = By.cssSelector("div[id=\"popmake-1318\"] div[class=\"pum-content popmake-content\"]");
    By close = By.cssSelector("div[id=\"popmake-1318\"] button[class=\"pum-close popmake-close\"]");
    By CardBody = By.cssSelector("div[id=\"popmake-674\"]");
    By namefield = By.cssSelector("input[id=\"g1051-name\"]");
    By Email = By.cssSelector("input[id=\"g1051-email\"]");
    By textarea = By.cssSelector("textarea[id=\"contact-form-comment-g1051-message\"]");
    By sUbmit = By.cssSelector("p[class=\"contact-submit\"] button[type=\"submit\"]");

    public void simpleModal(){
        driver.findElement(simple).click();
    }

    public void assertCard(){
        WebElement card = driver.findElement(simpleText);
        String cardContent = card.getText();
        System.out.println(cardContent);
        if(!"Simple Modal".equals(cardContent)){
          throw new AssertionError("invalid text");
       }
        driver.findElement(close).click();
    }
}
