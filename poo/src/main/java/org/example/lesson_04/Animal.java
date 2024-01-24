package org.example.lesson_04;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println(nome + " faz um som.");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
