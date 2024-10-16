package com.mkt.source.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Amazon_Registration_Page {
	
	
	 @FindBy(id="createAccountSubmit")
	 WebElement create_account_button;
	
	 @FindBy(id="ap_customer_name")
	 WebElement amazon_customer_name;
	 @FindBy(id="ap_phone_number")
	 WebElement phone_number;
	 @FindBy(id="ap_password")
	 WebElement Pass;
	 @FindBy(xpath="//div//a[@class='a-link-emphasis']")
	 WebElement Allready_Have_account_then_Singin;
 
	 @FindBy(xpath="(//div[@id='glow-ingress-block']//span)[1]")
     WebElement userName_In_HomePage;
	

	//step2 
	public void create_amazon_Account() {
		create_account_button.click();
	}
	
	public void userName_In_Home() {
		String userName_in_HomePage_actual = userName_In_HomePage.getText().substring(11, 17);
		String expected="soniya";
		System.out.println("The userName in Home page is : "+userName_in_HomePage_actual);
		Assert.assertEquals(userName_in_HomePage_actual, expected, "failed");
			
	}
	
	public void enter_UserName() {
		 amazon_customer_name.sendKeys("Soniya");
		 
	}
	
	public void enter_PhoneNumber() {
		phone_number.sendKeys("917406501839");		 
	}
	
	
	public void enter_Password() {
		Pass.sendKeys("women123");
		 
	}
	
	
	public void Allready_Have_account_then_click_On_Singin() {
		Allready_Have_account_then_Singin.click();
	}
	public Amazon_Registration_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
    

}
