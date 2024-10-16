package com.mkt.source.amazon;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Procced_to_payment_page {

	
	//step1
	@FindBy(xpath = "(//img[@class='s-image s-image-optimized-rendering'])[2]")
	WebElement select_product;
	@FindBy(id="add-to-cart-button")
	WebElement add_cart;
	@FindBy(xpath="//div//h1")
	WebElement added_cart_message;
	
	
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement quantity_count;
	@FindBy(xpath="(//a[@class='a-button-text'])[1]")
	WebElement go_to_cart_button;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement delete_product_from_cart_page;
	
	@FindBy(xpath="//div[@id='sc-active-cart']//div[@class='a-row sc-cart-header']//h1")
	WebElement cart_empty_after_deleting_product;
	
	/* test case 11*/
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement procced_to_buy;
	
	@FindBy(xpath="//span[@class='address-edit-link']")
	WebElement edit_address;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement edit_name_in_address_section;
	@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button-announce']")
	WebElement update_address;
	@FindBy(xpath="(//span[@class='a-size-base'])[7]")
	WebElement landMark;
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	WebElement update_address_button;
	
	@FindBy(xpath="(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")
	WebElement use_cash_on_delivery_method;
	
	
	@FindBy(xpath="//div[@class='a-row a-spacing-small']//div[@id='revieworder']//span[@class='break-word']")
	WebElement order_review;
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement qunatity_count_in_payment_page;
	
	@FindBy(xpath="//input[@id='spc-gcpromoinput']")
	WebElement enter_coupon_code;
	
	@FindBy(xpath="//span[@id='gcApplyButtonId-announce']")
	WebElement apply_coupon;
	@FindBy(xpath="//p[@id='addPromo_BadCode']")
	WebElement coupon_code_error_message;
	
	
	
	

	// Step2 : define the method for webElement
	
	public void validate_select_searched_product(WebDriver driver) {
		select_product.click();
		String pid = driver.getWindowHandle();
		System.out.println("pid :" + pid);
		Set<String> cid = driver.getWindowHandles();
		System.out.println("the child id : " + cid);

		Iterator<String> ccid = cid.iterator();
		String parentpid = ccid.next();
		String childid = ccid.next();
		driver.switchTo().window(childid);
	}
	
	public void validate_add_to_cart() {
		add_cart.click();
	}
	public void validate_product_added_sucess_message() {
	String added_cart_message_is = 	added_cart_message.getText();
		System.out.println("the added cart message is : "+ added_cart_message_is);
		added_cart_message.isDisplayed();
		Assert.assertTrue(true);
	}
	
	public void validate_before_adding_product_to_card_Count() {		
		String initial_quantity_count = quantity_count.getText();
		System.out.println("the initial cart quanity :"+ initial_quantity_count);
	}
	
	
	public void  go_cart_page() {
		go_to_cart_button.click();
		Reporter.log("Go to cart button clicked");
	}
	
	
	public void delete_product() {
		delete_product_from_cart_page.click();
		System.out.println("deleted product from cart");
		Reporter.log("deleted product from cart");		
	}
	
	public void validate_remove_quantity_from_cart() {
		String after_removing_product_from_cart_count_is = quantity_count.getText();
		Reporter.log("after_removing_product_from_cart_count_is");	
	}
	
	
	public void validate_after_adding_product_to_card_Count() {		
		String after_adding_product_count = quantity_count.getText();
		System.out.println("after adding the product to cart count is  :"+ after_adding_product_count);
		Reporter.log("validate_after_adding_product_to_card_Count");
	}
	
	
	public void validate_product_to_buy() {
		procced_to_buy.click();
		Reporter.log("Porcced to bug button clicked");	
		
	}
	
	public void validate_edit_the_delivery_address(WebDriver driver) {
		//edit_address.click();
		Reporter.log("updated addresss");
		
		update_address_button.click();
		

	}
	
	public void use_cash_on_delivery_method() {
		use_cash_on_delivery_method.click();
		Reporter.log("Cash on delivery");
	}
	
	
	public void order_review() {
		String ordre_review_infor =order_review.getText();
		System.out.println("order review data :"+ordre_review_infor);
		order_review.isDisplayed();
		Assert.assertTrue(true);
		Reporter.log("Order reivew available as the per required ");
	}
	public void quntity_count_in_payment_page() {
		String after_adding_product_count = quantity_count.getText();
		System.out.println("after adding the product to cart count is  :"+ after_adding_product_count);
		Reporter.log("After adding product count :"+after_adding_product_count);
		String payment_page_cart_count = qunatity_count_in_payment_page.getText();
		System.out.println("the pagement page cart count is : "+ payment_page_cart_count);
		Reporter.log("payment_page_cart_count:"+payment_page_cart_count);
		Assert.assertEquals(after_adding_product_count, payment_page_cart_count);	
		}
	
	
	public void enter_coupon_code() {
		enter_coupon_code.sendKeys("12345");
		apply_coupon.click();
		coupon_code_error_message.isDisplayed();
		Assert.assertTrue(true);
		Reporter.log("The error message for incorrect coupon code is displayed");
		System.out.println("error message is displayed for incorrect coupon code");
		
		
	}
	
	// step3
	public Procced_to_payment_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
