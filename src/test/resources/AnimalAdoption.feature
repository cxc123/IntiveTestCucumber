Feature: Test AnimalAdoption feature
Description: I want to be able to adopt animalsuccessfully


Background: User lands to animalselectionpage from homepage
	Given I type homepage in broswer
    And I enter "aayush" in text enter
    And I click continue button in  HomePage

@regression @AnimalAdoption
Scenario Outline: When user enter name and select  for eg 1st index animal and adopt then again same user is able to change  adopt to for eg 2nd index animal

And I select "<oldindex>" index animal from dropdown  on animalselection page
And I click continue on animalselection page
And I click back to home on confirm page
And I enter "aayush" in text enter
And I click continue button in  HomePage
And I select "<newindex>" index animal from dropdown  on animalselection page
And I click continue on animalselection page
Then ConfirmPage should be opened with proper message
|message|Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal.|

 Examples:
        |oldindex|newindex|
        |1|2|
        |2|3|
        |3|1|



@regression @AnimalAdoption
Scenario Outline: when user select any animal name from drop down in animal selection page then click continue then confirm page comes up
     And I select "<index>" index animal from dropdown  on animalselection page
     And I click continue on animalselection page
     Then ConfirmPage should be opened with proper message
     |message|Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal.|

       Examples:
        |index|
        |1|
        |2|
        |3|



