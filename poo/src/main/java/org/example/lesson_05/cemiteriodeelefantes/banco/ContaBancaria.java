package org.example.lesson_05.cemiteriodeelefantes.banco;

public class ContaBancaria
{
    private int numeroConta; // os modificadores de acesso estavam como public
    private double saldo; // os modificadores de acesso estavam como public

    // se faz necessário criar o get de saldo da conta

    public double getSaldo()
    {
        return saldo;
    }

    public ContaBancaria(int numeroConta)
    {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }

    public ContaBancaria(int numeroConta, double valor)
    {
        this.numeroConta = numeroConta;
        this.saldo = valor;
    }

    public void depositar(double valor)
    {
        if (valor > 0)
        {
            saldo += valor;
        }
        else
        {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor)
    {
        if (valor > 0 && saldo >= valor)
        {
            saldo -= valor;
            return true;
        }
        else
        {
            System.out.println("Saque inválido ou saldo insuficiente.");
            return false;
        }
    }
}
