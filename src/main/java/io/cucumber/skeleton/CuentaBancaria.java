package io.cucumber.skeleton;

public class CuentaBancaria {
    private int money = 0;
    public void deposit(int pesos) {
        money += pesos;
    }

    public int extract(int pesos) {
        money -= pesos;
        return pesos;
    }

    public int getMoney() {
        return money;
    }

    public void transfer(int pesos) {
        money -= pesos;
    }
}
