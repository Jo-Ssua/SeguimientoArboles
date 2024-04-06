package org.example.model;

import java.util.ArrayList;

public class Control {

    Lista l = new Lista();
    Tree tree = new Tree();

    public void crearListaOrdenada(){
        l.crearListaSimple("k");
        l.crearListaSimple("l");
        l.crearListaSimple("m");
        l.crearListaSimple("n");
        l.crearListaSimple("o");
        l.crearListaSimple("p");
        l.crearListaSimple("q");

    }
    public String getArbol(){
        return tree.reverseInOrder();
    }

    public String getLista(){
        return l.getListaSimple();
    }

    public String inOrder(){
        return tree.inOrder();
    }

    public String getRoot(){
        return tree.getRoot().getValue();
    }


    public void crearArbolBalanceadoDesdeLista() {
        int n = contarNodos(l.getFirstSimple());
        tree.setRoot(crearArbolBalanceado(l.getFirstSimple(), n));
    }

    private int contarNodos(NodoLista head) {
        int count = 0;
        NodoLista current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    private NodoArbol crearArbolBalanceado(NodoLista start, int n) {
        if (n <= 0) {
            return null;
        }
        NodoArbol leftChild = crearArbolBalanceado(start, ((n)/ 2));


        //Setea la raíz
        NodoArbol root = new NodoArbol(start.getInfo());
        //Subarbol izq
        root.setLeft(leftChild);

        if (start.getNext() != null) {
            start.setInfo(start.getNext().getInfo());
            start.setNext(start.getNext().getNext());
        } else {
            start = null;
        }
        //SubArbol derec
        root.setRight(crearArbolBalanceado(start, n - (n / 2)-1  ));

        return root;
    }

    public String validateBalancedTree(){

        int theoricalHeight = (int)(Math.log(l.getSize())/Math.log(2));
        if(theoricalHeight == getHeight()){

            return "El arbol esta balanceado";
        }else{
            return "te tiraste el seguimiento :( ";
        }




    }



    public int getHeight(){

        return tree.getHeight();


    }
}
