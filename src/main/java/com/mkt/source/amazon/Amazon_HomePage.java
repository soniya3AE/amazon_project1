package com.mkt.source.amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage {

	
	//WebDriver driver;
	//Search product in homepage
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	@FindBy(xpath="(//div//img[@class='s-image s-image-optimized-rendering'])[1]")
	WebElement select_product;
	
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart_button;
	
	//Step2 
	
	public void search_product() {
		search_tf.sendKeys("Shoe");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	public void add_to_cart() throws InterruptedException {
	   // Thread.sleep(3000);
		addToCart_button.click();
	}
	
	public void select_Product() throws InterruptedException {
	    Thread.sleep(3000);
		select_product.click();
		
	}
	public Amazon_HomePage (WebDriver driver){
		PageFactory.initElements(driver, this );
			
		}

	public void parent_child(WebDriver driver ) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pid  = driver.getWindowHandle();
		   System.out.println ("Parent window :"+ pid);
		   Set<String> pandcid = driver.getWindowHandles();
		   System.out.println("Pand chilid id :"+ pandcid);
		   
		   Iterator <String>  pc = pandcid.iterator();   
		   String parentid  = pc.next(); 
		   String childid = pc.next();
		   driver.switchTo().window(childid);
	}
	
	
	
}
