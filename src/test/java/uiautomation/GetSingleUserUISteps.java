package uiautomation;

import org.junit.Assert;

import com.pages. GetSingleUserPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetSingleUserUISteps {

	private GetSingleUserPage getPage = new GetSingleUserPage(DriverFactory.getDriver());
	private String actualRequest;
	private String actualResponse;
	private String actualResponsedata;
	
	@When("I select {string}")
	public void i_select(String string) {
	    getPage.clickGetSingleUserbtn();
		
	}

	@Then("I should see the request endpoint as {string}")
	public void i_should_see_the_request_endpoint_as(String expectedRequest) {
		
		  actualRequest=getPage.getRequestText();
		  System.out.println("Actual Request text is:"+actualRequest );
		  Assert.assertEquals(expectedRequest, actualRequest);
	}

	@Then("I should see the response details as {string}")
	public void i_should_see_the_response_details_as(String expectedResponse) {
	 		
			try {
				actualResponse=getPage.getResponseText();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Actual Response text is:"+actualResponse );
		  Assert.assertEquals(expectedResponse, actualResponse);
		
		
	}

	
	@Then("I should see the response as {string}")
	public void i_should_see_the_response_as(String expectedResponsedata) {

	
			actualResponsedata=getPage.getResponseTextdata();
		
		  System.out.println("Actual Request text is:"+actualResponsedata );
		  Assert.assertEquals(expectedResponsedata, actualResponsedata);
		
	}

	
	

}
