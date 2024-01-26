package org.example.lesson_04.banco;

public class Banco {
    private double saldo;
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {

    }

    public void transferir(double valor, Banco bancoDestino) {

    }

    public double saldo() {
        return 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
