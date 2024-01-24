package org.example.lesson_04.problema;

public class Pai extends Avo {
    private String nome;

    public Pai(String nome, String sobrenome) {
        super(sobrenome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nome: " + getNome());
    }
}
