/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Iterator;

public class Stack<T> extends SimpleLinkeList<T> {

    public void push(T e) {
        add(0, e);
    }

    public T pop() {
        return remove(0);
    }

    public T peek() {
        return isEmpty() ? null : head.getValue();
    }

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
