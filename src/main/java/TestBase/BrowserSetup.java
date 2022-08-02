package TestBase;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class BrowserSetup {
    public static WebDriver webDriver;
    public static Properties prop;

    public BrowserSetup(){
        try {
             prop = new Properties();
           // FileInputStream path = new FileInputStream(System.getProperty("user.dir")+"/src/config.properties");
            FileInputStream path = new FileInputStream("C://Users//nhyiebenh//Documents//Work-with-selenium-Java//src//config.properties");
          // FileInputStream path = new FileInputStream("src/config.properties");
            prop.load(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initializationDriver() {
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().maximize();
        webDriver.get(prop.getProperty("url")); //fix property file
        //   webDriver.get("https://elmir.ua/ua/");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public static void switchWindow() throws NoSuchWindowException {
        Set<String> handles = webDriver.getWindowHandles();
        String current = webDriver.getWindowHandle();
        if (handles.size() > 1) {
            handles.remove(current);
        }
        String newTab = handles.iterator().next();
        webDriver.switchTo().window(newTab);
    }
    public static void disableBrowser () {
        webDriver.quit();
    }

}
