#Author: vineet689@gmail.com
Feature: Checkout functionality


  @tag1 @checkoute2eflow @sanity
  Scenario: Verify end to end flow of checkout functionality placed order
  	Given I launch the application
    When I enter Login credentials with "standard_user" and "Password"
    And I add item "Sauce Labs Backpack" to the cart
    Then I verify "remove" button particular item which added in the cart
    And I verify the amount of "Sauce Labs Backpack" and get that
    When I click shopping cart basket icon
    Then I verify added product name should be 'Sauce Labs Backpack'
    And I click particular button "CheckOut" on checkout page
    When I enter FirstName LastName and Zip
    And I click particular button "Continue" on checkout page
    Then I verify updated total amount on checkout
    And I click particular button "Finish" on checkout page  
    Then I verify sucess message "Thank you for your order!"  

 @tag2 @checkoutCorrectItemQtyAddedbasket  @sanity
  Scenario: Verify correct item and Quantity added into basket checkout functionality
  	Given I launch the application
    When I enter Login credentials with "standard_user" and "Password"
    And I add item "Sauce Labs Backpack" to the cart
    Then I verify "remove" button particular item which added in the cart
    And I verify the amount of "Sauce Labs Backpack" and get that
    Then I verify the shopping cart basket quantity should be 1
    When I click shopping cart basket icon
    Then I verify added product name should be 'Sauce Labs Backpack'
    

     
      @tag3 @checkoutremoveitem  @sanity
 Scenario: Verify remove item from checkout page while placing order
  	Given I launch the application
    When I enter Login credentials with "standard_user" and "Password"
    And I add item "Sauce Labs Backpack" to the cart
    Then I verify "remove" button particular item which added in the cart
    And I verify the amount of "Sauce Labs Backpack" and get that
    Then I verify the shopping cart basket quantity should be 1
    When I click shopping cart basket icon
    Then I verify added product name should be 'Sauce Labs Backpack'
    And I click particular button "remove" on checkout page
    Then I verify item removed 
    
    
  @tag4 @checkoutcancelorder  @sanity
  Scenario: Verify cancel order during checkout
  	Given I launch the application
    When I enter Login credentials with "standard_user" and "Password"
    And I add item "Sauce Labs Backpack" to the cart
    Then I verify "remove" button particular item which added in the cart
    And I verify the amount of "Sauce Labs Backpack" and get that
    Then I verify the shopping cart basket quantity should be 1
    When I click shopping cart basket icon
    Then I verify added product name should be 'Sauce Labs Backpack'
    And I click particular button "CheckOut" on checkout page
    When I enter FirstName LastName and Zip
    And I click particular button "Continue" on checkout page
    And I click particular button "Cancel" on checkout page
    Then I verify home page visible and order cancelled
    
      @tag5 @checkoutverifyItemandQtyStep2  @sanity
  Scenario: Verify added item and quantity on checkout step two
  	Given I launch the application
    When I enter Login credentials with "standard_user" and "Password"
    And I add item "Sauce Labs Backpack" to the cart
    Then I verify "remove" button particular item which added in the cart
    And I verify the amount of "Sauce Labs Backpack" and get that
    Then I verify the shopping cart basket quantity should be 1
    When I click shopping cart basket icon
    Then I verify added product name should be 'Sauce Labs Backpack'
    And I click particular button "CheckOut" on checkout page
    When I enter FirstName LastName and Zip
    And I click particular button "Continue" on checkout page
    And I verify the amount of "Sauce Labs Backpack" and get that
    Then I verify item Quantity "1"
