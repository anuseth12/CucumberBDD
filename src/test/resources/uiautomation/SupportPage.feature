Feature:Support Page Feature

@support
 Scenario: Verify support options and upgrade details
    Given I am on the Home page
    When I click on support button
    Then I should see options for "One-time payment ($)" and "Monthly support ($5/month)"
    When I navigate to the upgrade section
    Then I should see the text "Ace."
               
    


