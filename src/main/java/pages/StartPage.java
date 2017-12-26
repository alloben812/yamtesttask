package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utils.Constants.ENDPOINT;
import static utils.Constants.START_ENTER_BUTTON;

public class StartPage extends BasePage{
    public StartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = START_ENTER_BUTTON)
    private WebElement enterButton;

    public WebElement getEnterButton(){
        return enterButton;
    }
    public void clickOnEnterButton(){
        enterButton.click();
    }
    public void open(){ driver.get(ENDPOINT); }
}
