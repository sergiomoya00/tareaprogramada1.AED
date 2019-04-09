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
public class Client{

    //Atributos de la clase.
    
    private String name;
    private int id;
    private int birthdate;
    private String address;
    private int phone;
    private String email;

    //Constructor principal.
    
    public Client(String name, int id, int birthdate, String address, int phone, String email) {
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    //Constructor vacío.

    public Client() {
    }
    
    //Getters y setters de cada atributo.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
