package utils;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.PassportPage;
import pages.StartPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected static StartPage startPage;
    protected static PassportPage passportPage;
    protected static MainPage mainPage;
    @BeforeClass
    public static void initWebdriver(WebDriverSingleton driver) {
        driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @BeforeClass
    public static void initPages() {
        startPage = new StartPage(driver);
        passportPage = new PassportPage(driver);
        mainPage = new MainPage(driver);
    }

    protected Boolean waitWhenTextVisibleInTheWebElement(WebElement element, String text) {
        return (new WebDriverWait(driver.getDriver(), 4)).until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    protected void checkTextInWebElement(WebElement element, String text){
        if(!waitWhenTextVisibleInTheWebElement(element,text)){
            //TODO: добавить логгинг иначе криво все!
            System.out.println("Что пошло не так, и мы не нашли в элементе --ПОДУМАЙ КАК ЭТО СДЕЛАТЬ-- текста --И ЭТО ТОЖЕ--");
            Assert False;
        }
    }

    @AfterClass
    public static void closeWebBrowser() {
        WebDriverSingleton.closeWebBrowser();
    }
}
