package com.mkt.test.amazon;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Amazon_HomePage;
import com.mkt.source.amazon.Login_Amazon_Page;

public class TestCase_Login_amazon_to_cart {
	
	
	
	@Test
	public void login_to_amazon_till_cart() throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
	    l1.email();
	    l1.continue_button();
	    l1.password();
	    l1.singin_button();
	    Amazon_HomePage h1 = new Amazon_HomePage(driver);
	    h1.search_product();
	    h1.select_Product();
	    h1.parent_child(driver);
	     //handle the child window
	  
	    h1.add_to_cart();
	

}
}