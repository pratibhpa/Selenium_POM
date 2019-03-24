package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ui_Components.FlightFinderComponenet;
import ui_Components.LoginComponents;

public class AbstractTest {

	LoginComponents loginComponent;
	FlightFinderComponenet flightFinderComponent;
		WebDriver driver;
		
		public AbstractTest() {
			loginComponent= new LoginComponents();
			flightFinderComponent=new FlightFinderComponenet();
		}
		
		@BeforeTest
		public void setUpEnvironment() {
			System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.newtours.demoaut.com/");
			PageFactory.initElements(driver, loginComponent);
		}
		
		@AfterTest
		public void closeEnvironment() {
			driver.close();
		}
		
		
		
		
		
		
		
	

}

