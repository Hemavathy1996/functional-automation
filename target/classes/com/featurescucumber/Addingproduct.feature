Feature: Letshop e-commerce website title

@TestSanity
Scenario: login to application and add product
      Given URL is loaded
      When user enters the email ID
      And user enter the password
      When user clicks on login button
      Then verify logged in successfully
      
      