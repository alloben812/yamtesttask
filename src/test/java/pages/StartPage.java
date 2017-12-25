package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePage{
    @FindBy(css = "a.button")
    private WebElement enterButton;

    public WebElement getEnterButton(){
        return enterButton;
    }
    public void clickOnEnterButton(){
        enterButton.click();
    }

    public StartPage(WebDriver driver){
        super(driver);
    }
}
