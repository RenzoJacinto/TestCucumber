package io.cucumber.skeleton;

public class Persona {
    private final CuentaBancaria count;
    private int money = 0;

    public Persona(CuentaBancaria count) {
        this.count = count;
    }

    public void getCash(int cash){
        money += cash;
    }

    public int getMoney() {
        return money;
    }
}
