package uiautomation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages. SupportPageUI;
import com.qa.factory.DriverFactory;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupportPageUISteps {

	private WebDriver driver;
	private SupportPageUI supportPage=new SupportPageUI(DriverFactory.getDriver());
	private String actualtextforonetime;
	private String actualtextformonthlysupport;
	private String actualtextforupgradesection;
	
	@When("I click on support button")
	public void i_click_on_support_button() {
	   
	supportPage.clickSupportbtn();	
	}
	
	

@Then("I should see options for {string} and {string}")
public void i_should_see_options_for_and(String expectedtext1, String expectedtext2) {
  
 actualtextforonetime=supportPage.onetimepaymentText();
		  System.out.println("Actual text for one-time payment is:"+actualtextforonetime );
		  Assert.assertEquals(expectedtext1, actualtextforonetime);
		  
	  actualtextformonthlysupport=supportPage.monthlysupportText();
	  System.out.println("Actual text for Monthly support is:"+actualtextformonthlysupport );
	  Assert.assertEquals(expectedtext2, actualtextformonthlysupport);
		
		
//		        boolean areOptionsDisplayed = supportPage.verifySupportOptions();
//		        Assert.assertTrue("Support options for one-time and monthly are displayed", areOptionsDisplayed);
		    }
	

	@When("I navigate to the upgrade section")
	public void i_navigate_to_the_upgrade_section() {
		supportPage.clickupgradebtn();
		
	}

	@Then("I should see the text {string}")
	public void i_should_see_the_text(String expectedText) {
	   
		 actualtextforupgradesection=supportPage.getupgradesectionText();
	  System.out.println("Actual text for Upgrade Section is:"+actualtextforupgradesection );
	  Assert.assertTrue("User is on upgrade section", actualtextforupgradesection.contains(expectedText));
		
	}


	
	
	
	

}
