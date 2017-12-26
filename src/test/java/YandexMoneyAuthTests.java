import org.junit.Test;
import utils.TestBase;

public class YandexMoneyAuthTests extends TestBase {
    @Test
    public void testALoginYamoney(){
        startPage.open();
        startPage.clickOnEnterButton();
        passportPage.fillLoginField("nazarenko.aristey");
        passportPage.fillPasswdField("DerParol777333");
        passportPage.clickSubmitButton();
        checkTextInWebElement(mainPage.getUserFirstLetter(),"n");
    };

    @Test
    public void testBLogout(){
        checkWebElementIsVisible(mainPage.getUserName());
        mainPage.clickOnUserName();
        mainPage.clickOnLogout();
        checkTextInWebElement(startPage.getEnterButton(),"Log in");
        checkTextInWebElement(startPage.getAddMoneyNote(), "Add money to a Wallet");
    }

    @Test
    public void testCBadPasswordAndGoodLogin(){
        startPage.open();
        startPage.clickOnEnterButton();
        passportPage.fillLoginField("nazarenko.aristey");
        passportPage.fillPasswdField("DerParol");
        passportPage.clickSubmitButton();
        checkTextInWebElement(passportPage.getIncorrectPasswordIcon(),"Incorrect password");
    }

    @Test
    public void testDBadLogin(){

    }
}
