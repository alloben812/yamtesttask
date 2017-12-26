package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.USER_FIRST_LETTER;
import static utils.Constants.USER_LOGOUT;
import static utils.Constants.USER_NAME;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(className = USER_NAME)
    private WebElement userName;
    @FindBy(css = USER_LOGOUT)
    private WebElement logout;
    @FindBy(className = USER_FIRST_LETTER)
    private WebElement userFirstLetter;

    public WebElement getUserFirstLetter() { return userFirstLetter; }
    public WebElement getUserName(){ return userName; }
    public void clickOnUserName(){ userName.click(); }
    public void clickOnLogout(){ logout.click(); }
}
