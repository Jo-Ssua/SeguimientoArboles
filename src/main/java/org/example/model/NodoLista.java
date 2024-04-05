package org.example.model;

public class NodoLista {

        private NodoLista next;
        private NodoLista prev;
        private String info;

        public NodoLista(String info){
            this.info = info;
            this.next = null;
            this.prev = null;
        }

        public NodoLista getNext() {
            return next;
        }

        public void setNext(NodoLista next) {
            this.next = next;
        }

        public NodoLista getPrev() {
            return prev;
        }

        public void setPrev(NodoLista prev) {
            this.prev = prev;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

}
