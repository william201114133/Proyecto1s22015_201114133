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
public class Nodochofer {
    int clave;
    int equilibrio;
    int rotacion;
    String nombre;
    String apellido;
    String contraseña;
    Nodochofer izquierda;
    Nodochofer derecha;
    
    Nodochofer(){
    clave=0;
    equilibrio=0;
    rotacion=0;
    nombre="";
    apellido="";
    contraseña="";
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
    
    public void setapellido(String apellido){
    this.apellido=apellido;
    }
    
    public void setcontraseña(String contraseña){
    this.contraseña=contraseña;
    }
    
    public void setizquierda(Nodochofer izquierda){
    this.izquierda=izquierda;
    }
    
    public void setderecha(Nodochofer derecha){
    this.derecha=derecha;
    }
}
