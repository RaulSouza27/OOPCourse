package org.example.lesson_05.cemiteriodeelefantes.gestao;

import org.example.lesson_05.cemiteriodeelefantes.empresa.Assistente;
import org.example.lesson_05.cemiteriodeelefantes.empresa.Funcionario;
import org.example.lesson_05.cemiteriodeelefantes.empresa.Gerente;

import java.util.List;

public class Rh extends Departamento
{
    private List<Funcionario> funcionarios;

    public Rh(String nome, Gerente gerente)
    {
        super(nome, gerente);
    }

    public List<Funcionario> getFuncionario()
    {
        return funcionarios;
    }

    public void newEmployee(Funcionario novo)
    {
        funcionarios.add(novo);
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
}
