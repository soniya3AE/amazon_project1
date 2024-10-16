package com.mkt.test.amazon;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Login_Amazon_Page;

@Listeners(ListernerProgram.class)
public class TestCase4_Edit_User_Profile_information  extends BaseLanchQuit{
	
	
	@Test 
	public void edit_user_profile() throws InterruptedException {
		Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
		l1.mouseOver_singin(driver);
		l1.email();
		l1.continue_button();
		l1.password();
		l1.singin_button();
		l1.mouse_over_on_account_profile(driver);
		l1.validate_manage_profile();
		l1.click_on_view_link(driver);
	    l1.click_on_edit_pencil();
	    l1.edit_user_profile_name();
	    l1.submit_edited_user_profile_name();  
	    l1.validate_user_profile_name_edited_successfully(driver);
		
		
		
	}

}
