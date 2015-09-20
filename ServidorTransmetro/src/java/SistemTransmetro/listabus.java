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
public class listabus {
public static Nodobus primero;
public static Nodobus ultimo;
public static int tama=0;

public boolean add(int numero) {
    if(primero==null){
            Nodobus nuevo=new Nodobus();
            nuevo.setnumero(numero);
            primero=nuevo;
            ultimo=nuevo;
            nuevo.siguiente=nuevo;
            nuevo.antereor=nuevo;
            tama++;
        }
        else{
            Nodobus nuevo=new Nodobus();
            nuevo.setnumero(numero);
            ultimo.siguiente=nuevo;
            nuevo.antereor=ultimo;
            primero.antereor=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            tama++;} 
    return true;
    }

public boolean remove(int numero) {
    Nodobus veri=primero;
    int conteo=0;
    while(conteo<=tama){
    if(numero==veri.numero){
       veri.antereor.siguiente=veri.siguiente;
       veri.siguiente.antereor=veri.antereor;
       veri=null;
       break;
    }
    veri=veri.siguiente;
    conteo++;
    }
    return true;
    }
}
