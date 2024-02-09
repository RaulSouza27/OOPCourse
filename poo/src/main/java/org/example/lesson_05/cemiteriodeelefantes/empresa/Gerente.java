package org.example.lesson_05.cemiteriodeelefantes.empresa;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<Assistente> subordinados;

    public Gerente(String nome, String cpf, String matricula, String departamento)
    {
        super(nome,cpf,matricula,departamento);
        this.subordinados = new ArrayList<>();
    }

    public void adminEmployee(Assistente novo)
    {
        subordinados.add(novo);
    }

    public List<Assistente> getSubordinados()
    {
        return subordinados;
    }
}
