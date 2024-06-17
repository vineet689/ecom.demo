$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ShopingCartScenarios.feature");
formatter.feature({
  "name": "Checkout functionality",
  "description": "",
  "keyword": "Feature"
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
});