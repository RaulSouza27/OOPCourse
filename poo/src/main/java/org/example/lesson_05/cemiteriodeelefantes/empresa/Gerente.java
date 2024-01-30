package org.example.lesson_05.cemiteriodeelefantes.empresa;

import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> subordinados;
    private String departamento;

    public Gerente(String departamento) {
        super("Gerente", "00000000000", "000000");
        this.departamento = departamento;
    }
}
