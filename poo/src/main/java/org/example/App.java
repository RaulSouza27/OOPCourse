package org.example;


import org.example.lesson_01.models.Pato;

public class App 
{
    public static void main( String[] args )
    {
        Pato pato = new Pato("azul", 8, 7);
        Pato pato1 = new Pato("azul", 8, 7);

        System.out.println(pato.equals(pato1)); // FALSE
    }
}
