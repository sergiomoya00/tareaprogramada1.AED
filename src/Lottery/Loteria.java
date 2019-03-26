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
public class Loteria {

    private String date,name,emissiondate,loteriadate;
    private int winner;

    public Loteria(String date, int winner) {
        this.date = date;
        this.winner = winner;
    }

    public Loteria() {
    }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmissiondate() {
        return emissiondate;
    }

    public void setEmissiondate(String emissiondate) {
        this.emissiondate = emissiondate;
    }

    public String getLoteriadate() {
        return loteriadate;
    }

    public void setLoteriadate(String loteriadate) {
        this.loteriadate = loteriadate;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
    
    
}
