package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Add_to_cart_page;
import com.mkt.source.amazon.Login_Amazon_Page;
import com.mkt.source.amazon.Order_and_return_page;
import com.mkt.source.amazon.Procced_to_payment_page;

@Listeners(ListernerProgram.class)
public class TestCase14_Add_rating_to_ordered_product  extends BaseLanchQuit{
	
	@Test
	public void search_product_verify_result()  throws InterruptedException {
		Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
		l1.email2();
		l1.continue_button();
		l1.password2();
		l1.singin_button();
		Order_and_return_page order = new Order_and_return_page(driver);
		order.click_on_order_return();	
		order.select_drop_down_value();
		order.click_on_write_review();
		order.give_four_star_rating();
		order.raitng_submitted_sucesss_message();
		

	}

}
