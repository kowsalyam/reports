Feature: Register

  Scenario: New user reg
    Given url
    And enter the username "mkmkmk11"
    And enter the firstname "mahi"
    And enter the lastname "zintha"
    And enter the password "password1234"
    And enter the confirm password "password1234"
    And enter the gender Female
    And enter the email "kowsalyamath12i@gmail.com"
    And enter the  mobile "7896554453"
    And enter the dob "08/08/1993"
    And enter the address "chennaivelachery"
    And i click the security question
    And i give security answer "white"
    When i click register button
    Then i see my home page
