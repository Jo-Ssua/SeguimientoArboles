package org.example.model;

import java.util.ArrayList;

public class Control {

    Lista l = new Lista();
    Tree tree = new Tree();

    public void crearListaOrdenada(){
        l.crearListaSimple("a");
        l.crearListaSimple("b");
        l.crearListaSimple("c");
        l.crearListaSimple("d");
        l.crearListaSimple("e");
        l.crearListaSimple("f");

        System.out.println(l.getListaSimple());

    }

    public void crearArrayList(){
        ArrayList<String> t = new ArrayList<String>();
        NodoLista n = l.getFirstSimple();

        while (n!= null){
            t.add(n.getInfo());
            n = n.getNext();
        }

        darArreglo(t);
    }

    public void darArreglo(ArrayList<String> t){
        int mid = t.size()/2;
        int i = 0;
        int medio = mid;
        tree.insert(t.get(mid));

        while(i < t.size()){
            if(i < medio){
                medio = medio/2;
                tree.insert(t.get(medio));
            }else{
                medio = (mid+t.size())/2;
                tree.insert(t.get(medio));

            }
            i++;
        }




    }

    public void contar(){
        NodoLista temp = l.getFirstSimple();

        int counter = 0;
        int inicio = 0;

        while (temp != null){
            counter++;
            temp = temp.getNext();

        }

        darInformacionALista(inicio,counter,0, counter, counter/2);


    }

    public void darInformacionALista(int inicio, int finVar, int contador, int fin, int medio){
        NodoLista temp = l.getFirstSimple();
        int mid = finVar/2;
        int i = 0;
        if(contador == fin || contador == medio){
            return;
        }

        while (i < mid && temp != null){
            System.out.println(i);
            i++;

            temp = temp.getNext();
        }

        if(temp != null){
            System.out.println(temp.getInfo());
            tree.insert(temp.getInfo());
        }

        darInformacionALista(0,mid,contador+1, fin, medio);
        darInformacionALista(mid, finVar,contador+1, fin, medio);



    }

    public String getArbol(){
        return tree.inOrder();
    }

    public String getRoot(){
        return tree.getRoot().getValue();
    }


}
