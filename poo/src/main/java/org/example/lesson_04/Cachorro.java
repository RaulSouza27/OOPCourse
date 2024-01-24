package org.example.lesson_04;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " faz au-au!");
    }

    public void abanarRabo() {
        System.out.println(nome + " abana o rabo.");
    }
}
