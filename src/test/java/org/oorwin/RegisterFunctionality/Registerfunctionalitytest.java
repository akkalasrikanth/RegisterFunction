package org.oorwin.RegisterFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterfunctionalityTest {
	@Test
	public void registerfunctionalityTestt() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();

		    // Open the NxtTrendz registration page
		    driver.get("https://rahulnxttrends.ccbp.tech/");

		    // Find the username input element
		    WebElement nameField = driver.findElement(By.name("name"));
		    nameField.sendKeys("rahul");

		    // Find the email input element
		    WebElement emailField = driver.findElement(By.name("email"));
		    emailField.sendKeys("rahul@example.com");
		    // Find the password input element
		    WebElement passwordField = driver.findElement(By.name("password"));
		    passwordField.sendKeys("rahul@2021");

		    // Find the male radio button
		    WebElement genderField = driver.findElement(By.id("male"));
		    genderField.click();

		    // Find the country dropdown element
		    WebElement countryDropdown = driver.findElement(By.id("country"));
		    Select countrySelect = new Select(countryDropdown);

		    // Select an option by visible text
		    countrySelect.selectByVisibleText("India");

		    // Select the checkbox
		    WebElement termsAndConditions = driver.findElement(By.id("terms"));
		    termsAndConditions.click();

		    // Submit the registration form
		    WebElement registerButton = driver.findElement(By.id("submitBtn") );
		    registerButton.submit();
	}

}
