Feature: Startup feature

  Scenario: As a mobile user I will be welcomed
    Then I see the text "Press the 'Start' button to begin timer"

  Scenario: When I start the timer, it will show the finish time
    When I start the timer
    Then I see the text "Timer Will Expire At The Time Below"
    And I should see the time plus 25 minutes
