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
public class Nodoruta {
    int clave;
    int equilibrio;
    int rotacion;
    String nombre;
    Nodoruta izquierda;
    Nodoruta derecha;
    
    Nodoruta(){
    clave=0;
    equilibrio=0;
    rotacion=0;
    nombre="";
    izquierda=null;
    derecha=null;
    }
    
    public void setclave(int clave){
    this.clave=clave;
    }
    
    public void setequilibrio(int equilibrio){
    this.equilibrio=equilibrio;
    }
    
    public void setrotacion(int rotacion){
    this.rotacion=rotacion;
    }
    
    public void setnombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setizquierda(Nodoruta izquierda){
    this.izquierda=izquierda;
    }
    
    public void setderecha(Nodoruta derecha){
    this.derecha=derecha;
    }
}
