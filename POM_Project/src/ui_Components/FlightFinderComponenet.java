package ui_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import tests.AbstractTest;

public class FlightFinderComponenet {
	
	@FindBy(name="trip type")
	static List<WebElement> tripTypeRadios;
	
	
	
	public boolean verifyRadiosSize() {
		if(tripTypeRadios.size()==2)
		return true;
		else
			return false;
		
	}
	
	

}
