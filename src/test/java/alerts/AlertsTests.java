package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void triggerJsAlertAndAcceptIt(){
        var alertPage = homePage.clickAlerts();
        alertPage.triggerJsAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResultText(), "You successfully clicked an alert");
    }
    @Test
    public void triggerJsAlertCheckTextAndDismiss(){
        var alertPage = homePage.clickAlerts();
        alertPage.triggerJsConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm","You successfully clicked an alert");
    }
    @Test
    public void triggerJsPromptCheckTextAndDismiss(){
        var alertPage = homePage.clickAlerts();
        alertPage.triggerJsPrompt();
        alertPage.alert_setInput("Hello World");
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResultText(), "You entered: Hello World");
    }
}
