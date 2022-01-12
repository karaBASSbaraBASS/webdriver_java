package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By KeysInputHeader = By.xpath("//div[contains(@class,'example')]/h3");
    private By KeysInputField = By.id("target");
    private By KeysResultField = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(KeysInputField).sendKeys(text);
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p")+"=3.14");
    }

    public String getResult(){
        return driver.findElement(KeysResultField).getText();
    }

    public String getResultInput(){
        return driver.findElement(KeysInputField).getText();
    }

}
