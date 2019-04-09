/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

/**
 *
 * @author José Andres
 */
public class Preorder {
    
    //Atributos de la clase.

    private String clientName, Transmittername;
    private String raffleType, email,number;
    private int age,price;
    
    //Constructor principal.

    public Preorder(String Transmittername, String clientName, String raffleType, String number, String email, int price, int age) {
        this.clientName = clientName;
        this.raffleType = raffleType;
        this.number = number;
        this.price = price;
        this.age = age;
        this.Transmittername = Transmittername;
        this.email = email;
    }
    
    //Constructor vacío.

    public Preorder() {
    }
    
    //Getters y setters de cada atributo.

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTransmittername() {
        return Transmittername;
    }

    public void setTransmittername(String Transmittername) {
        this.Transmittername = Transmittername;
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

}
