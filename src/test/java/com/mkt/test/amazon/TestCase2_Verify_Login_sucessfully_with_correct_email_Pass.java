package com.mkt.test.amazon;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Amazon_Registration_Page;
import com.mkt.source.amazon.Login_Amazon_Page;


@Listeners(ListernerProgram.class)
 public class TestCase2_Verify_Login_sucessfully_with_correct_email_Pass  extends  BaseLanchQuit {
	
	// ChromeDriver  driver;
	
	@Test
	public void Login_sucesfully_with_correct_email_Password() throws InterruptedException {
	
	    Login_Amazon_Page l1 = new Login_Amazon_Page(driver); 
		l1.mouseOver_singin(driver);
	    l1.email();
	    l1.continue_button();
	    l1.password();
	    l1.singin_button();
	    
	    Amazon_Registration_Page a1 = new Amazon_Registration_Page(driver);
	   a1.userName_In_Home();
	    
		
	}

}
