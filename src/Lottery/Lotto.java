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
public class Lotto {
    
    //Atributos de la clase.

    private int acumulado=1000000;
    private String lottodate,emissiondate,name;
    private int winnernumb;
    private int digito1,digito2,digito3,digito4,digito5,digito6,digito7;
    private Tickets ticket;

    //Constructor principal.
   
    public Lotto(int acumulado, String date, int winner) {
        this.acumulado = acumulado;
        this.lottodate = date;
        this.winnernumb = winner;
    }
    
    //Constructor vacío.
    
    public Lotto(){
    }
    
    //Getters y setters de cada atributo.
    
     public int getDigito1() {
        return digito1;
    }

    public void setDigito1(int digito1) {
        this.digito1 = digito1;
    }

    public int getDigito2() {
        return digito2;
    }

    public void setDigito2(int digito2) {
        this.digito2 = digito2;
    }

    public int getDigito3() {
        return digito3;
    }

    public void setDigito3(int digito3) {
        this.digito3 = digito3;
    }

    public int getDigito4() {
        return digito4;
    }

    public void setDigito4(int digito4) {
        this.digito4 = digito4;
    }

    public int getDigito5() {
        return digito5;
    }

    public void setDigito5(int digito5) {
        this.digito5 = digito5;
    }

    public int getDigito6() {
        return digito6;
    }

    public void setDigito6(int digito6) {
        this.digito6 = digito6;
    }

    public int getDigito7() {
        return digito7;
    }

    public void setDigito7(int digito7) {
        this.digito7 = digito7;
    }

    public Tickets getTicket() {
        return ticket;
    }

    public void setTicket(Tickets ticket) {
        this.ticket = ticket;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public String getLottodate() {
        return lottodate;
    }

    public void setLottodate(String lottodate) {
        this.lottodate = lottodate;
    }

    public String getEmissiondate() {
        return emissiondate;
    }

    public void setEmissiondate(String emissiondate) {
        this.emissiondate = emissiondate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public String getDate() {
        return lottodate;
    }

    public void setDate(String date) {
        this.lottodate = date;
    }

    public int getWinnernumb() {
        return winnernumb;
    }

    public void setWinner(int winner) {
        this.winnernumb = winner;
    }
    public void lottowinner(){
    Random rand = new Random();
    digito1 = rand.nextInt(10);
    digito2 = rand.nextInt(10);
    digito3 = rand.nextInt(10);
    digito4 = rand.nextInt(10);
    digito5 = rand.nextInt(10);
    digito6 = rand.nextInt(10);
    digito7 = rand.nextInt(10);
    winnernumb=digito1*1000000+digito2*100000+digito3*10000+digito4*1000+digito5*100+digito6*10+digito7;
    }  
}
