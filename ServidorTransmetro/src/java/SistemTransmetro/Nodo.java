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
public class Nodo {
    int id;
    int equilibrio;
    int rotacion;
    Nodo izquierda;
    Nodo derecha;
    String correo,contraseña;
    
      Nodo(){
        id=0;
        equilibrio=0;
        rotacion=0;
        izquierda=null;
        derecha=null;
        correo="";
        contraseña="";
    }
      
      public void setid(int id){
      this.id=id;
      }
      
      public void setequilibrio(int equilibrio){
      this.equilibrio=equilibrio;
      }
      
      public void setizquierda(Nodo izquierda){
      this.izquierda=izquierda;
              }
      
      public void setderecha(Nodo derecha){
      this.derecha=derecha;
      }
      
      public void setcorreo(String correo){
      this.correo=correo;
      }
      
      public void setcontraseña(String contraseña){
      this.contraseña=contraseña;
      }
}
