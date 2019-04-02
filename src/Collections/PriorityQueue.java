/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author samoy
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class PriorityQueue<T extends Comparable<T>> {
        private List<T> pQueue;

    public PriorityQueue() {
        pQueue = new ArrayList<T>();
    }

    public int size() {
        return pQueue.size();
    }

    public boolean isEmpty() {
        return pQueue.isEmpty();
    }

    public T top() {
        return pQueue.size() > 0 ? pQueue.get(0) : null;
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T res = pQueue.get(0);
        T te = pQueue.get(size() - 1);
        pQueue.remove(size() - 1);
        int curr = 0, son = 1;
        while (son < size() - 1) {
            T cliente = pQueue.get(son);
            T cliente2 = pQueue.get(son + 1);
            T cliente3 = te;
            if (son + 1 < size() && cliente2.compareTo(cliente) < 0) {
                son++;
            }
            if (cliente3.compareTo(cliente) <= 0) {
                break;
            }
            pQueue.set(curr, pQueue.get(son));
            curr = son;
            son = 2 * curr + 1;
        }
//        heap.set(curr, te);
        return res;
    }

    public void insert(T e) {
        int curr = size();       //Tamaño del arreglo
        int parent;             //Padre del nodo
        while (curr > 0) {                     
            parent = (curr - 1) / 2;
            T cliente = e;
            T cliente2 = pQueue.get(parent);
            if (cliente2.compareTo(cliente) <= 0) {
                break;
            }
            pQueue.get(parent);
            curr = parent;
        }
        pQueue.add(curr, e);
    }

    public Iterator<T> iterator() {
        return pQueue.iterator();
    }
    
    public T getNext(){
        if (isEmpty()) {
            return null;
        }
        return pQueue.get(1);
    }

    @Override
    public String toString() {
        return "PriorityQueue{" + "priorityqueue=" + pQueue + '}';
    }
}
