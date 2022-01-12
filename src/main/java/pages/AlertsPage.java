package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    private By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultField = By.id("result");

    public void triggerJsAlert(){
        driver.findElement(jsAlert).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void triggerJsConfirm(){
        driver.findElement(jsConfirm).click();
    }
    public void triggerJsPrompt(){
        driver.findElement(jsPrompt).click();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResultText(){
        return driver.findElement(resultField).getText();
    }

}
