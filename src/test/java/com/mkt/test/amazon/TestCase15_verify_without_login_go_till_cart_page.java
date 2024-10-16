package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Add_to_cart_page;
import com.mkt.source.amazon.Login_Amazon_Page;


@Listeners(ListernerProgram.class)
public class TestCase15_verify_without_login_go_till_cart_page extends  BaseLanchQuit{

	@Test
	public void without_login_till_amazon_cart_page() throws InterruptedException {
	//Without_login_go_till_cart_page  not_login  =new Without_login_go_till_cart_page(driver);		
	Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
	l1.enter_product_name_to_search_product();
    
	Add_to_cart_page a1 = new 	Add_to_cart_page(driver);
	a1.validate_select_searched_product(driver);	
	a1.validate_add_to_cart();
	a1.validate_product_added_sucess_message();
	a1.go_cart_page(driver);
	a1.validate_before_adding_product_to_card_Count();

	
	}

}
