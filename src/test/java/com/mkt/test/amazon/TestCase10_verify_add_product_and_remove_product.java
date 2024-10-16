package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Add_to_cart_page;
import com.mkt.source.amazon.Login_Amazon_Page;

@Listeners(ListernerProgram.class)
public class TestCase10_verify_add_product_and_remove_product  extends BaseLanchQuit{

	@Test
	public void search_product_verify_result() throws InterruptedException {
	Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
	l1.mouseOver_singin(driver);
	l1.email();
	l1.continue_button();
	l1.password();
	l1.singin_button();
	Add_to_cart_page a1 = new Add_to_cart_page(driver);
	a1.validate_before_adding_product_to_card_Count();
	l1.enter_product_name_to_search_product();
	
	a1.validate_select_searched_product(driver);	
	a1.validate_add_to_cart();
	a1.validate_product_added_sucess_message();
	a1.validate_after_adding_product_to_card_Count();
	a1.go_cart_page(driver);
	a1.delete_product();
	
	}
	
}
