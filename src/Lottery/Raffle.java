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
public class Raffle {
    
    //Atributos de la clase.

    private String name;
    private int code,numbemission;
    private String type;
    private String emission,date;
    
    //Constructor principal.

    public Raffle(String name, int code, String type, String emission) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.emission = emission;
    }
    
    //Constructor vacío.

    public Raffle() {
    }
    
    //Getters y setters de cada atributo.
    
    public int getNumbemission() {
        return numbemission;
    }

    public void setNumbemission(int numbemission) {
        this.numbemission = numbemission;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }
    
    
}
