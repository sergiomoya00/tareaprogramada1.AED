/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import java.util.Random;

/**
 *
 * @author samoy
 */
public class Tiempos {

    private String name, dateemission, datetiempos;
    private int principal;
    private int jugada;
    private int winner;
    private Tickets Ticket;

 
    public Tiempos(int principal, int jugada) {
        this.principal = principal;
        this.jugada = jugada;
    }
    public Tiempos(){}
    
    public Tickets getTicket() {
        return Ticket;
    }

    public void setTicket(Tickets Ticket) {
        this.Ticket = Ticket;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateemission() {
        return dateemission;
    }

    public void setDateemission(String dateemission) {
        this.dateemission = dateemission;
    }

    public String getDatetiempos() {
        return datetiempos;
    }

    public void setDatetiempos(String datetiempos) {
        this.datetiempos = datetiempos;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public int getJugada() {
        return jugada;
    }

    public void setJugada(int jugada) {
        this.jugada = jugada;
    }

    public void Tiemposwinner() {
        Random rand = new Random();
        jugada = rand.nextInt(100);
        principal = rand.nextInt(100);
    }
}
