package org.example.lesson_05.polimorfismo;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
