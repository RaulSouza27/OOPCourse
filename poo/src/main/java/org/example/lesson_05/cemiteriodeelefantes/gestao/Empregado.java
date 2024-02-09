package org.example.lesson_05.cemiteriodeelefantes.gestao;


public class Empregado
{
    private String nome;
    private String cpf;
    private double salario;
    private boolean estaDeFerias;
    private String departamento;
    private String cargo;

    public Empregado(String nome, String cpf, String departamento, String cargo)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = Rh.setSalario(cargo);
        this.estaDeFerias = Rh.verificaFerias(cpf);
    }

    public void mudarDepartamento(String novoDepartamento)
    {
        this.departamento = novoDepartamento;
        // Lógica para mudança de departamento
    }

    public String getNome()
    {
        return nome;
    }
    public String getCpf()
    {
        return cpf;
    }
    public double getSalario()
    {
        return salario;
    }
    public boolean getEstaDeFerias()
    {
        return estaDeFerias;
    }
    public String getDepartamento()
    {
        return departamento;
    }
    public String getCargo()
    {
        return cargo;
    }

}
