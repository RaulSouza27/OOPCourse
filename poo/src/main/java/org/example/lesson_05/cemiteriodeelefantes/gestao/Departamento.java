package org.example.lesson_05.cemiteriodeelefantes.gestao;

import java.util.List;

public class Departamento {
    public String nome;
    public Gerente gerente;
    public List<Empregado> empregados;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void removerEmpregado(Empregado empregado) {
        empregados.remove(empregado);
    }
}
