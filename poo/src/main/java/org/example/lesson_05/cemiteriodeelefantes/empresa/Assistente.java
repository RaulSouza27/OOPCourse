package org.example.lesson_05.cemiteriodeelefantes.empresa;

public class Assistente extends Gerente {
    private String departamento;

    public Assistente(String departamento) {
        super(departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
