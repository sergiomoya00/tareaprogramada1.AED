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
public class Client implements Comparable<Client>{

    private String name;
    private int id;
    private int birthdate;
    private String address;
    private int phone;
    private String email;

    public Client(String name, int id, int birthdate, String address, int phone, String email) {
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Client() {
    }

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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        return Integer.compare(client.birthdate, birthdate) == 0
                && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", salary=" + birthdate
                + '}';
    }

    // Compara dos clientes por su edad
    @Override
    public int compareTo(Client client) {
        if (this.getBirthdate()> client.getBirthdate()) {
            return 1;
        } else if (this.getBirthdate() < client.getBirthdate()) {
            return -1;
        } else {
            return 0;
        }
    }

}
