package org.example.lesson_04.problema;

public class Avo {
    private String sobrenome;

    public Avo(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void mostrarInfo() {
        System.out.println("Sobrenome: " + getSobrenome());
    }
}
