/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Lottery.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @param <T>
 */
public class LPriorityQueueFinal<T extends Comparable<T>> extends SimpleLinkeList<T> implements List<T> {

    //Atributos
    private SimpleNode<T> back;
    private int size;
    private SimpleNode<T> front;
    private int incomeCounter;
    private int outcomeCounter;

    //Constructor
    public LPriorityQueueFinal() {
        this.front = new SimpleNode<>();
        this.back = this.front;
        this.size = 0;
        this.incomeCounter = 0;
        this.outcomeCounter = 0;
    }

    //Método para sacar el elemento de la cola.
    public T dequeque() {
        if (size == 0) {
            return null;
        } else {

            SimpleNode tempNode = this.front;
            T tempValue = (T) this.front.getValue();

            this.front = front.getNext();

            tempNode = null;

            if (this.back == tempNode) {
                this.back = this.front;
            }
            size--;
            return tempValue;
        }
    }

    //Método para verificar el tamaño.
    @Override
    public int size() {
        return this.size;
    }

    //Método para si la cola está vacía.
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    //Para  evaluar la edad de las ordenes. 
    @Override
    public boolean contains(Object o) {
        if (size == 0) {
            return false;
        }
        SimpleNode temp = this.front;

        while (!temp.getNext().equals(this.back)) {

            if (temp.getNext().getValue().equals(o)) {
                return true;
            }
            temp = temp.getNext();
        }

        return false;
    }

    //Método iterador.
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            SimpleNode<T> current = front;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T result = current.getValue();
                current = current.getNext();
                return result;
            }
        };
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(T e) {
        //Se crea un nuevo nodo con el elemento a insertar
        SimpleNode<T> newNode = new SimpleNode(e);
        if (this.size == 0) {
            this.front = newNode;
            this.back = front;
        }
        int position = 0;
        int curr = size();
        back.setNext(new SimpleNode(null));
        back = back.getNext();
        SimpleNode<T> tempNode = back;  //Nodo tempNode para recorrer la cola

        while (curr > 0) {
            T client = e;
            T client2 = tempNode.getPrevious().getValue();
            if (client2.compareTo(client) <= 0) {
                break;
            }
            tempNode = tempNode.getPrevious();
            curr--;
            position++;
        }

        this.add(size() - position, e);
        this.size++;
        incomeCounter++;
        return true;
    }

    //Método para eliminar el primer nodo de la cola.
    @Override
    public boolean remove(Object o) {
        SimpleNode current = this.front;

        if (this.front == null) {
            return false;
        }

        if (this.front.getValue().equals(o)) {
            size--;
            front = current.getNext();
            return true;
        }

        while (current.getNext() != null && !current.getNext().value.equals(o)) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return false;
        }

        current.setNext(current.getNext().getNext());

        size--;

        return true;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Método vaciar la cola.
    @Override
    public void clear() {
        this.size = 0;
        front = null;

    }

    //Método para obtener el objeto en la posición deseada.
    @Override
    public T get(int index) {

        SimpleNode current = this.front;
        if (size == 0) {
            return null;
        }
        int counter = index;

        while (counter - 1 > 0) {
            if (current.getNext().getValue() == null) {
                return null;
            }
            counter--;
            current = current.getNext();
        }

        return (T) current.getValue();
    }

    //Método para definir el objeto del nodo deseado(indicado por su posición).
    @Override
    public T set(int index, T element) {
        SimpleNode<T> current = front;
        while (index-- > 0) {
            current = current.getNext();

        }
        T previous = current.getValue();
        current.setValue(element);
        return previous;

    }

    //Método añadir un elemento en la posición deseada.
    @Override
    public void add(int index, T element) {
        SimpleNode<T> current = this.front;
        SimpleNode<T> newNode = new SimpleNode<T>(null, element);

        if (isEmpty()) {
            this.front = newNode;

        } else {
            if (size == 0) {
                this.front = newNode;
                newNode.setNext(current);
            } else {

                SimpleNode<T> previous = current;
                current = previous.getNext();

                while (--index > 0) {
                    previous = current;
                    current = previous.getNext();

                }

                previous.setNext(newNode);
                newNode.setNext(current);

            }
        }
        size++;
    }

    //Método para eliminar un nodo en la posición deseada.
    @Override
    public T remove(int index) {

        SimpleNode current = this.front;
        if (size == 0) {
            return null;
        }
        int counter = index;

        while (counter > 0) {
            if (current.getNext().getValue() == null) {
                return null;
            }
            counter--;
            current = current.getNext();
        }

        current.setNext(current.getNext().getNext());
        size--;

        T result = (T) current.getNext().getValue();
        return result;

    }

    //Método para verificar la posición de un objeto en la cola.
    @Override
    public int indexOf(Object o) {
        int index = 0;
        SimpleNode current = this.front;

        while (current.getValue() != null) {
            if (current.getValue().equals(o)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Método de prueba.

    public String toString() {
        while (size > 0) {
            System.out.println(front.getValue());
            size--;
            front.getNext();
        }
        return "LPriorityQueue{" + "back=" + back + ", size=" + size + ", front=" + front + '}';
    }
}
