#2. register.feature
#Insideregister.feature create following scenarios
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#Click on Register Link
#Verify "Register" text

Feature: Register Page test
  As a user I would like to register to the application successfully

  @Mahak @sanity @smoke @regression
  Scenario: Verify user should navigate to register page successfully
    Given User is on homepage
    When User clicks on register link
    Then User navigates to register page
    Then User verifies Register text

      #2.
      #verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
      #Click on Register Link
      #Click on "REGISTER" button
      #Verify the error message "First name is required."
      #Verify the error message "Last name is required."
      #Verify the error message "Email is required."
      #Verify the error message "Password is required."
      #Verify the error message "Password is required."

  @Mahak @smoke @regression
  Scenario: Verify First Name,Last Name,Email,Password,Confirm Password
    Given User is on homepage
    When User clicks on register link
    And User clicks on register button
    Then User verifies error message First name is required
    And User verifies error message Last name is required
    And User verifies error message Email is required
    And User verifies error message Password is required
    And User verifies error message Confirm Password is required

#2. verifyThatUserShouldCreateAccountSuccessfully
#Click on Register Link
#Select gender "Female"
#Enter firstname
#Enter lastname
#Select day
#Select month
#Select year
#Enter email
#Enter password
#Enter Confirm Password
#Click on "REGISTER" button
#Verify message "Your registration completed"

  @Mahak @regression
    Scenario: verify user should create account successfully
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


