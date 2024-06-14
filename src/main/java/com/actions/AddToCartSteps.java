package com.actions;


import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.genericconfig.Context;
import com.webpages.AddToCartPage;
import com.webpages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartSteps {
	private WebDriver driver;
	private Context context;
	private AddToCartPage addToCartPage;
	
	public AddToCartSteps(AddToCartPage addToCartPage, LoginPage loginPage, Context context) {
		driver = ApplicationBooks.driver;
		this.context = context;
		this.addToCartPage= addToCartPage;
	}
	
	@And("I add item {string} to the cart") 
	public void i_add_particularItem_toTheCart(String items) throws InterruptedException {
		addToCartPage.addParticularItemToTheCart(items);
	}
	
	@Then("I verify {string} button particular item which added in the cart")
	public void i_verify_particularButtonutton(String str) {
		addToCartPage.verifyParticularButtonOnThePage(str);
		
	}
	
	@And("I verify the amount of {string} and get that")
	public void iverify_amountfor_particular_itemGetTheAmount(String items) throws InterruptedException, ParseException {
		addToCartPage.verifyItemAmountAndGetThat(items);
}
	@Then("^I verify the shopping cart basket quantity should be 1$")
	public void i_verify_shoppingCart_badgeValue() throws InterruptedException, ParseException {
		addToCartPage.verifyShoppingCartBadgeCounterNotification();

	}
	@When("^I click shopping cart basket icon$")
	public void i_click_cartbasket() {
		addToCartPage.cartBasketIcon();
	}
	
	@Then("I verify added product name should be {string}")
	public void i_verify_particular_itemAddedintoCart(String itemName) throws InterruptedException {
		addToCartPage.verifyItemNameAddedIntoCart(itemName);
	}
}
