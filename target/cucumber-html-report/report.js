$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ShopingCartScenarios.feature");
formatter.feature({
  "name": "Checkout functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify end to end flow of checkout functionality placed order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@checkoute2eflow"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launchLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Login credentials with \"standard_user\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item \"Sauce Labs Backpack\" to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.i_add_particularItem_toTheCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"remove\" button particular item which added in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particularButtonutton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the amount of \"Sauce Labs Backpack\" and get that",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.iverify_amountfor_particular_itemGetTheAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click shopping cart basket icon",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.i_click_cartbasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify added product name should be \u0027Sauce Labs Backpack\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particular_itemAddedintoCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"CheckOut\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter FirstName LastName and Zip",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.i_enter_firstName_lastName_Zip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"Continue\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify updated total amount on checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.i_verify_updatedTotalValue_afterSum()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"Finish\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify sucess message \"Thank you for your order!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.i_verifySuccessmessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify correct item and Quantity added into basket checkout functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag2"
    },
    {
      "name": "@checkoutCorrectItemQtyAddedbasket"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launchLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Login credentials with \"standard_user\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item \"Sauce Labs Backpack\" to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.i_add_particularItem_toTheCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"remove\" button particular item which added in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particularButtonutton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the amount of \"Sauce Labs Backpack\" and get that",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.iverify_amountfor_particular_itemGetTheAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the shopping cart basket quantity should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_shoppingCart_badgeValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click shopping cart basket icon",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.i_click_cartbasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify added product name should be \u0027Sauce Labs Backpack\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particular_itemAddedintoCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify remove item from checkout page while placing order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag3"
    },
    {
      "name": "@checkoutremoveitem"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launchLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Login credentials with \"standard_user\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item \"Sauce Labs Backpack\" to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.i_add_particularItem_toTheCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"remove\" button particular item which added in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particularButtonutton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the amount of \"Sauce Labs Backpack\" and get that",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.iverify_amountfor_particular_itemGetTheAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the shopping cart basket quantity should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_shoppingCart_badgeValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click shopping cart basket icon",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.i_click_cartbasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify added product name should be \u0027Sauce Labs Backpack\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particular_itemAddedintoCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"remove\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify item removed",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.i_verify_itemRemoved()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify cancel order during checkout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag4"
    },
    {
      "name": "@checkoutcancelorder"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launchLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Login credentials with \"standard_user\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item \"Sauce Labs Backpack\" to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.i_add_particularItem_toTheCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"remove\" button particular item which added in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particularButtonutton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the amount of \"Sauce Labs Backpack\" and get that",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.iverify_amountfor_particular_itemGetTheAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the shopping cart basket quantity should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_shoppingCart_badgeValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click shopping cart basket icon",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.i_click_cartbasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify added product name should be \u0027Sauce Labs Backpack\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particular_itemAddedintoCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"CheckOut\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter FirstName LastName and Zip",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.i_enter_firstName_lastName_Zip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"Continue\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"Cancel\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify home page visible and order cancelled",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.i_verify_homepageopened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify added item and quantity on checkout step two",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag5"
    },
    {
      "name": "@checkoutverifyItemandQtyStep2"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launchLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Login credentials with \"standard_user\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item \"Sauce Labs Backpack\" to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.i_add_particularItem_toTheCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"remove\" button particular item which added in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particularButtonutton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the amount of \"Sauce Labs Backpack\" and get that",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.iverify_amountfor_particular_itemGetTheAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the shopping cart basket quantity should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_shoppingCart_badgeValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click shopping cart basket icon",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.i_click_cartbasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify added product name should be \u0027Sauce Labs Backpack\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.i_verify_particular_itemAddedintoCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"CheckOut\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter FirstName LastName and Zip",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.i_enter_firstName_lastName_Zip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click particular button \"Continue\" on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.i_click_particularButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the amount of \"Sauce Labs Backpack\" and get that",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.iverify_amountfor_particular_itemGetTheAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify item Quantity \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.i_verifyQuantity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});