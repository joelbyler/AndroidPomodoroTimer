Feature: Startup feature

  Scenario: As a user I will be welcomed
    Then I see the text "Press the 'Start' button to begin timer"

  Scenario: When I start the timer, it will show the finish time
    When I press the "Start" button
    Then I see the text "Timer Will Expire At The Time Below"
