import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utils.TestBase;

public class YandexMoneyAuthTests extends TestBase {
    @Test
    public void testLoginYamoney(){
        startPage.open();
        startPage.clickOnEnterButton();
        passportPage.fillLoginField("nazarenko.aristey");
        passportPage.fillPasswdField("DerParol777333");
        passportPage.clickSubmitButton();
        String userFirstLetter = driver.findElement(By.className("user__first-letter")).getText();
        System.out.println(userFirstLetter);
        Assert.assertEquals(userFirstLetter, "n");
    }

    @Test
    public void testLogout(){
        mainPage.clickOnUserName();
        mainPage.clickOnLogout();
        if(!waitWhenTextVisibleInTheWebElement(startPage.getEnterButton(),"Войти"))
            System.out.println("Что-то пошло не так и мы не дождались здесь нужного текста в элементе");
    }
}
