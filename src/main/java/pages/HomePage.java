package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);

    }


    public WebElement getNameText() {
        return nameText;
    }

    @FindBy(css = "input.ng-pristine.ng-valid")
    public WebElement nameText;
    @FindBy(xpath = "//td[@class='content']/div[@class='ng-scope']/h1")
    public WebElement title;
    @FindBy(xpath = "//td[@class='left']/a")
    public WebElement link;

    public WebElement getContinueNext() {
        return continueNext;
    }

    @FindBy(id = "continue_button")
    public WebElement continueNext;

    @FindBy(xpath = "//h2[@ng-bind='person.name']")
    public WebElement getEnteredName;


    public String getTitle()
    {
        return title.getText();
    }

    public void setName(String name)
    {
        nameText.sendKeys(name);
    }

    public void goToAnimalSelectionPage()
    {
        continueNext.click();
    }

    public  String getName()
    {return getEnteredName.getText();
    }
    public void clickContinue()
    {
        continueNext.click();
    }



}
