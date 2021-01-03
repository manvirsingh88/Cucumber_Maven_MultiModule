#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Verify Headers and subHeaders of Free Trial Page
  This feature File will verify the Headers and Sub header text.

  Background: 
    Given User is on home page
    And User closes cookie dialog box
    And User Click on Free Trials hyperlink
	@debug
  Scenario: Title of Page
    Then Verify the title of Free Trials page ""

  Scenario: Main Header Text
    Then Verify the main Header Text of Free Trials Page ""
    
  Scenario: SubHeader Text
    Then Verify the Sub Header Text of Free Trials Page ""

