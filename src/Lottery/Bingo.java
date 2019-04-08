/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;
import java.util.Random;
import Lottery.Tickets;
/**
 *
 * @author samoy
 */
public class Bingo {

    private String datebingo,name,dateemission,add;
    private int winnernumb;
    private int numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9;
    private Tickets ticket;

    public Bingo(String date, int winner) {
        this.datebingo = date;
        this.winnernumb = winner;
    }
    public Bingo(){}
     public int getWinnernumb() {
        return winnernumb;
    }

    public void setWinnernumb(int winnernumb) {
        this.winnernumb = winnernumb;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public int getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public int getNumero5() {
        return numero5;
    }

    public void setNumero5(int numero5) {
        this.numero5 = numero5;
    }

    public int getNumero6() {
        return numero6;
    }

    public void setNumero6(int numero6) {
        this.numero6 = numero6;
    }

    public int getNumero7() {
        return numero7;
    }

    public void setNumero7(int numero7) {
        this.numero7 = numero7;
    }

    public int getNumero8() {
        return numero8;
    }

    public void setNumero8(int numero8) {
        this.numero8 = numero8;
    }

    public int getNumero9() {
        return numero9;
    }

    public void setNumero9(int numero9) {
        this.numero9 = numero9;
    }

    public Tickets getTicket() {
        return ticket;
    }

    public void setTicket(Tickets ticket) {
        this.ticket = ticket;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getdatebingo() {
        return datebingo;
    }

    public void setdatebingo(String date) {
        this.datebingo = date;
    }

    public int getWinner() {
        return winnernumb;
    }

    public String getDatebingo() {
        return datebingo;
    }

    public void setDatebingo(String datebingo) {
        this.datebingo = datebingo;
    }

    public String getDateemission() {
        return dateemission;
    }

    public void setDateemission(String dateemission) {
        this.dateemission = dateemission;
    }

    public void setWinner(int winner) {
        this.winnernumb = winner;
    }
    public void Bingowinner(){
    Random rand = new Random();
    numero1 = rand.nextInt(100);
    numero2 = rand.nextInt(100);
    numero3 = rand.nextInt(100);
    numero4 = rand.nextInt(100);
    numero5 = rand.nextInt(100);
    numero6 = rand.nextInt(100);
    numero7 = rand.nextInt(100);
    numero8 = rand.nextInt(100);
    numero9 = rand.nextInt(100);
    winnernumb=numero9+numero8*10+numero7*100+numero6*1000+numero5*10000+numero4*100000+numero3*1000000+numero2*10000000+numero1*100000000;
    }
    
}
