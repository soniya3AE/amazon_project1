package com.mkt.source.amazon;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Login_Amazon_Page {

	// static WebDriver driver;

	// step 1 : define the webElement using Find by annotation
	@FindBy(id = "ap_email")
	WebElement email_tf;
	@FindBy(id = "continue")
	WebElement continue_button;
	@FindBy(id = "ap_password")
	WebElement pass_tf;
	@FindBy(id = "signInSubmit")
	WebElement signin_button;
	@FindBy(xpath = "//div[@id='auth-error-message-box']//span")
	WebElement incorrectPassword;
	@FindBy(xpath = "(//span[@class='a-list-item'])[1]")
	WebElement incorrectPhoneNumber;
	@FindBy(xpath = "//a[@id='nav-link-accountList']")

	/* TestCase 5 Weblement */
	WebElement account_profile;
	@FindBy(xpath = "//span[@data-testid='manage-profiles-button']")
	WebElement manageProfile;
	@FindBy(partialLinkText = "View")
	WebElement manage_profile_viewLink;
	@FindBy(xpath = "//span[@class='editProfile']")
	WebElement edit_pencil;
	@FindBy(xpath = "//input[@id='editProfileNameInputId']")
	WebElement edit_user_profile_name;

	@FindBy(xpath = "//span[@id='editProfileContinueButton']")
	WebElement submit_user_profile_name_changes;

	@FindBy(xpath = "//div[@class='profile-name desktop']")
	WebElement user_profile_name_after_edit;

	/* Test case5 */
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchProduct;
	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
	WebElement searched_product_name;

	/* Test case 6 */
	@FindBy(xpath = "//a[@class='a-link-normal s-navigation-item'][1]")
	WebElement category_wise_search;

	/* Test case 7 */
	@FindBy(xpath = "(//img[@class='s-image s-image-optimized-rendering'])[1]")
	WebElement select_product;
	@FindBy(xpath = "//div[@id='corePriceDisplay_desktop_feature_div']//span[@class='a-price-whole']")
	WebElement selected_product_price;
	@FindBy(xpath="//div[@id='detailBulletsWrapper_feature_div']//h2")
	WebElement product_details;
	

	@FindBy(xpath="(//div[@class='a-expander-content reviewText review-text-content a-expander-partial-collapse-content'])[1]'")
	WebElement customer_review;
	
	@FindBy(id="nav-link-accountList")
	WebElement account_List;
	
	@FindBy(xpath="(//a[@data-nav-role='signin']//span[@class='nav-action-inner'])[1]")
	WebElement singin_link;
	
//	@FindBy(xpath="//div[@class='a-section s-range-input-container s-upper-bound']")
	@FindBy(xpath="//div[@class='a-section a-spacing-base a-spacing-top-base s-slider-container']")
	WebElement slider;
	
	@FindBy(xpath="//div[@id='filter-p_36']//span[@class='a-size-base a-color-base puis-bold-weight-text']")
	WebElement price_category;
	
	
	@FindBy(xpath="//div[@class='a-section s-range-input-container s-lower-bound aok-relative']//input[@min='0']")
	WebElement min_price;
	
	
	@FindBy(xpath="//div[@class='a-section s-range-input-container s-lower-bound aok-relative']//input[@max='187']")
	WebElement max_price;
	
	

	
	
	
	// Step2 : define the method for webElement
	
	public void  mouseOver_singin(WebDriver driver) {
		Actions action1 = new Actions(driver);
		action1.moveToElement(account_List).perform();
		singin_link.click();	
	}
	
	
	
	
	
	
	
	public void email() throws InterruptedException {
		Thread.sleep(2000);
		email_tf.sendKeys("7406501839");
	
	}
	
	public void email2() throws InterruptedException {
		Thread.sleep(2000);
		email_tf.sendKeys("8828340839");
	}


	public void continue_button() {
		continue_button.click();
	}

	public void password() {
		pass_tf.sendKeys("Amma@123");
	}
	
	
	public void password2() {
		pass_tf.sendKeys("Appu@5997");
	}

	public void enter_incorrect_phoneNumber() throws InterruptedException {
		Thread.sleep(2000);
		email_tf.sendKeys("asds");
	}

	public void enter_incorrect_password() {
		pass_tf.sendKeys("Amma@12");
	}

	public void singin_button() {
		signin_button.click();
	}

	public void validate_incorrect_passsword() {
		String incorrect_Password_actual_text = incorrectPassword.getText();
		System.out.println("Incorrect password error message :" + incorrect_Password_actual_text);
		String expected_error = "Your password is incorrect";
		Assert.assertEquals(incorrect_Password_actual_text, expected_error);
	}

	public void validate_incorrect_phone() {
		String incorrect_Phonenumber_actual_text = incorrectPhoneNumber.getText();
		System.out.println("Incorrect password error message :" + incorrect_Phonenumber_actual_text);
		String expected_error = "We cannot find an account with that email address";
		Assert.assertEquals(incorrect_Phonenumber_actual_text, expected_error);
	}

	public void mouse_over_on_account_profile(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(account_profile).build().perform();
		action.click();
	}

	public void validate_manage_profile() {
		manageProfile.click();
	}

	public void click_on_view_link(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(manage_profile_viewLink).build().perform();
		// action.click();
		manage_profile_viewLink.click();
	}

	public void click_on_edit_pencil() throws InterruptedException {
		// Thread.sleep(2000);
		edit_pencil.click();
	}

	public void edit_user_profile_name() {
		edit_user_profile_name.clear();
		edit_user_profile_name.sendKeys("sonu");

	}

	public void submit_edited_user_profile_name() {
		submit_user_profile_name_changes.click();
	}

	public void validate_user_profile_name_edited_successfully(WebDriver driver) {

		String actual_user_name = "sonu";
		System.out.println("actual_user_name:" + actual_user_name);
		driver.navigate().refresh();
		String expected_user_name = user_profile_name_after_edit.getText();
		System.out.println("expected_user_name:" + expected_user_name);
		Assert.assertEquals(actual_user_name, expected_user_name);

	}

	/* Test case 5 Method */
	public void enter_product_name_to_search_product() {
		searchProduct.sendKeys("shoe");
		searchProduct.sendKeys(Keys.ENTER);
	}

	public void validate_searched_product_result(WebDriver driver) {
		String expected_result = "shoe";
		String actual_result = driver.getTitle();
		if (actual_result.contains(expected_result)) {
			Assert.assertTrue(true);
		}

	}

	/* Test case 6 */
	public void validate_category_wise_search() {
		String expected_result = "shoe";
		String category_result = category_wise_search.getText();
		System.out.println("actula category wise search :" + category_result);
		if (category_result.contains(expected_result));
		Assert.assertTrue(true);
	}

	
	
	public void validate_price_wise_search(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.clickAndHold(min_price).moveByOffset(30, 0).release().perform();
		
		Reporter.log("price");
		System.out.println("price");
		
	}
	
	
	/* Test case 7 */
	public void validate_select_searched_product(WebDriver driver) {
		select_product.click();
		String pid = driver.getWindowHandle();
		System.out.println("pid :" + pid);
		Set<String> cid = driver.getWindowHandles();
		System.out.println("the child id : " + cid);

		Iterator<String> ccid = cid.iterator();
		String parentpid = ccid.next();
		String childid = ccid.next();
		driver.switchTo().window(childid);
	}
	public void validate_product_price() {
	String price =  selected_product_price.getText();
	System.out.println("the selected product price is : "+ price);
	boolean selected_product_displayed_on_product_details_page = selected_product_price.isDisplayed();
	Assert.assertTrue(true);		
	}
	
	public void validate_product_details() {
		
	String product_details_page= 	product_details.getText();
	System.out.println("The product details are : "+ product_details_page);
	product_details.isDisplayed();
	Assert.assertTrue(true);
	}
	
	
	public void verify_customer_review() {
	   String customer_review_details= customer_review.getText();
	   System.out.println(customer_review_details);
	    customer_review.isDisplayed();
	    Assert.assertTrue(true);
	}
	
	
	
	
	
	// step3
	public Login_Amazon_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
