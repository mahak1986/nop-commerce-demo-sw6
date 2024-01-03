#3. computerpage.feature
#Inside computerpage.feature create following scenarios
#1. verifyUserShouldNavigateToComputerPageSuccessfully
#Click on Computer tab
#Verify "Computer" text


@Mahak @smoke @sanity @regression
Feature: Computer page feature
  As a user I would like to navigate to the computer page successfully

  Scenario: User should navigate to the computer page successfully
    Given User is on homepage
    And User clicks on computer tab
    Then User navigates to computer page
    Then User verifies Computer text

    #2. verifyUserShouldNavigateToDesktopsPageSuccessfully
    #Click on Computer tab
    #Click on Desktops link
    #Verify "Desktops" text

  @Mahak @smoke @regression
  Scenario: User should navigate to the desktops page successfully
    Given  User is on homepage
    And User clicks on computer tab
    Then User clicks on desktops link
    Then User navigates to Desktops page
    Then User verifies Desktops text

    #3. verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    #Click on Computer tab
    #Click on Desktops link
    #Click on product name "Build your own computer"
    #Select processor "processor"
    #Select RAM "ram"
    #Select HDD "hdd"
    #Select OS "os"
    #Select Software "software"
    #Click on "ADD TO CART" Button
    #Verify message "The product has been added to your shopping cart"
    #DATA SET
    #| processor | ram | hdd | os | software |
    #| 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB | Vista Home [+$50.00] |
    #Microsoft Office [+$50.00] |
    #| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] |
    #Vista Premium [+$60.00] | Acrobat Reader [+$10.00] |
    #| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB | Vista
    #Home [+$50.00] | Total Commander [+$5.00] |

  @Mahak @regression
  Scenario Outline: User should build your own computer page and add them to cart successfully
    Given  User is on homepage
    When User clicks on computer tab
    Then User clicks on desktops link
    Then User navigates to Desktops page
    And User should click on Build your own computer product
    Then User should navigate to build your own computer page
    And     User select processor "<processor>"
    And     User select RAM "<ram>"
    And     User select HDD "<hdd>"
    And     User select Os "<os>"
    And     User select software "<software>"
    And     User click on Add to cart button
    Then    User verify message the "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                    |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00]  |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]    |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]    |

