import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PassportPage;
import pages.StartPage;

import java.util.concurrent.TimeUnit;

public class YandexMoneyAuthTests {
    private static WebDriver driver = new ChromeDriver();
    private StartPage startPage = new StartPage(driver);
    private PassportPage passportPage = new PassportPage(driver);

    @Test
    public void testSuccesfullLogin(){
        driver.get("http://www.money.yandex.ru");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        startPage.clickOnEnterButton();
        passportPage.fillLoginField("nazarenko.aristey");
        passportPage.fillPasswdField("DerParol777333");
        passportPage.clickSubmitButton();
        String userFirstLetter = driver.findElement(By.className("user__first-letter")).getText();
        System.out.println(userFirstLetter);
        Assert.assertEquals(userFirstLetter, "n");
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
