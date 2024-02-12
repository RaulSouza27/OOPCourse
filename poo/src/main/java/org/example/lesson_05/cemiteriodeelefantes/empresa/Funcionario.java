package org.example.lesson_05.cemiteriodeelefantes.empresa;

import org.example.lesson_05.cemiteriodeelefantes.gestao.Rh;

public class Funcionario
{
    private String nome;
    private String cpf;
    private String matricula;
    private String departamento;
    private double salario;
    private boolean estaDeFerias;

    public Funcionario(String nome, String cpf, String matricula, String departamento)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.departamento = departamento;
        this.estaDeFerias = Rh.verificaFerias(cpf);
    }
}
 