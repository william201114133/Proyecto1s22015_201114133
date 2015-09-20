/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemTransmetro;

/**
 *
 * @author William
 */
public class Nodobus {
    int numero;
    Nodobus siguiente;
    Nodobus antereor;
    
    Nodobus(){
    numero=0;
    }
    
    public void setnumero(int numero){
    this.numero=numero;
    }
}
