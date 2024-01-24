package org.example.lesson_04.problema;

public class Filho extends Pai {
    private String brinquedoFavorito;

    public Filho(String nome, String sobrenome, String brinquedoFavorito) {
        super(nome, sobrenome);
        this.brinquedoFavorito = brinquedoFavorito;
    }

    public String getBrinquedoFavorito() {
        return brinquedoFavorito;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Brinquedo Favorito: " + getBrinquedoFavorito());
    }
}
