package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.*;

public class StartPage extends BasePage{
    public StartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = START_LOGIN_BUTTON)
    private WebElement enterButton;

    @FindBy(css = START_ADD_MONEY)
    private WebElement addMoneyNote;

    @FindBy(css = START_LOGIN_BUTTON_TEXT)
    private WebElement loginBtnText;

    public WebElement getLoginBtnText(){ return loginBtnText; }
    public WebElement getAddMoneyNote(){ return addMoneyNote;}
    public WebElement getEnterButton(){
        return enterButton;
    }
    public void clickOnEnterButton(){
        enterButton.click();
    }
    public void open(){ driver.get(ENDPOINT); }
}
