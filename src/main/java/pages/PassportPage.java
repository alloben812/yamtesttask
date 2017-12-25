package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverSingleton;

public class PassportPage extends BasePage{
    public PassportPage(WebDriverSingleton driver){
        super(driver);
    }

    @FindBy(css = "[name=login]")
    private WebElement loginField;
    @FindBy(css = "[name=passwd]")
    private WebElement passwordField;
    @FindBy(css = "[type=submit]")
    private WebElement submitButton;

    public void fillLoginField(String login) {
        loginField.sendKeys(login);
    }
    public void fillPasswdField(String passwd) {
        passwordField.sendKeys(passwd);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }

}
