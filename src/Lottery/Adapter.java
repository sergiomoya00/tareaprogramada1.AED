/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

/**
 *
 * @author samoy
 */
public interface Adapter extends Iterable<Order> {

    void push(Order order);

    Order pop();

    Order getNext();
}
