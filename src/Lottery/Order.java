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
    private String number,email;

 
    private int price,age;

    public Order(String clientName, String raffleType, String number, int price, int birthdate) {
        this.clientName = clientName;
        this.raffleType = raffleType;
        this.number = number;
        this.price = price;
        this.age = age;
    }
    
    public Order(String clientName, int birthdate){
        this.clientName = clientName;
        this.age = age;
    }

    public Order() {
    }
       public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return Integer.compare(client.age, age) == 0
                && Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, age);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + clientName + '\''
                + ", salary=" + age
                + '}';
    }

    // Compara dos clientes por su edad
    @Override
    public int compareTo(Order client) {
        if (this.getAge() > client.getAge()) {
            return 1;
        } else if (this.getAge() < client.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

}
