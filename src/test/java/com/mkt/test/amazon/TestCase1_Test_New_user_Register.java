package com.mkt.test.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.amazon.Amazon_Registration_Page;
import com.mkt.source.amazon.Login_Amazon_Page;


@Listeners(ListernerProgram.class)
public class TestCase1_Test_New_user_Register   extends BaseLanchQuit{
	
	//WebDriver driver;
	
	@Test
	public void Verify_sucessfully_register() throws InterruptedException {
		
		Login_Amazon_Page l1 = new Login_Amazon_Page(driver);
		l1.mouseOver_singin(driver);
		Amazon_Registration_Page a1 = new Amazon_Registration_Page(driver);
		a1.create_amazon_Account();
		a1.enter_UserName();
		a1.enter_Password();
		a1.enter_PhoneNumber();
	
		

		
		
		
        
	
	}
	
	

}
