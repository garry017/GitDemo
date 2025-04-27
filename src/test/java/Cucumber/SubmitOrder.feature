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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes




@Regression
Feature: purchase the order from ecommerce website 

Background:
Given I landed  on ecommerce website 




  @tag2
  Scenario Outline: postive test of submitting the order 
    Given loggin with user name  <name>and password <password>
    When I add a product  <productName> to cart
    And Checkout <productName> and submit order  
    Then "Thankyou for the order."message displayed on confirmationPage

    Examples: 
      | name        				| password  | productName      |
      | virat188@gmail.com  | GAUrav@123| ZARA COAT 3      |
      | name2     				  |      		|		               |
