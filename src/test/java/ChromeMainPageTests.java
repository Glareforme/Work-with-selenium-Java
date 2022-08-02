import TestBase.TestsSetup;
import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.Methods.*;


public class ChromeMainPageTests extends TestsSetup {
    @Test
    public void checkSearchInputField() {
        MainPageMeth.inputToSearchField();
        MainPageMeth.clickSubmitButtonToSearch();
        Assert.assertTrue(MainPageMeth.correctSearchResult());
    }
}
