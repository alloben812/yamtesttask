package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.PassportPage;
import pages.StartPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;
    protected static StartPage startPage;
    protected static PassportPage passportPage;
    protected static MainPage mainPage;

    @BeforeClass
    public static void initWebdriver() {
        driver = WebDriverSingleton.getWebDriverInstance();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @BeforeClass
    public static void initPages() {
        startPage = new StartPage(driver);
        passportPage = new PassportPage(driver);
        mainPage = new MainPage(driver);
    }

    protected Boolean waitWhenTextVisibleInTheWebElement(WebElement element, String text) {
        return (new WebDriverWait(driver, 4)).until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    @AfterClass
    public static void closeWebBrowser() {
        driver.close();
    }
}
