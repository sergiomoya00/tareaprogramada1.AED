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
public class Tiempos {

    private int principal;
    private int jugada;

    public Tiempos(int principal, int jugada) {
        this.principal = principal;
        this.jugada = jugada;
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
        
}
