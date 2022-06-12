package PageObjects.Methods;

import PageObjects.Locators.MainPageLoc;
import TestBase.BrowserSetup;
import org.openqa.selenium.support.PageFactory;

public class MainPageMeth extends BrowserSetup {
    public MainPageMeth() {
        PageFactory.initElements(webDriver, this);
    }

    public static void inputToSearchField() {
        webDriver.findElement(MainPageLoc.inputField).sendKeys("dsa");
    }

    public static void clickSubmitButtonToSearch() {
        webDriver.findElement(MainPageLoc.submitButton).click();
    }

    public static boolean correctSearchResult() {
        if (webDriver.findElement(MainPageLoc.searchResult).isDisplayed())
            return true;
        return false;
    }
}
