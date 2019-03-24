package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LoginTest extends AbstractTest{
	
	
	@Test
	public void verifyLogin() {
		loginComponent.login();
		assertTrue(loginComponent.verifyLoginfunc(),"Verify Login");
	}
	
	
	
	

}
