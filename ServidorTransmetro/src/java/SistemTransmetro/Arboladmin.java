/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemTransmetro;
import java.util.LinkedList;

/**
 *
 * @author William
 */
public class Arboladmin {
    private Nodo raiz;
    private Nodo Aux;
    private boolean rotacion=false;
    private boolean aumento=false;
    private boolean borrado=false;
    private boolean apuntado=false;
    private boolean apuntado2=false;
    private boolean buscar=false;
    private int UltimaPosicionCadenaInterna=0;//para la comparacion de cadenas
    private boolean CadenaAceptada=false; // para la comparacion de cadenas
    private LinkedList<Nodo> Lista = new LinkedList<Nodo>();
     private LinkedList<String> grafica = new LinkedList<String>();
    private Nodo Busqueda;
    private Nodo nuevaRaiz;
    public void insertar(int llave,String correo,String contraseña){
        insertar(llave,correo,contraseña,raiz);
    }
    private Nodo insertar(int n,String correo,String contraseña,Nodo A){
        if(A==null){
            A = new Nodo();
            if(raiz==null){
            raiz = A;
            }
            A.setid(n);
            A.setequilibrio(0);
            A.setcorreo(correo);
            A.setcontraseña(contraseña);
            return A;
        }
        else{
            if(n<A.id)
            {
                if(A.izquierda==null){
                    A.equilibrio--;
                    aumento = (A.equilibrio!=0);
                     A.izquierda=insertar(n,correo,contraseña,A.izquierda);
                }
                else
                {
                    insertar(n,correo,contraseña,A.izquierda);
                    if(aumento){
                        if(rotacion!=true){  
                            A.equilibrio--;
                            aumento=(A.equilibrio!=0);
                        }
                    }
                    if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                    {
                        A.izquierda=nuevaRaiz;
                        nuevaRaiz=null;
                        rotacion=false;
                    } 
                    if(A.equilibrio<-1)
                    {
                      if(A.izquierda.equilibrio>0)
                      {
                          if(raiz.hashCode()!=A.hashCode()){ID(A);aumento=false;return null;}
                          else{raiz=ID(A);aumento=false;rotacion=false;return null;}
                          
                      }
                      else
                      {
                          if(raiz.hashCode()!=A.hashCode()){II(A);aumento=false;return null;}
                          else{raiz=II(A);aumento=false;rotacion=false;return null;}
                          
                      }
                  }
               }
            }
            else
            {
                if(A.derecha==null)
                {
                    A.equilibrio++;
                    aumento = (A.equilibrio!=0);
                    A.derecha=insertar(n,correo,contraseña,A.derecha);
                }
                else
                {
                    insertar(n,correo,contraseña,A.derecha);
                    if(aumento){
                        if(rotacion!=true){
                            A.equilibrio++;
                            aumento=(A.equilibrio!=0);
                        }
                    }
                    if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                    {
                        A.derecha=nuevaRaiz;
                        nuevaRaiz=null;
                        rotacion=false;
                    }
                   if(A.equilibrio>1)
                   {
                       if(A.derecha.equilibrio<0)
                       {
                           if(raiz.hashCode()!=A.hashCode()){DI(A);aumento=false;return null;}
                           else{raiz=DI(A);aumento=false;rotacion=false;return null;}
                       }
                       else
                       {
                           if(raiz.hashCode()!=A.hashCode()){DD(A);aumento=false;return null;}
                                else{raiz=DD(A);aumento=false;rotacion=false;return null;}
                       }
                   }
                }
            }
        }
        return null;
    }
    public Nodo RetornarRaiz(){
        return raiz;
    }
    private Nodo II(Nodo A){
        rotacion=true;
        Nodo aux = A.izquierda.derecha;
        A.izquierda.derecha=A;
        if(aux==null){
           if(A.derecha!=null)A.izquierda.equilibrio++;
           if(A.derecha==null)A.izquierda.equilibrio=0;
        }
        else{
           if(A.derecha!=null)A.izquierda.equilibrio=0;
           if(A.derecha==null)A.izquierda.equilibrio++;
               }
       
        Nodo aux2 = A.izquierda;
        A.izquierda=aux;
        if(aux==null){
            if(A.derecha!=null)A.equilibrio++;
            if(A.derecha==null)A.equilibrio=0;
        }
        else{
            if(A.derecha!=null)A.equilibrio=0;
            if(A.derecha==null)A.equilibrio--;
           }
         nuevaRaiz=aux2;
         aux2.rotacion=10;
        return aux2;
    }
    
    private Nodo DD(Nodo A){
        rotacion=true;
        Nodo aux = A.derecha.izquierda;
        A.derecha.izquierda = A;
        if(aux==null){
            if(A.izquierda!=null)A.derecha.equilibrio--;
            if(A.izquierda==null)A.derecha.equilibrio=0;}
        else{
            if(A.izquierda!=null)A.derecha.equilibrio=0;
            if(A.izquierda==null)A.derecha.equilibrio--;     
        }
        Nodo aux2 = A.derecha;
        A.derecha = aux;
        if(aux==null){
            if(A.izquierda!=null)A.equilibrio--;
            if(A.izquierda==null)A.equilibrio=0;
        }
        else{
          if(A.izquierda!=null)A.equilibrio=0; 
          if(A.izquierda==null)A.equilibrio++;
        }
        nuevaRaiz=aux2;
        aux2.rotacion=11;
        return aux2;
    }

