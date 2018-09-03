package stepdefinitons;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.ConfirmPage;

import javax.xml.crypto.Data;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConfirmStepDefinitions {

    private CommonStepdefinition commonStepdefinition ;
    public WebDriver webDriver;

    public ConfirmStepDefinitions(CommonStepdefinition commonStepdefinition) {
        this.commonStepdefinition = commonStepdefinition;
        webDriver=commonStepdefinition.webDriver;
    }


    @Then("^ConfirmPage should be opened with proper message$")
    public void confirmMessage(DataTable dataTable)
    {
        ConfirmPage confirmPage= new ConfirmPage(webDriver);
        List<List<String>> data=dataTable.raw();
        assertEquals(confirmPage.getConfirmMessage(),data.get(0).get(1));


    }

    @And("^I click back to home on confirm page$")
    public void backToHome()
    {
        ConfirmPage confirmPage= new ConfirmPage(webDriver);
        confirmPage.backToHome();
    }
}
