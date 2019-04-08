/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import java.util.Objects;

/**
 *
 * @author samoy
 */
public class Order implements Comparable<Order> {

    private String clientName;
    private String raffleType;
    private String number;
    private int price, birthdate;

    public Order(String clientName, String raffleType, String number, int price, int birthdate) {
        this.clientName = clientName;
        this.raffleType = raffleType;
        this.number = number;
        this.price = price;
        this.birthdate = birthdate;
    }
    
    public Order(String clientName, int birthdate){
        this.clientName = clientName;
        this.birthdate = birthdate;
    }

    public Order() {
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setAge(int birthdate) {
        this.birthdate = birthdate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRaffleType() {
        return raffleType;
    }

    public void setRaffleType(String raffleType) {
        this.raffleType = raffleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order client = (Order) o;
        return Integer.compare(client.birthdate, birthdate) == 0
                && Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, birthdate);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + clientName + '\''
                + ", salary=" + birthdate
                + '}';
    }

    // Compara dos clientes por su edad
    @Override
    public int compareTo(Order client) {
        if (this.getBirthdate() > client.getBirthdate()) {
            return 1;
        } else if (this.getBirthdate() < client.getBirthdate()) {
            return -1;
        } else {
            return 0;
        }
    }

}
