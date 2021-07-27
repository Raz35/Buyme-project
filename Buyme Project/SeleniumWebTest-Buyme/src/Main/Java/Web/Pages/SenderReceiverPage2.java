package Web.Pages;

import App.Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.Hashtable;

public class SenderReceiverPage2 extends BasePage {

    private final Hashtable<String, String> assertionCheck = new Hashtable<>();

    public void fillRequirements(){
        fillEmail();
        assertionPrep();
        pressPay();
        assertCheck();
    }

    private void fillEmail(){
        clickElement(By.cssSelector("svg[data-ember-action=\"2127\"]"));
        waitForElementVisibility(By.xpath("//input[@name=\"email\"]"),2);
        sendKeysToElement(By.xpath("//input[@name=\"email\"]"),"raz@gmail.com");
    }
    //no need because the site insert it automatically
    private void senderName(){
        sendKeysToElement(By.xpath("//input[@maxlength=\"25\"]"),"Raz");
    }

    private void assertionPrep() {
        assertionCheck.put("sender", getKeysFromElement(By.xpath("//input[@maxlength=\"25\"]")));
        assertionCheck.put("receiver", SenderReceiverPage1.getReceiver());
    }

    private void pressPay(){
        clickElement(By.id("ember2146"));
    }

    private void assertCheck(){
        Assert.assertEquals(assertionCheck.get("sender"),"רז ");
        Assert.assertEquals(assertionCheck.get("receiver"),"דנה");
    }
}
