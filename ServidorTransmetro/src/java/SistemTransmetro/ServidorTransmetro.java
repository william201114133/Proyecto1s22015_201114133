/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemTransmetro;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author William
 */
@WebService(serviceName = "ServidorTransmetro")
public class ServidorTransmetro {
    Arboladmin admin = new Arboladmin();
    Arbolchofer chofer = new Arbolchofer();
    Arbolestaclave estaclave = new Arbolestaclave();
    Arbolestageneral estageneral = new Arbolestageneral();
    listabus listbus = new listabus();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresaradmin")
    public String ingresaradmin(@WebParam(name = "llave") int llave, @WebParam(name = "correo") String correo, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        admin.insertar(llave, correo, contraseña);
        return "guardado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscaradmin")
    public Nodo operation(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        return admin.Buscar(clave);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminaradmin")
    public String eliminaradmin(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        admin.eliminar(clave);
        return "eliminado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresarchofer")
    public String ingresarchofer(@WebParam(name = "llave") int llave, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        chofer.insertar(llave, nombre, apellido, contraseña);
        return "guardado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarchofer")
    public Nodochofer buscarchofer(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return chofer.Buscar(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarchofer")
    public String eliminarchofer(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        chofer.eliminar(id);
        return "eliminado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresarestacionclave")
    public String ingresarestacionclave(@WebParam(name = "clave") int clave, @WebParam(name = "correo") String correo, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        estaclave.insertar(clave, correo, contraseña);
        return "guardado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarestclave")
    public Nodoestacion buscarestclave(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return estaclave.Buscar(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarestaclave")
    public String eliminarestaclave(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        estaclave.eliminar(id);
        return "elimado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresarestageneral")
    public String ingresarestageneral(@WebParam(name = "id") int id, @WebParam(name = "correo") String correo, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        estageneral.insertar(id, correo, contraseña);
        return "guardado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarestageneral")
    public Nodoestacion buscarestageneral(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return estageneral.Buscar(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarestageneral")
    public String eliminarestageneral(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        estageneral.eliminar(id);
        return null;
    }
}
