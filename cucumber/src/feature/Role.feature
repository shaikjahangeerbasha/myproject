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

Feature: Role creation

Scenario Outline: Verifying Role Creation with multuple set of  data

Given User should be Ranford Home page

When  tester should enter  user name and password

Then tester Validate Login functionality

When tester click on new role button

When tester  enters "<Rolename>" and "<Roletype>" and click on submit

Then tester close the application 

  Examples: 
      | Rolename  | rolestatus | 
      | bahaa    |   E | 
      |bahaaa     |     E| 
