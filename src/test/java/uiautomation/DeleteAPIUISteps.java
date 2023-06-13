package uiautomation;

import org.junit.Assert;

import com.pages. DeleteAPIUIPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAPIUISteps {

	
	private DeleteAPIUIPage delPage = new DeleteAPIUIPage(DriverFactory.getDriver());
	 private String actualRequest;
	 private String actualResponse;
	
	@Given("I am on the Home page")
	public void i_am_on_the_home_page() {
		DriverFactory.getDriver().get("https://reqres.in/");
	}

	@When("I click on the Delete button API")
	public void i_click_on_the_delete_button_api() {
	   delPage.clickDeleteButton();
	}

	@When("I should see the request as {string}")
	public void i_should_see_the_request_as(String expectedRequest) {
		
	  actualRequest=delPage.getRequestText();
	  System.out.println("Actual Request text is:"+actualRequest );
	  Assert.assertEquals(expectedRequest, actualRequest);
	}

	@Then("I should receive a response status code as {string}")
	public void i_should_receive_a_response_status_code_as(String expectedResponse) {
		
		try {
			actualResponse=delPage.getResponseText();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 System.out.println("Actual Response text is:"+actualResponse );
		  Assert.assertEquals(expectedResponse, actualResponse);
		  
		
	}
	
	
	
	
	

}
