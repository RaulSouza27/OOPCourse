package org.example.lesson_05.cemiteriodeelefantes.empresa;

public class Assistente extends Funcionario
{
    private double salario = 2000;
    public Assistente(String nome, String cpf, String matricula, String departamento)
    {
        super(nome,cpf,matricula,departamento);
    }

    public static String work()
    {
        return "Eu sou assistente e trabalho dando assistencia ao meu gerente";
    }

    public double getSalario()
    {
        return salario;
    }
}
