package PageObjects.Locators;

import org.openqa.selenium.By;

public class MainPageLoc {
    static public By inputField = By.id("q");
    static public By submitButton = By.id("find");
    static public By searchResult = By.xpath("//h1[@id='page-title'][contains(text(),'Результати пошуку за запитом «dsa»')]");
}
