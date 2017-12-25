import org.junit.Test;
import utils.TestBase;

public class YandexMoneyAuthTests extends TestBase {
    @Test
    public void testLoginYamoney(){
        startPage.open();
        startPage.clickOnEnterButton();
        passportPage.fillLoginField("nazarenko.aristey");
        passportPage.fillPasswdField("DerParol777333");
        passportPage.clickSubmitButton();
        checkTextInWebElement(mainPage.getUserFirstLetter(),"n");
    }

    @Test
    public void testLogout(){
        mainPage.clickOnUserName();
        mainPage.clickOnLogout();
        checkTextInWebElement(startPage.getEnterButton(),"Войти");
    }
}
