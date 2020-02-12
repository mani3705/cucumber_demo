Feature: Is it Friday yet?
  Everybody wants to know if its Friday

  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether its Friday yet
    Then I should be told the "<answer>"
    Examples:
      | day            | answer|
      | Friday         | TGIF  |
      | Sunday         | Nope  |
      | anything else! | Nope  |












#Feature: Is it Friday yet?
#  Everybody wants to know when its Friday
#
#  Scenario: Sunday isn't Friday
#    Given today is Sunday
#    When I ask whether its Friday yet
#    Then I should be told "Nope"
#
#  Scenario: Friday is Friday
#    Given today is Friday
#    When I ask whether its Friday yet
#    Then I should be told "TGIF"