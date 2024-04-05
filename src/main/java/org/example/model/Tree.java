package org.example.model;

import java.util.Objects;

public class Tree {
    private NodoArbol root;

    public void insert(String value){
        if (root==null){
            root=new NodoArbol(value);
        }else {
            root.insert(value);
        }
    }

    public String inOrder(){
        return root==null?"":root.inOrder();
    }
    public String preOrder(){
        return root==null?"":root.preOrder();
    }
    public String postOrder(){
        return root==null?"":root.postOrder();
    }


    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }
}
