Feature: Get Single user not found

@only-getsingleuser

Scenario: Verify request and response details
    Given I am on the Home page
    When I select "GET SINGLE USER NOT FOUND"
    Then I should see the request endpoint as "/api/users/23"
    And I should see the response details as "404"
    And I should see the response as "{}"


