package org.example.ui;


import org.example.model.Control;

public class Main {
    static Control c = new Control();
    public static void main(String[] args) {

        c.crearListaOrdenada();

        System.out.println("Lista original");
        System.out.println(c.getLista());

        c.crearArbolBalanceadoDesdeLista();

        System.out.println();
        System.out.println("Arbol creado");
        System.out.println(c.getArbol());
        System.out.println(c.validateBalancedTree());

        System.out.println("\nAltura");
        System.out.println(c.getHeight());

    }
}