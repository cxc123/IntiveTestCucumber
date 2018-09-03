package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AnimalSelectionPage {

    private WebDriver webDriver;
    public AnimalSelectionPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(id = "continue_button")
    public WebElement continueNext;

    @FindBy(id = "back_button")
    public WebElement backButton;

    @FindBy(xpath = "//td[@class='content']/div[@class='ng-scope']/h1")
    public WebElement title;
    @FindBy(xpath = "//td[@class='left']/a")
    public WebElement link;



    @FindBy(xpath = "//select[@ng-options='animal in animals']")
    public WebElement optionList;


    public String getTitle()
    {
        return title.getText();
    }

    public void clickBack()
    {
        backButton.click();
    }


    public Select getSelect()
    {
        return new Select(optionList);
    }

    public void continueNext()
    {
        continueNext.click();
    }


}
