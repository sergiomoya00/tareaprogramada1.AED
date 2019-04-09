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
public class Historial {
    
    //Atributos de la clase.

    private String searched;
    
    //Constructor principal.

    public Historial(String searched) {
        this.searched = searched;
    }
    
    //Constructor vacío.

    public Historial() {
    }
    
    //Getters y setters de cada atributo.

    public String getSearched() {
        return searched;
    }

    public void setSearched(String searched) {
        this.searched = searched;
    }

}
