package org.example.lesson_05.cemiteriodeelefantes.banco;

public class CaixaEletronico {
    public void sacar(ContaBancaria conta, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }
        
        if (conta.saldo < valor) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }

        conta.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + conta.saldo);
    }

    public void depositar(ContaBancaria conta, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        conta.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + conta.saldo);
    }
}
