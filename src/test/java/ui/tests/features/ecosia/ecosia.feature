Feature: Ecosia is a nice alternative to google

Scenario Outline: Where to find Ecosia
  Given I opened "<browser>"
  When I search for "ecosia"
  Then I should see the ecosia website

  Examples:
    | browser |
    | Chrome  |
    | Firefox |
    | Safari  |


