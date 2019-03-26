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
public class Bingo {

    private String date;
    private int winnernumb;
    private int numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9;

    public Bingo(String date, int winner) {
        this.date = date;
        this.winnernumb = winner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWinner() {
        return winnernumb;
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
    }
    
}
