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

public class PriorityQueueFinal<T extends Comparable<T>> {

    //Atributos
    private List<T> priorityQueue;

    public PriorityQueueFinal() {
        priorityQueue = new ArrayList<>();
    }

    //Método para verificar el tamaño.
    public int size() {
        return priorityQueue.size();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }
    
    //Método para verificar el tope de la cola.
    public T top() {
        return priorityQueue.size() > 0 ? priorityQueue.get(0) : null;
    }
    
    //Método para eliminar el nodo.
    public T remove() {
        if (priorityQueue.isEmpty()) {
            return null;
        }
        T result = priorityQueue.get(0);
        priorityQueue.remove(0);
        return result;
    }

    //Método para insertar el nodo.
    public void insert(T e) {
        priorityQueue.add(e);
        Collections.sort(priorityQueue);
    }

    public T get(int index){
    T result = priorityQueue.get(index);
    return result;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (T value : priorityQueue){
            if (first){
                first = false;
            }
            else{
                sb.append(",");         
            }
            sb.append(String.valueOf(value));
        }
        return sb.toString();
    }

    public Iterator<T> iterator() {
        return priorityQueue.iterator(); //To change body of generated methods, choose Tools | Templates.
    }
    
   public T getNext(){
        if (isEmpty()) {
            return null;
        }
        return priorityQueue.get(1);
    } 
    
}
