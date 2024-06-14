package com.webpages;

import static org.junit.Assert.assertTrue;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.bidi.browsingcontext.Locator;

import com.actions.ApplicationBooks;
import com.genericconfig.Context;
import com.genericconfig.LocatorConfig;
import com.genericconfig.MainMethods;
import static org.junit.Assert.assertTrue;

public class AddToCartPage {
	
	private WebDriver driver;
	private Context context;
	
	public AddToCartPage(LoginPage loginPage, Context context) {
		driver = ApplicationBooks.driver;
		this.context = context;
		
	}
	public void addParticularItemToTheCart(String item) throws InterruptedException {
				System.out.println(MainMethods.removeSpace((item.trim().toLowerCase())));
				switch(MainMethods.removeSpace((item.trim().toLowerCase()))) {
				case "saucelabsbackpack":
					Thread.sleep(10000);
					System.out.println("All is well....");
					MainMethods.waitforElementVisibility(driver,LocatorConfig.idlocatoraddtocartTo);
					MainMethods.clickElement(driver, LocatorConfig.idlocatoraddtocartTo);

					assertTrue(MainMethods.findElement(driver, LocatorConfig.id_removebuttonwhileaddtocart).isDisplayed());
					  break; 
					  
				  default:
					  throw new IllegalStateException("Given : " + item + " is invalid, no match found...");
				}
	}
	public void verifyParticularButtonOnThePage(String str) {
		System.out.println(MainMethods.removeSpace((str.trim().toLowerCase())));
		switch(MainMethods.removeSpace((str.trim().toLowerCase()))) {
		case "remove":
			System.out.println("All is well....");
			//MainMethods.waitforElementVisibility(driver,LocatorConfig.idlocatoraddtocartTo);
			assertTrue(MainMethods.findElement(driver, LocatorConfig.id_removebuttonwhileaddtocart).isDisplayed());
			break;
			
		  default:
			  throw new IllegalStateException("Given : " + str + " is invalid, no match found...");

		}
		
	}
	public void verifyItemAmountAndGetThat(String item) throws InterruptedException, ParseException {
		System.out.println(MainMethods.removeSpace((item.trim().toLowerCase())));
		switch(MainMethods.removeSpace((item.trim().toLowerCase()))) {
		case "saucelabsbackpack":
			System.out.println("All is well....");
			MainMethods.waitforElementVisibility(driver,LocatorConfig.idlocatoraddtocartTo);
			assertTrue(MainMethods.findElement(driver, By.xpath("//div[@data-test='inventory-item-price']")).isDisplayed());
			String itemPrice= MainMethods.getText(driver, By.xpath("//div[@data-test='inventory-item-price']"));
			//NumberFormat format = NumberFormat.getCurrencyInstance();
			//Number number = format.parse("$123,456.78");
			//NumberFormat.getCurrencyInstance(Locale.US).parse(itemPrice);
			//System.out.println(number.toString());
			String newStr = itemPrice.replaceAll("[$,]", "");
			System.out.println("newStr : " +newStr);
			   double a = Double.parseDouble(newStr); 
			   System.out.println("Price value is; "+a);
			  break; 
			  
		  default:
			  throw new IllegalStateException("Given : " + item + " is invalid, no match found...");
		}

		
	}
	
	public void verifyShoppingCartBadgeCounterNotification() throws InterruptedException, ParseException {
			System.out.println("All is well....");
			MainMethods.waitforElementVisibility(driver,LocatorConfig.idlocatoraddtocartTo);
			assertTrue(MainMethods.findElement(driver, By.xpath("//span[@data-test='shopping-cart-badge']")).isDisplayed());
			assertTrue(MainMethods.findElement(driver, By.xpath("//span[text()='1']")).isDisplayed());
}
	public void cartBasketIcon() {
		MainMethods.clickElement(driver, LocatorConfig.xpath_shopingCartbadge);
		
	}
	
	public void verifyItemNameAddedIntoCart(String item) throws InterruptedException {
		System.out.println(MainMethods.removeSpace((item.trim().toLowerCase())));
		switch(MainMethods.removeSpace((item.trim().toLowerCase()))) {
		case "saucelabsbackpack":
			System.out.println("All is well....");
			MainMethods.waitforElementVisibility(driver,LocatorConfig.idlocatoraddtocartTo);
			assertTrue(MainMethods.findElement(driver, By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed());
			  break; 
			  
		  default:
			  throw new IllegalStateException("Given : " + item + " is invalid, no match found...");
		}

		
	}

}