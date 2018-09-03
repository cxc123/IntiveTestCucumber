Feature: Testing Scenarios on HomePage as a User


@smoke @homePage @regression
Scenario: User is able to open HomePage
        Given I type homepage in broswer
        Then HomePage should be opened


@homePage
Scenario Outline: User is able to see displayed enter name in HomePage once he enter validname in text enter box
        Given I type homepage in broswer
        When I enter "<validname>" in text enter
        Then Displayed name should be "<validname>"


  Examples:
   |validname|
   |aayush|
   |Aayush|
   |Aayush123|
   |Aayush$ssjsj|





@homePage
Scenario Outline: User is not able to navigate to AnimalSelection Page  if user is not  entering name in text enter box on home page
        Given I type homepage in broswer
        When I enter "<invalidname>" in text enter
        And I click continue button in  HomePage
        Then HomePage should be opened


  Examples:
  |invalidname|
  ||


  @regression @homePage
  Scenario Outline: Users is  able to navigate to AnimalSelection Page  if  entering name in text enter box on home page
          Given I type homepage in broswer
          When I enter "<validname>" in text enter
          And I click continue button in  HomePage
          Then AnimalSelectionPage should be opened



  Examples:
  |validname|
  |aayush|
  |Aayush|
  |Aayush123|
  |Aayush$ssjsj|