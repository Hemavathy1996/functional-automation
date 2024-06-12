Feature: Letshop e-commerce website title

Background:
Given URL is loaded
      When user enters the email ID
      And user enter the password
      When user clicks on login button
@TestEx1
Scenario: login to application with username and password
      Then verify logged in successfully
      
 @TestEx2    
Scenario: Add product zara from Letshop
      Then verify logged in successfully
      When click on the product zara
      And click Add to cart button
      