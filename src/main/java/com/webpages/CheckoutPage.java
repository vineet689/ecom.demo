package com.webpages;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.text.NumberFormat;
import java.util.Locale;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actions.ApplicationBooks;
import com.genericconfig.Context;
import com.genericconfig.LocatorConfig;
import com.genericconfig.MainMethods;

public class CheckoutPage {
	private WebDriver driver;
	private Context context;
	
	public CheckoutPage(LoginPage loginPage, Context context) {
		driver = ApplicationBooks.driver;
		this.context = context;
		
	}

	public void clickParticularButtonOnCheckOutPage(String button) {
			System.out.println(MainMethods.removeSpace((button.trim().toLowerCase())));
			switch(MainMethods.removeSpace((button.trim().toLowerCase()))) {
			case "checkout":
				System.out.println("All is well....");
				MainMethods.waitforElementVisibility(driver,LocatorConfig.id_checkoutbutton);
				MainMethods.clickElement(driver, LocatorConfig.id_checkoutbutton);
				  break; 
			case "remove":
				System.out.println("All is well....");
				MainMethods.waitforElementVisibility(driver,LocatorConfig.id_removebuttonwhileaddtocart);
				MainMethods.clickElement(driver, LocatorConfig.id_removebuttonwhileaddtocart);
				  break;
			case "cancel":
				System.out.println("All is well....");
				MainMethods.waitforElementVisibility(driver,LocatorConfig.id_cancelbutton);
				MainMethods.clickElement(driver, LocatorConfig.id_cancelbutton);
				  break;
			case "continue":
				System.out.println("All is well....");
				MainMethods.waitforElementVisibility(driver,LocatorConfig.id_continuebutton);
				MainMethods.clickElement(driver, LocatorConfig.id_continuebutton);
				  break; 
			case "finish":
				System.out.println("All is well....");
				MainMethods.waitforElementVisibility(driver,LocatorConfig.id_checkoutFinish);
				MainMethods.clickElement(driver, LocatorConfig.id_checkoutFinish);
				  break; 		  	  
			  default:
				  throw new IllegalStateException("Given : " + button + " is invalid, no match found...");
			}
	}		
		

	public void enterAddressDetails() throws InterruptedException {
		MainMethods.enterText(driver, LocatorConfig.id_label_firstNameCheckout, "Miratech");
		MainMethods.enterText(driver, LocatorConfig.id_label_lastNameCheckout, "Solution");
		MainMethods.enterText(driver, LocatorConfig.id_label_postalCodeCheckout, "1012");
	}

	@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
	public void verifyTotalAmountOnCheckout()throws InterruptedException, ParseException, java.text.ParseException {
				System.out.println("All is well....");
				MainMethods.waitforElementVisibility(driver,LocatorConfig.idlocatoraddtocartTo);
				assertTrue(MainMethods.findElement(driver, LocatorConfig.xpath_inventryitempricecheckout).isDisplayed());
				String subTotalAmt= MainMethods.getText(driver, LocatorConfig.xpath_subtotalamtCheckout);
				String taxAmt= MainMethods.getText(driver, LocatorConfig.xpath_taxamtCheckout);
				String totalAmtOnPage=MainMethods.getText(driver, LocatorConfig.xpath_totalamtCheckout); 
//				NumberFormat format = NumberFormat.getCurrencyInstance();
//				Number number = format.parse(totalAmtOnPage);
				
				//NumberFormat format = NumberFormat.getCurrencyInstance();
				//Number number = format.parse("$123,456.78");
				//NumberFormat.getCurrencyInstance(Locale.US).parse(itemPrice);
				String subTotalamt = subTotalAmt.replaceAll("[^0-9,.]", "");
				String taxAmtVal= taxAmt.replaceAll("[^0-9,.]", "");
				String totalAmt = totalAmtOnPage.replaceAll("[^0-9,.]", "");
				System.out.println("subTotalamt : " +subTotalamt);
				Float subTotalamtFinal = Float.parseFloat(subTotalamt); 
				Float taxAmtValFinal = Float.parseFloat(taxAmtVal); 
				Float totalAmtFinal = Float.parseFloat(totalAmt); 
				   System.out.println("Price value is; "+subTotalamtFinal);
				System.out.println("totalAmtFinal is : " +totalAmtFinal);
				float sumTotal= taxAmtValFinal +subTotalamtFinal;
				System.out.println("Total sum subtotal and tax: "+sumTotal);
				//assert.assertTrue(sumTotal, totalAmtFinal);
				//assert.assertArrayEquals(sumTotal, totalAmtFinal);
				//equals(Float.compare(sumTotal, totalAmtFinal)==0);
				 if (Float.compare(sumTotal, totalAmtFinal) == 0) {
					 System.out.println("Succesfully match!!");
				 }
				 
				 else {
					  throw new IllegalStateException("Total Sum not match with subtotal and tax sum..." +"\n");

				 }
			}
	
	public void verifySuccessMessageFinal(String text)throws InterruptedException, ParseException, java.text.ParseException {
		MainMethods.waitforElementVisibility(driver,By.xpath("//*[text()='"+text+"']"));
		assertTrue(MainMethods.findElement(driver, By.xpath("//*[text()='"+text+"']")).isDisplayed());
	}

	public void verifQuantity(String s) {
		String itemQty= MainMethods.getText(driver, By.xpath("//div[@data-test='item-quantity']"));
		//int qty = Integer.parseInt(s); 
		assertEquals(itemQty, s);
		   System.out.println("Price value is; "+itemQty);
		
	}
	
	
	}
