#
@ErrorValidations
Feature: Error Validation
  I want to use this template for my feature file



  @tag2
  Scenario Outline: Title of your scenario outline
    Given I landed on Ecommerce website
    When loggin with user name  <name>and password <password>
    Then "Incorrect email, password." message is display

   Examples: 
      | name        				| password  |      |
      | virat188@gmail.com  | GAUrav@12345|       |
      | name2     				  |      		|		               |