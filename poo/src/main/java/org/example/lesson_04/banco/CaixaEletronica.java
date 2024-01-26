package org.example.lesson_04.banco;

public class CaixaEletronica {
    private final Banco banco;

    public CaixaEletronica(Banco banco) {
        this.banco = banco;
    }

    public void sacar1(double valor) {
        if (valor <= banco.saldo()){
            banco.setSaldo(banco.saldo() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void sacar2(double valor) {
        banco.sacar(valor);
    }

    public void depositar(double valor) {
        banco.depositar(valor);
    }

    public void transferir(double valor, Banco bancoDestino) {
        banco.transferir(valor, bancoDestino);
    }

    public double saldo() {
        return banco.saldo();
    }
}
