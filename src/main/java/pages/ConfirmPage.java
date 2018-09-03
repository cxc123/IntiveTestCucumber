package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {


    private WebDriver webDriver;
    public ConfirmPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//td[@class='content']/div[@class='ng-scope']/h1")
    public WebElement title;

    @FindBy(xpath = "//td[@class='content']/div[@class='ng-scope']/p")
    public WebElement confirmMessage;
    @FindBy(id="back_button")
    public WebElement backButton;


    public String getTitle()
    {
        return title.getText();
    }

    public String getConfirmMessage()
    {
        return confirmMessage.getText();
    }

    public void backToHome()
    {
        backButton.click();
    }
}
