Feature: Ecosia is a nice alternative to google

Scenario Outline: Ecosiaaaa
  Given I opened "<browser>"
  When I search for "ecosia"
  Then I should see the ecosia website

  Examples:
    | browser |
    | Chrome  |
    | Firefox |
    | Safari  |
