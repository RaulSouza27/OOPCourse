package org.example.lesson_05.cemiteriodeelefantes.banco;

public class CaixaEletronico
{
    public void sacar(ContaBancaria conta, double valor)
    {
        // é melhor usar o método sacar para alterar o valor do saldo
        if (conta.sacar(valor))
        {
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + conta.getSaldo()); // foi feita a alteração para usar o método que retorna o valor
        }
        else
        {
            System.out.println("IMPOSSIVEL SACAR!!!");
        }

    }

    public void depositar(ContaBancaria conta, double valor)
    {
        if (valor <= 0)
        {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        conta.depositar(valor);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + conta.getSaldo());
    }

    public void verSaldo(ContaBancaria conta)
    {
        System.out.println("Seu saldo é: R$" + String.valueOf(conta.getSaldo()));
    }
}
