package uiautomation;

import java.util.List;

import org.junit.Assert;

import com.pages. HomePageUI;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageUISteps {

	
	private HomePageUI homePage = new HomePageUI(DriverFactory.getDriver());
		
	@Then("I should see different request types and endpoints")
	public void i_should_see_different_request_types_and_endpoints(DataTable RequestTable) {
	  
		
		List<String> expectedRequestNameList= RequestTable.asList();
		System.out.println("Expected Request List Names are: "+expectedRequestNameList);
		List<String> ActualRequestNameList= homePage.getRequestSectionsList();
		System.out.println("Actual Request List Names are: "+ActualRequestNameList);
		Assert.assertEquals("Request list names matches", expectedRequestNameList, ActualRequestNameList);
		
	}

	@Then("I should see a button to navigate to the Support page")
	public void i_should_see_a_button_to_navigate_to_the_support_page() {
	    
	
		boolean isSupportButtonDisplayed = homePage.supportbtnpresent();
        Assert.assertTrue("Support Button is displayed", isSupportButtonDisplayed);
	}


	
	
	
	
	

}
