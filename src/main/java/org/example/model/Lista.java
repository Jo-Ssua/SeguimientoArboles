package org.example.model;

public class Lista {

    private NodoLista firstSimple;
    private NodoLista lastSimple;
    private int size;

    public Lista(){

    }

    public void crearListaSimple(String info){
        NodoLista temp = new NodoLista(info);
        if (firstSimple == null){
            firstSimple = temp;
            lastSimple = firstSimple;
            size++;
        }else {
            if (firstSimple.getNext() == null) {
                firstSimple.setNext(temp);
            }
            lastSimple.setNext(temp);
            lastSimple = temp;
            size++;

        }

    }

    public String getListaSimple(){
        NodoLista current = firstSimple;
        String msg = "";
        while (current != null){
            msg += "["+current.getInfo()+ "]";
            current=current.getNext();

        }
        return msg;
    }


    public NodoLista getFirstSimple() {
        return firstSimple;
    }

    public void setFirstSimple(NodoLista firstSimple) {
        this.firstSimple = firstSimple;
    }

    public NodoLista getLastSimple() {
        return lastSimple;
    }

    public void setLastSimple(NodoLista lastSimple) {
        this.lastSimple = lastSimple;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
