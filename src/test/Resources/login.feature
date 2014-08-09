Feature: Login feature

  @Essential
  Scenario: As a valid user I should login succesfully
    Given I am on "https://www.linkedin.com/"
    And I insert userId as "ron.baraskar@gmail.com" in input field id "session_key-login"
    And I insert password as "therock" in input field id "session_password-login"
    When I click on Sigin button having name "signin"
    And I wait for "5" seconds
    Then I should get logged in succesfully

  @Important
  Scenario Outline: Invalid login
    Given I am on "https://accounts.google.com/ServiceLoginAuth"
    When I insert <userid> as userid
    And I insert <password> as password
    Then I get <message> from webpage

    Examples: 
      | userid | password | message                                         |
      |        | password | Enter your email address.                       |
      | abcd   |          | Enter your password                             |
      |        |          | Enter your email address                        |
      | abcd   | abcd     | The email or password you entered is incorrect. |
