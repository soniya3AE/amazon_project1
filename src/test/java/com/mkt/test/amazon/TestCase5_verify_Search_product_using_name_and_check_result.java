package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Login_Amazon_Page;

@Listeners(ListernerProgram.class)
public class TestCase5_verify_Search_product_using_name_and_check_result  extends BaseLanchQuit{

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
	
	
	}
	
}
