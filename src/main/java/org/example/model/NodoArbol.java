package org.example.model;

public class NodoArbol {

        private NodoArbol father;
        private NodoArbol left;
        private NodoArbol right;
        private String value;

        public NodoArbol(String value) {
            this.value = value;
        }

        public void setFather(NodoArbol father) {
            this.father = father;
        }


        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void insert(String value) {
            if (this.value.compareTo(value) > 0) {
                if (left == null) {
                    this.left = new NodoArbol(value);
                    this.left.setFather(this);
                } else {
                    this.left.insert(value);
                }
            } else {
                if (right == null) {
                    this.right = new NodoArbol(value);
                    this.right.setFather(this);
                } else {
                    this.right.insert(value);
                }
            }
        }





        //Busca el menor de un árbol - sub-arbol
        public NodoArbol findMin(NodoArbol node) {
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        public NodoArbol findMax(NodoArbol node){
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        public int findHeight(NodoArbol nodo){
            int leftHeight;
            int rightHeight;
            if(nodo == null){
                return -1;
            }else{
                leftHeight = findHeight(nodo.left);
                rightHeight = findHeight(nodo.right);



            }
            return Math.max(leftHeight, rightHeight)+1;



        }











        public String preOrder() {
            String msg = "";
            msg += this.toString() +" ";

            if (this.left != null) {
                msg+=this.left.preOrder();
            }
            if (this.right != null) {
                msg+=this.right.preOrder();
            }
            return msg;
        }


        public String postOrder() {
            String msg = "";
            if (this.left != null) {
                msg=this.left.inOrder();
            }

            if (this.right != null) {
                msg+=this.right.inOrder();
            }
            msg+=this.toString()+" ";
            return msg;
        }


        public String inOrder() {
            String msg = "";
            if (this.left != null) {
                msg=this.left.inOrder();
            }
            msg+=this.toString()+" ";
            if (this.right != null) {
                msg+=this.right.inOrder();
            }
            return msg;
        }

        public String reverseInOrden(){
            String msg = "";
            if (this.right != null) {
                msg=this.right.inOrder();
            }
            msg+=this.toString()+" ";
            if (this.left != null) {
                msg+=this.left.inOrder();
            }
            return msg;

        }

        public String toString() {
            return " "+value;
        }


        public NodoArbol getFather() {
            return father;
        }

        public NodoArbol getLeft() {
            return left;
        }

        public void setLeft(NodoArbol left) {
            this.left = left;
        }

        public NodoArbol getRight() {
            return right;
        }

        public void setRight(NodoArbol right) {
            this.right = right;
        }

}
