/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;


public class Stack<T> extends SimpleLinkeList<T> {

    //Método para añadir un nodo a la pila.
    public void push(T e) {
        add(0, e);
    }

    //Método para eliminar un nodo.
    public T pop() {
        return remove(0);
    }

    public T peek() {
        return isEmpty() ? null : head.getValue();
    }

    //Método para obtener el valor de una posición en específico.
    public T getValue(int index) {
        if (isEmpty() == true) {
            return null;
        }
        while (!head.getValue().equals(index)) {
            head = head.getNext();

            if (head.getNext().equals(null)) {
                return null;
            }
        }
        return head.value;

    }

}
