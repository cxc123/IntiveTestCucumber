Feature: Test AnimalSelectionPage Feature
Description: The purpose of this feature of animalSelection

Background: User lands to animalselectionpage from homepage
	Given I type homepage in broswer
    When I enter "aayush" in text enter
    And I click continue button in  HomePage


@AnimalSelectionPage
Scenario: when user click back it will land on homepage
	When I click back on animalselection page
	Then HomePage should be opened

@AnimalSelectionPage
Scenario: When user lands on animal selection page and user click continue without selecting animal then user remain on same page
           And I click continue on animalselection page
           Then AnimalSelectionPage should be opened


@regression @AnimalSelectionPage
Scenario: When user lands on animal selection page User see animal list from dropDown
           Then animal dropdown list should be present for selection
           |numberOfSelections|3|

Scenario Outline: when user select any animal name from drop down in animal selection page then click continue then confirm page comes up
     When I select "<index>" index animal from dropdown  on animalselection page
     And I click continue on animalselection page
     Then ConfirmPage should be opened with proper message
     |message|Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal.|


       Examples:
        |index|
        |1|
        |2|
        |3|




