Feature: Test ConfirmPage Feature
Description: The purpose of this feature of ConfirmPage

Background: User lands to animalselectionpage from homepage
	Given I type homepage in broswer
    And I enter "aayush" in text enter
    And I click continue button in  HomePage
    And I select "1" index animal from dropdown  on animalselection page
    And I click continue on animalselection page


  @smoke @confirmPage
  Scenario: User is able to go to HomePage if user click back to home on confirm page
           And I click back to home on confirm page
           Then HomePage should be opened