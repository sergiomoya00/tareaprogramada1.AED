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

    private int acumulado=1000000;
    private String lottodate,emissiondate,name;
    private int winnernumb;
    private int digito1,digito2,digito3,digito4,digito5,digito6,digito7;
    public Lotto(int acumulado, String date, int winner) {
        this.acumulado = acumulado;
        this.lottodate = date;
        this.winnernumb = winner;
    }
    public Lotto(){}

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
