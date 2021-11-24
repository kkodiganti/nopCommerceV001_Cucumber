Feature: nopcommerce Login Feature

  Scenario: Successful login valid credentials
    Given user launches Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    When Page Title should be "Dashboard / nopCommerce administration"
    And Close Browser


