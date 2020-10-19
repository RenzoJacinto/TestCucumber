Feature: CuentaBancaria

  Scenario: extract cash
    Given I have 1000 pesos in my account
    When I extract 1000 pesos from my account
    Then I should receive 1000 pesos in cash

  #Scenario: deposit cash
  # Given I have 1000 pesos in cash
 # When I deposit 1000 pesos in my account
    #Then there should be 1000 pesos in my account

  #Scenario: transfer money
   # Given I have 1000 pesos in my account
   # When I transfer 1000 pesos to another account
   # Then my account should have lost 1000 pesos