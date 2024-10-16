package com.mkt.source.amazon;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Add_to_cart_page {

	
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
	
	@FindBy(xpath="//div[@class='a-row sc-cart-header sc-compact-bottom']//div[@class='a-row'][1]")
	WebElement shopping_cart_title;
	
	
	//div[@class='sc-without-multicart']
	
	
	

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
	
	
	public void  go_cart_page(WebDriver driver) {
		go_to_cart_button.click();
		Reporter.log("Go to cart button clicked");
		String actul =driver.getTitle();
		System.out.println("Shopping cart text : "+ actul);
		String expected = "Amazon.in Shopping Cart";
		Assert.assertEquals(actul, expected);
		
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
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// step3
	public Add_to_cart_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
