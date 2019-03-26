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

    private String datebingo,name,dateemission;
    private int winnernumb;
    private int numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9;

    public Bingo(String date, int winner) {
        this.datebingo = date;
        this.winnernumb = winner;
    }
    public Bingo(){}
    
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
    }
    
}
