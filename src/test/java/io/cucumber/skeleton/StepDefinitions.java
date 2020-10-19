package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class StepDefinitions {

    private CuentaBancaria count;
    private Persona persona;
    private int depositado;

    @Given("^I have (\\d+) pesos in my account$")
    public void I_have_pesos_in_my_account(int pesos) {
        this.count = new CuentaBancaria();
        this.persona = new Persona(count);
        count.deposit(pesos);
        this.depositado = pesos;
    }

    @When("^I extract (\\d+) pesos from my account$")
    public void I_extract_pesos_from_my_account(int pesos) {
        persona.getCash(count.extract(pesos));
    }

    @Then("^I should receive (\\d+) pesos in cash$")
    public void I_should_receive_pesos_in_cash(int pesos) {
        int money = persona.getMoney();
        Assert.assertEquals(money, pesos);
    }

    @Given("^I have (\\d+) pesos in cash$")
    public void I_have_pesos_in_cash(int pesos) {
        this.count = new CuentaBancaria();
    }

    @When("^I deposit (\\d+) pesos in my account$")
    public void I_deposit_pesos_in_my_account(int pesos) {
        count.deposit(pesos);
    }

    @Then("^there should be (\\d+) pesos in my account$")
    public void there_should_be_pesos_in_my_account(int pesos) {
        int money = count.getMoney();
        Assert.assertEquals(money, pesos);
    }

    @When("^I transfer (\\d+) pesos to another account$")
    public void I_transfer_pesos_to_another_account(int pesos) {
        count.transfer(pesos);
    }

    @Then("^my account should have lost (\\d+) pesos$")
    public void my_account_should_have_lost_pesos(int pesos) {
        int money = count.getMoney();
        int dif = depositado - pesos;
        Assert.assertEquals(money, dif);
    }

}
