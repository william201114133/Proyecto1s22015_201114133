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
public class Nodoestacion {
    int clave;
    int equilibrio;
    int rotacion;
    String nombre;
    String contraseña;
    String tipo;
    int cantidadperson;
    Nodoestacion izquierda;
    Nodoestacion derecha;
    
    Nodoestacion(){
    clave=0;
    equilibrio=0;
    rotacion=0;
    nombre="";
    contraseña="";
    tipo="";
    cantidadperson=0;
    izquierda=null;
    derecha=null;
    }
    
    public void setclave(int clave){
    this.clave=clave;
    }
    
    public void setequilibrio(int equilibrio){
    this.equilibrio=equilibrio;
    }
    
    public void setcantidadperson(int cantidadperson){
    this.cantidadperson=cantidadperson;
    }
    
    public void setrotacion(int rotacion){
    this.rotacion=rotacion;
    }
    
    public void setnombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setcontraseña(String contraseña){
    this.contraseña=contraseña;
    }
    
    public void setizquierda(Nodoestacion izquierda){
    this.izquierda=izquierda;
    }
    
    public void setderecha(Nodoestacion derecha){
    this.derecha=derecha;
    }
    
    public void settipo(String tipo){
    this.tipo=tipo;
    }
}
