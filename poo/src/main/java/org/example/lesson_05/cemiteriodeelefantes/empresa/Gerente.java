package org.example.lesson_05.cemiteriodeelefantes.empresa;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario
{
    private double salario = 5000;
    public Gerente(String nome, String cpf, String matricula, String departamento)
    {
        super(nome,cpf,matricula,departamento);
    }

    public static String work()
    {
        return "Eu sou o Gerente e gerencio meu setor";
    }

    public double getSalario()
    {
        return salario;
    }
}
