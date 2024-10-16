package com.mkt.test.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseLanchQuit extends  ListernerProgram{
	
	
	//WebDriver driver;
	@BeforeMethod
	//@Parameters("browser")
	//@Test
	public void launchBrowser(  ) {		
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();		
	}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		//driver.close();
		
	}

}
