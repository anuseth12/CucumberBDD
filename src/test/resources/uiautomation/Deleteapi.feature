Feature: User Deletion for Delete API

@only-deleteapi
Scenario: Verify request and response after clicking the Delete button API
Given I am on the Home page
When I click on the Delete button API
And I should see the request as "/api/users/2"
Then I should receive a response status code as "204"

