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
public class Order {

    private String clientName;
    private String raffleType;
    private String number;
    private int price;

    public Order(String clientName, String raffleType, String number, int price) {
        this.clientName = clientName;
        this.raffleType = raffleType;
        this.number = number;
        this.price = price;
    }

    public Order() {
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

}
