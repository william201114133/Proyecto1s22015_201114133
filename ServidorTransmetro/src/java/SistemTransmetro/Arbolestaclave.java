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
public class Arbolestaclave {
    private Nodoestacion raiz;
    private Nodoestacion Aux;
    private boolean rotacion=false;
    private boolean aumento=false;
    private boolean borrado=false;
    private boolean apuntado=false;
    private boolean apuntado2=false;
    private boolean buscar=false;
    private LinkedList<Nodoestacion> Lista = new LinkedList<Nodoestacion>();
     private LinkedList<String> grafica = new LinkedList<String>();
    private Nodoestacion Busqueda;
    private Nodoestacion nuevaRaiz;
    public void insertar(int llave,String correo,String contraseña){
        insertar(llave,correo,contraseña,raiz);
    }
    private Nodoestacion insertar(int n,String correo,String contraseña,Nodoestacion A){
        if(A==null){
            A = new Nodoestacion();
            if(raiz==null){
            raiz = A;
            }
            A.setclave(n);
            A.setequilibrio(0);
            A.setnombre(correo);
            A.setcontraseña(contraseña);
            A.settipo("clave");
            return A;
        }
        else{
            if(n<A.clave)
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
    public Nodoestacion RetornarRaiz(){
        return raiz;
    }
    private Nodoestacion II(Nodoestacion A){
        rotacion=true;
        Nodoestacion aux = A.izquierda.derecha;
        A.izquierda.derecha=A;
        if(aux==null){
           if(A.derecha!=null)A.izquierda.equilibrio++;
           if(A.derecha==null)A.izquierda.equilibrio=0;
        }
        else{
           if(A.derecha!=null)A.izquierda.equilibrio=0;
           if(A.derecha==null)A.izquierda.equilibrio++;
               }
        Nodoestacion aux2 = A.izquierda;
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
    
    private Nodoestacion DD(Nodoestacion A){
        rotacion=true;
        Nodoestacion aux = A.derecha.izquierda;
        A.derecha.izquierda = A;
        if(aux==null){
            if(A.izquierda!=null)A.derecha.equilibrio--;
            if(A.izquierda==null)A.derecha.equilibrio=0;}
        else{
            if(A.izquierda!=null)A.derecha.equilibrio=0;
            if(A.izquierda==null)A.derecha.equilibrio--;     
        }
        Nodoestacion aux2 = A.derecha;
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

    private Nodoestacion ID(Nodoestacion A){
      A.izquierda=DD(A.izquierda);
        return II(A);
    }

    private Nodoestacion DI(Nodoestacion A){
        A.derecha=II(A.derecha);
        return DD(A);
    }

    public Nodoestacion Buscar(int id){
        return Buscar(id,raiz);
    } 
    
    private Nodoestacion Buscar(int id,Nodoestacion A){
        if(A!=null){
        if(id<A.clave){
          Buscar(id,A.izquierda);
         
      }
      else{
          if(id>A.clave){
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
    
    private void eliminar(int id,Nodoestacion A){
        if(raiz.izquierda!=null || raiz.derecha!=null){
        if(A!=null){
            if(A.clave<id){
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
                if(A.clave>id){
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
                    if(A.clave==id){
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
    
    private Nodoestacion Aux2;
    private Nodoestacion Reemplazar(Nodoestacion A,Nodoestacion buscado,boolean estado){
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
    
    private boolean rotarBorrado(Nodoestacion A){
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
    private LinkedList<String> graficar(Nodoestacion A){
        if(A!=null){
            if(A.izquierda!=null){
                grafica.add(A.clave+" izquierda "+A.izquierda.clave);
            }
            if(A.derecha!=null){
                grafica.add(A.clave+" derecha "+A.derecha.clave);
            }
            graficar(A.izquierda);
            graficar(A.derecha);
        }
        return grafica;
    }
}
