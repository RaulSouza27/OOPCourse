package org.example.lesson_05.cemiteriodeelefantes.gestao;

import java.util.List;

public class Rh extends Departamento
{
    private List<Empregado> empregados;

    public Rh(String nome, Gerente gerente)
    {
        super(nome, gerente);
    }

    public List<Empregado> getEmpregados()
    {
        return empregados;
    }

    public void newEmployee(Empregado novo)
    {
        empregados.add(novo);
    }

    public static boolean verificaFerias(String cpf)
    {
        double admissao = 1; // valores de exemplo para indicar a data
        double dataAtual = 1; // valores de exemplo para indicar a data
        double umAnoDeEmpresa = 1; // valores de exemplo para indicar a data

        if ((dataAtual - admissao) == umAnoDeEmpresa)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double setSalario(String cargo)
    {
        if (cargo == "assistente")
        {
            return 2000;
        }
        else if (cargo == "gerente")
        {
            return 5000;
        }
        else
        {
            return 0;
        }

    }
}