    private Nodo ID(Nodo A){
      A.izquierda=DD(A.izquierda);
        return II(A);
    }

    private Nodo DI(Nodo A){
        A.derecha=II(A.derecha);
        return DD(A);
    }

    public Nodo Buscar(int id){
        return Buscar(id,raiz);
    } 
    
    private Nodo Buscar(int id,Nodo A){
        if(A!=null){
        if(id<A.id){
          Buscar(id,A.izquierda);
         
      }
      else{
          if(id>A.id){
            Buscar(id,A.derecha);
          }
          else{
              this.Busqueda=A;
              }
      }
        }else{
            Busqueda=null;}
      return Busqueda;  
    }
    
    public void eliminar(int id){
        eliminar(id,raiz);
    }
    
    private void eliminar(int id,Nodo A){
        if(raiz.izquierda!=null || raiz.derecha!=null){
        if(A!=null){
            if(A.id<id){
                eliminar(id,A.derecha);
                if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                {
                    A.izquierda=nuevaRaiz;
                    nuevaRaiz=null;
                }
                if(borrado==true){
                    A.equilibrio--;
                    rotarBorrado(A);
                    borrado=(A.equilibrio==0);
                }
                if(apuntado==true){
                    A.derecha=Aux;
                    apuntado=false;
                }
            }else{
                if(A.id>id){
                    eliminar(id,A.izquierda);
                    if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                    {
                        A.izquierda=nuevaRaiz;
                        nuevaRaiz=null;
                    }
                    if(borrado==true){
                        A.equilibrio++;
                        rotarBorrado(A);
                        borrado=(A.equilibrio==0);
                    }
                    if(apuntado==true){
                        A.izquierda=Aux;
                        apuntado=false;
                    }
                }else{
                    if(A.id==id){
                        borrado=true;
                        apuntado=true;
                        if(A.izquierda == null){
                            Aux = A.derecha;
                        }else{
                            if(A.derecha == null){
                                Aux = A.izquierda;
                            }else{
                                Aux=Reemplazar(A,A,true);                   
                            }
                        }  
                    }
                }
           }
       }
        }
        else{
           raiz=null; 
        }
    }
    
    private Nodo Aux2;
    private Nodo Reemplazar(Nodo A,Nodo buscado,boolean estado){
     if(estado==true){
         Reemplazar(A.izquierda,buscado,false);
         if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
         {
           A.izquierda=nuevaRaiz;
           nuevaRaiz=null;
         }
         if(buscado.hashCode()==raiz.hashCode()){
              raiz=Aux2;
         }
         if(Aux2.hashCode()!=buscado.izquierda.hashCode()){
            Aux2.izquierda=buscado.izquierda; buscado.izquierda=null;
         }else{buscado.izquierda=null;}
         Aux2.derecha = buscado.derecha;   buscado.derecha=null;
         if(borrado==true){
             Aux2.equilibrio++;
             rotarBorrado(Aux2);
             borrado=(Aux2.equilibrio==0);
         }
     }else{
        if(A.derecha==null){
            Aux2=A;
            borrado=true;
            apuntado2=true;
        }else{ 
            Reemplazar(A.derecha,buscado,estado);
            if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
            {
                A.derecha=nuevaRaiz;
                nuevaRaiz=null;
            } 
            if(apuntado2==true){
                A.derecha=Aux2.izquierda;
                apuntado2=false;
            }
            if(borrado==true){
                A.equilibrio--;
                rotarBorrado(A);
                borrado=(A.equilibrio==0);
            }
      }
     }
      return Aux2;
     }
    
    private boolean rotarBorrado(Nodo A){
        if(A.equilibrio<-1)
        {
                      if(A.izquierda.equilibrio>0)
                      {
                          if(raiz.hashCode()!=A.hashCode()){ID(A);borrado=false;return true;}
                          else{raiz=ID(A);borrado=false;return true;}
                          
                      }
                      else
                      {
                          if(raiz.hashCode()!=A.hashCode()){II(A);borrado=false;return true;}
                          else{raiz=II(A);borrado=false;return true;}
                          
                      }
         }
        else{
             if(A.equilibrio>1)
                   {
                       if(A.derecha.equilibrio<0)
                       {
                           if(raiz.hashCode()!=A.hashCode()){DI(A);borrado=false;return true;}
                           else{raiz=DI(A);borrado=false;return true;}
                       }
                       else
                       {
                           if(raiz.hashCode()!=A.hashCode()){DD(A);borrado=false;return true;}
                                else{raiz=DD(A);aumento=false;borrado=false;return true;}
                       }
                   }
        }
        return false;
    }
    public LinkedList<String> graficar(){
        grafica.clear();
        return graficar(raiz);
    }
    private LinkedList<String> graficar(Nodo A){
        if(A!=null){
            if(A.izquierda!=null){
                grafica.add(A.id+" izquierda "+A.izquierda.id);
            }
            if(A.derecha!=null){
                grafica.add(A.id+" derecha "+A.derecha.id);
            }
            graficar(A.izquierda);
            graficar(A.derecha);
        }
        return grafica;
    }
}
