package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverSingleton;

public class StartPage extends BasePage{
    public StartPage(WebDriverSingleton driver){
        super(driver);
    }

    @FindBy(css = "a.button")
    private WebElement enterButton;

    public WebElement getEnterButton(){
        return enterButton;
    }
    public void clickOnEnterButton(){
        enterButton.click();
    }
    public void open(){ driver.getDriver().get("http://www.money.yandex.ru"); }
}
