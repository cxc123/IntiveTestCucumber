package stepdefinitons;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AnimalSelectionPage;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class AnimalSelectionStepdefinitions {

    private CommonStepdefinition commonStepdefinition ;
    public WebDriver webDriver;

    public AnimalSelectionStepdefinitions(CommonStepdefinition commonStepdefinition) {
        this.commonStepdefinition = commonStepdefinition;
        webDriver=commonStepdefinition.webDriver;
    }


    @Then("^AnimalSelectionPage should be opened$")
    public void verifyHomePageTitle()
    {

        AnimalSelectionPage animalSelectionPage = new AnimalSelectionPage(webDriver);
        assertEquals(commonStepdefinition.properties.getProperty("animalselectionpage"),animalSelectionPage.getTitle());



    }


    @And("^I click back on animalselection page$")
    public void backButton()
    {
        AnimalSelectionPage animalSelectionPage = new AnimalSelectionPage(webDriver);
        animalSelectionPage.clickBack();
    }



    @And("^I click continue on animalselection page$")
    public void continueButton()
    {
        AnimalSelectionPage animalSelectionPage = new AnimalSelectionPage(webDriver);
        animalSelectionPage.continueNext();
    }

    @Then("^animal dropdown list should be present for selection$")
    public void animalDropDown(DataTable dataTable)
    {
        AnimalSelectionPage animalSelectionPage = new AnimalSelectionPage(webDriver);
        List<WebElement> webElements=animalSelectionPage.getSelect().getOptions();
        List<List<String>> data=dataTable.raw();
        assertEquals(webElements.size()-1,Integer.parseInt(data.get(0).get(1)));

    }

    @And("^I select \"([^\\\"]*)\" index animal from dropdown  on animalselection page$")
    public void selectAnimal(int index) throws InterruptedException {
        AnimalSelectionPage animalSelectionPage= new AnimalSelectionPage(webDriver);
        Select selectAnimal=animalSelectionPage.getSelect();
        if(index > selectAnimal.getOptions().size() -1)
        {
            System.out.println("Please enter valid index and then run test again");
        }
        selectAnimal.selectByIndex(index);
    }

}
