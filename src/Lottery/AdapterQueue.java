/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import Collections.PriorityQueueFinal;
import java.util.Iterator;

/**
 *
 * @author samoy
 */
public class AdapterQueue implements Adapter {

    private PriorityQueueFinal<Order> adapterQ = new PriorityQueueFinal();

    @Override
    public void push(Order order) {
        adapterQ.insert(order); //To change body of generated methods, choose Tools | Templates.
    }

    public Order pop() {
        return adapterQ.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    public Order getNext() {
        return adapterQ.getNext();
    }

    public Iterator<Order> iterator() {
        return adapterQ.iterator(); //To change body of generated methods, choose Tools | Templates.
    }

}
