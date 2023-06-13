Feature: Home Page Feature

@home

  Scenario: Verify homepage
    Given I am on the Home page
    Then I should see different request types and endpoints
    |LIST USERS|
|SINGLE USER|
|SINGLE USER NOT FOUND|
|LIST <RESOURCE>|
|SINGLE <RESOURCE>|
|SINGLE <RESOURCE> NOT FOUND|
|CREATE|
|UPDATE|
|UPDATE|
|DELETE|
|REGISTER - SUCCESSFUL|
|REGISTER - UNSUCCESSFUL|
|LOGIN - SUCCESSFUL|
|LOGIN - UNSUCCESSFUL|
|DELAYED RESPONSE|
    When I select "GET SINGLE USER NOT FOUND"
    Then I should see the request endpoint as "/api/users/23"
    And I should see the response details as "404"
    And I should see the response as "{}"
    And I should see a button to navigate to the Support page

