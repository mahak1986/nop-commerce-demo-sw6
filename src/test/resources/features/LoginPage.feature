#1.loginpage.feature
#Inside loginpage.feature create following scenarios
#1.userShouldNavigateToLoginPageSuccessFully.
#Click on login link
#verify that "Welcome, Please Sign In!" message display

Feature: Login Page Test
  As a user I would like to login to the application successfully

  @Mahak @smoke @sanity @regression
  Scenario: User should navigate to login page successfully
    Given User is on homepage
    When User clicks on login link
    Then User navigates to the login page
    And User verifies the Welcome, Please Sign In! text

    #2. verifyTheErrorMessageWithInValidCredentials.
    #Click on login link
    #Enter EmailId
    #Enter Password
    #Click on Login Button
    #Verify that the Error message

  @Mahak @smoke @regression
  Scenario: verify the error message with invalid credentials
    Given User is on homepage
    When User clicks on login link
    Then User navigates to the login page
    And User enters Email Id "mahak12@gmail.com"
    And User enters Password "Mahak123"
    And User clicks on login button
    Then User verify the error message

      #3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
      #Click on login link
      #Enter EmailId
      #Enter Password
      #Click on Login Button
      #Verify that LogOut link is display

  @Mahak @regression
  Scenario: Verify user should login with valid credentials
    Given User is on homepage
    When User clicks on login link
    Then User navigates to the login page
    And User enters Email Id "mahak123@gmail.com"
    And User enters Password "Mahak123"
    And User clicks on login button
    Then User verifies logout link is displayed

#4. VerifyThatUserShouldLogOutSuccessFully
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Click on LogOut Link
#Verify that LogIn Link Display

  @Mahak @regression
  Scenario: Verify that user should logout successfully
    Given User is on homepage
    When User clicks on register link
    And User selects gender
    And User enters first name
    And User enter last name
    And User selects date of birth
    And User selects month of year
    And User selects year of birth
    And User enters email
    And User enters password
    And User enters confirm password
    And User clicks on register button
    Then User verifies text Your registration completed
    #Given User is on homepage
    When User clicks on login link
    Then User navigates to the login page
    And User enters email
    #And User enters email random email
    #And User enters password
    And User enters password "Mahak123"
    And User clicks on login button
    Then User navigates to the Homepage
    Then User clicks on the logout link
    Then User verifies login link is displayed

