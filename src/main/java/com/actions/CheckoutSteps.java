package com.actions;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.genericconfig.Context;
import com.genericconfig.LocatorConfig;
import com.genericconfig.MainMethods;
import com.webpages.AddToCartPage;
import com.webpages.CheckoutPage;
import com.webpages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CheckoutSteps {
	private WebDriver driver;
	private Context context;
	private CheckoutPage checkoutPage;
	
	public CheckoutSteps(CheckoutPage checkoutPage, LoginPage loginPage, Context context) {
		driver = ApplicationBooks.driver;
		this.context = context;
		this.checkoutPage= checkoutPage;
	}
	
	@And("I click particular button {string} on checkout page")
	public void i_click_particularButton(String buttonName) {
		checkoutPage.clickParticularButtonOnCheckOutPage(buttonName);
	}
	@When("^I enter FirstName LastName and Zip$")
	public void i_enter_firstName_lastName_Zip() throws InterruptedException {
		checkoutPage.enterAddressDetails();
	}
	
	@Then("^I verify updated total amount on checkout$")
	public void i_verify_updatedTotalValue_afterSum() throws InterruptedException, ParseException, java.text.ParseException {
		checkoutPage.verifyTotalAmountOnCheckout();
	}
	
	@Then("^I verify item removed$")
	public boolean i_verify_itemRemoved() {
		if(MainMethods.isElementPresent(driver, LocatorConfig.id_removebuttonwhileaddtocart)) {
			return false;
		}
			else {
				return true;
			}
	}
	
	@Then("I verify sucess message {string}")
	public void i_verifySuccessmessage(String text) throws InterruptedException, ParseException, java.text.ParseException {
		checkoutPage.verifySuccessMessageFinal(text);
	}
	
	@Then("I verify item Quantity {string}")
	public void i_verifyQuantity(String s) {
		checkoutPage.verifQuantity(s);
		


}
	@Then("^I verify home page visible and order cancelled$")
	public boolean i_verify_homepageopened() {
		if(MainMethods.isElementPresent(driver, LocatorConfig.id_removebuttonwhileaddtocart)) {
			return true;
		}
		else {
			return false;
			
		}
	}
	
}