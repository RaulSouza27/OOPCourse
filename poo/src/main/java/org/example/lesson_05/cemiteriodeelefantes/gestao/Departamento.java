package org.example.lesson_05.cemiteriodeelefantes.gestao;

import org.example.lesson_05.cemiteriodeelefantes.empresa.Gerente;

public class Departamento
{
    private String nome;
    private Gerente gerente;

    public Departamento(String nome, Gerente gerente)
    {
        this.nome = nome;
        this.gerente = gerente;
    }
}
