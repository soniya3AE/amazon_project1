package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Login_Amazon_Page;

@Listeners(ListernerProgram.class)
public class TestCase6_verify_Searched_product_result_In_appearing_In_category_section  extends BaseLanchQuit{

	@Test
	public void search_product_verify_result() throws InterruptedException {
	Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
	l1.mouseOver_singin(driver);
	l1.email();
	l1.continue_button();
	l1.password();
	l1.singin_button();
	l1.enter_product_name_to_search_product();
	l1.validate_searched_product_result(driver);
	l1.validate_category_wise_search();
	l1.validate_price_wise_search(driver);
	l1.validate_price_wise_search(driver);
	}
	
}
