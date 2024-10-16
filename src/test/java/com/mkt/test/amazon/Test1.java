package com.mkt.test.amazon;


	
	
	
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Amazon's price range slider page
            driver.get("https://www.amazon.com/s?k=your+search+term");

            // Locate the slider elements
            WebElement minSlider = driver.findElement(By.xpath("//div[@id='leftNav']//span[@aria-label='Min']/parent::div"));
            WebElement maxSlider = driver.findElement(By.xpath("//div[@id='leftNav']//span[@aria-label='Max']/parent::div"));

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Move the min slider (adjust offset values as necessary)
            actions.clickAndHold(minSlider).moveByOffset(30, 0).release().perform();

            // Move the max slider (adjust offset values as necessary)
            actions.clickAndHold(maxSlider).moveByOffset(-30, 0).release().perform();

            // Add some wait to observe the result (not recommended for real test cases)
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

