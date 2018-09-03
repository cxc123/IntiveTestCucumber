package stepdefinitons;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HomeStepdefinitions {

    private CommonStepdefinition commonStepdefinition ;
    public WebDriver webDriver;

    public HomeStepdefinitions(CommonStepdefinition commonStepdefinition) {
        this.commonStepdefinition = commonStepdefinition;
        webDriver=commonStepdefinition.webDriver;
    }


    @Given("^I type homepage in broswer$")
    public void landUrl() throws Throwable {
       webDriver.get("http://www.thetestroom.com/jswebapp/");
    }

    @Then("^HomePage should be opened")
    public void verifyHomePageTitle()
    {

            HomePage homePage = new HomePage(webDriver);
            assertEquals(commonStepdefinition.properties.getProperty("homepage"), homePage.getTitle());

    }
    @When("^I enter \"([^\\\"]*)\" in text enter$")
    public void enterName(String name)
    {
        HomePage page=new HomePage(webDriver);
        page.setName(name);

    }
    @And("^I click continue button in  HomePage")
    public void clickContinue()
    {
        HomePage page= new HomePage(webDriver);
        page.clickContinue();
    }

    @Then("^Displayed name should be \"([^\\\"]*)\"$")
    public void verifyTextname(String name)
    {
        HomePage page=new HomePage(webDriver);
        assertEquals(name, page.getName());


    }


}
