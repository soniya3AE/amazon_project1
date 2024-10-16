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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Order_and_return_page {

	
	//step1
	
	
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement  order_return;
	@FindBy(id="time-filter")
	WebElement order_placed;
	@FindBy(xpath ="//a[@id='a-autoid-5-announce']")
	WebElement write_review;
    @FindBy(xpath="(//button[@class='ryp__star__button'])[3]")
    WebElement give_four_star_rating;
    @FindBy(xpath="//div[@data-hook='ryp-submitted-header']//span[@data-hook='ryp-submitted-header-success']")
    WebElement rating_submitted_sucess_message;

	// Step2 : define the method for webElement
	public void click_on_order_return() {
		order_return.click();
	}
	
	
	public void select_drop_down_value() {
		Select s1 = new Select(order_placed);
		s1.selectByVisibleText("2023");
		//order_placed.click();
	}
	
	public void click_on_write_review() {
		write_review.click();
		Reporter.log("clicked on Order & Return button ");
		System.out.println("clicked on Order & Return button ");
	}
	
	public void give_four_star_rating() {
		give_four_star_rating.click();
		Reporter.log("4 start rating given  ");
		System.out.println("4 start rating given  ");
	}
	
	public void raitng_submitted_sucesss_message() {
		rating_submitted_sucess_message.isDisplayed();
		Assert.assertTrue(true);
		Reporter.log("rating submitted sucessfully ");
		System.out.println("rating submitted sucessfully  ");
	}
	
	
	// step3
	public Order_and_return_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
