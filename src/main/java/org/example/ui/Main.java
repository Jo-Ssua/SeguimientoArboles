package org.example.ui;


import org.example.model.Control;

public class Main {
    static Control c = new Control();
    public static void main(String[] args) {

        c.crearListaOrdenada();
        c.crearArrayList();
        System.out.println(c.getArbol());
        System.out.println(c.getRoot());

    }
}