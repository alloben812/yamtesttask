import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YandexMoneyAuthTests {
    static WebDriver driver = new ChromeDriver();

    @Test
    public void testLoginYamoney(){
        driver.get("http://www.money.yandex.ru");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement enterButton = driver.findElement(By.cssSelector("a.button"));
        enterButton.click();

        WebElement login = driver.findElement(By.cssSelector("[name=login]"));
        login.sendKeys("nazarenko.aristey");
        WebElement password = driver.findElement(By.cssSelector("[name=passwd]"));
        password.sendKeys("DerParol777333");

        WebElement enterPassport = driver.findElement(By.cssSelector("[type=submit]"));
        enterPassport.click();

        String userFirstLetter = driver.findElement(By.className("user__first-letter")).getText();
        System.out.println(userFirstLetter);
        Assert.assertEquals(userFirstLetter, "n");
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
