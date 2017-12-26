package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.*;


public class PassportPage extends BasePage{
    public PassportPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = LOGIN_FIELD)
    private WebElement loginField;
    @FindBy(css = PASSWORD_FIELD)
    private WebElement passwordField;
    @FindBy(css = SUBMIT_BUTTON)
    private WebElement submitButton;
    @FindBy(css = INCORRECT_PASSWORD)
    private WebElement incorrectPasswordIcon;

    public WebElement getIncorrectPasswordIcon() { return incorrectPasswordIcon; }
    public void fillLoginField(String login) { loginField.sendKeys(login); }
    public void fillPasswdField(String passwd) {
        passwordField.sendKeys(passwd);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }

}
