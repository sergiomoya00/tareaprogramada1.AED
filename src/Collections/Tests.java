/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Lottery.Order;

/**
 *
 * @author samoy
 */
public class Tests {

    public static void main(String[] args) {
        /*
           The requirement for a PriorityQueue of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the PriorityQueue.
         */

        // Create a PriorityQueue
        PriorityQueueFinal<Order> employeePriorityQueue = new PriorityQueueFinal<>();

        // Add items to the Priority Queue
        employeePriorityQueue.insert(new Order("Roberto", 13));
        employeePriorityQueue.insert(new Order("Chris", 2));
        employeePriorityQueue.insert(new Order("Andrea", 65));
        employeePriorityQueue.insert(new Order("Jack", 9));
        

        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
         */
        while (!employeePriorityQueue.isEmpty()) {
            System.out.println(employeePriorityQueue.remove());
        }

    }
}
