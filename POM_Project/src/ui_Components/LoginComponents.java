package ui_Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_queries.servicesCall;

public class LoginComponents {
	
	@FindBy(name="userName")
	WebElement usernameEditBox;
	
	@FindBy(name="password")
	WebElement passwordEditBox;
	
	
	@FindBy(xpath="//*[@name='login']")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@src='/images/spacer.gif'][1]//following::font]")
	WebElement loginVerificationText;
	
	public void login() {
		usernameEditBox.sendKeys("batman");
		passwordEditBox.sendKeys("batman");
		loginButton.click();
		
	}
	
	
	public boolean verifyLoginfunc() {
		String actualText=loginVerificationText.getText();
		String expectedText=servicesCall.getLoginVerificationText();
		if(actualText.equals(expectedText))
			return true;
		else
			return false;
		
	}

}
