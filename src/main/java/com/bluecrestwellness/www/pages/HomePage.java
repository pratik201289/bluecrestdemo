package com.bluecrestwellness.www.pages;

import com.bluecrestwellness.www.browserfactory.ManageBrowser;
import com.bluecrestwellness.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @CacheLookup
    @FindBy(id="onetrust-accept-btn-handler")
    WebElement acceptBtn;

    public void clickOnAcceptBtn() throws InterruptedException {
        Reporter.log("Clicking on Accept link " + acceptBtn.getText() + "<br>");
        clickOnElement(acceptBtn);
        log.info("Click on Accept Cookies : " + acceptBtn.toString());
        Thread.sleep(2000);
    }
}
