package TestBase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static TestBase.BrowserSetup.*;

public class TestsSetup {
    @BeforeTest
    public void beforeTest() {
        initializationDriver();
    }

    @AfterTest
    public void afterTest() {
        switchWindow();
    }

    @AfterSuite
    public void endOfTests() {
        disableBrowser();
    }
}
