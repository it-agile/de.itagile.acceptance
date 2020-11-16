Feature: it-agile in titel of it-agile.de
  Scenario: Can find it-agile in the title of it-agile.de
    Given I am surfing on "https://www.it-agile.de"
    When I look at the title
    Then I can see "it-agile" in the title