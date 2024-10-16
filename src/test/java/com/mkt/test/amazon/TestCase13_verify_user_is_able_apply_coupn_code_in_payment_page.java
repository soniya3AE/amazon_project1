package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Add_to_cart_page;
import com.mkt.source.amazon.Login_Amazon_Page;
import com.mkt.source.amazon.Procced_to_payment_page;

@Listeners(ListernerProgram.class)
public class TestCase13_verify_user_is_able_apply_coupn_code_in_payment_page  extends BaseLanchQuit{

	@Test
	public void search_product_verify_result() throws InterruptedException {
	Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
	
	l1.mouseOver_singin(driver);
	l1.email();
	l1.continue_button();
	l1.password();
	l1.singin_button();
	Add_to_cart_page a1 = new Add_to_cart_page(driver);
	l1.enter_product_name_to_search_product();	
	a1.validate_select_searched_product(driver);	
	a1.validate_add_to_cart();
	a1.validate_product_added_sucess_message();
	a1.go_cart_page(driver);
	Procced_to_payment_page p1 = new Procced_to_payment_page(driver);
	p1.validate_product_to_buy();
	p1.validate_edit_the_delivery_address(driver);
	p1.use_cash_on_delivery_method();
	p1.enter_coupon_code();
	

	
	
	
	
	
	
	
	
	

	
	}
	
}
