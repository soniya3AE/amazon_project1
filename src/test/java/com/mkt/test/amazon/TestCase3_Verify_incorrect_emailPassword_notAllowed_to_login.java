package com.mkt.test.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Login_Amazon_Page;

@Listeners(ListernerProgram.class)
public class TestCase3_Verify_incorrect_emailPassword_notAllowed_to_login extends BaseLanchQuit {

	
	@Test
	public void incorrect_Email_Password_Not_allowed_Login() throws InterruptedException {
		Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
		l1.mouseOver_singin(driver);
		/*validate the in incorrect phone number*/
		l1.enter_incorrect_phoneNumber();
		l1.continue_button();
		l1.validate_incorrect_phone();
		
		/*validate the in incorrect password */
		//l1.enter_incorrect_password();
		//l1.singin_button();
		//l1.validate_incorrect_passsword();		
	}
	
	
	
}
