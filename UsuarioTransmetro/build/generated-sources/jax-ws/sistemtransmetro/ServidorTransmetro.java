
package sistemtransmetro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServidorTransmetro", targetNamespace = "http://SistemTransmetro/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServidorTransmetro {


    /**
     * 
     * @param id
     * @return
     *     returns sistemtransmetro.Nodoestacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarestclave", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Buscarestclave")
    @ResponseWrapper(localName = "buscarestclaveResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.BuscarestclaveResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/buscarestclaveRequest", output = "http://SistemTransmetro/ServidorTransmetro/buscarestclaveResponse")
    public Nodoestacion buscarestclave(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns sistemtransmetro.Nodochofer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarchofer", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Buscarchofer")
    @ResponseWrapper(localName = "buscarchoferResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.BuscarchoferResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/buscarchoferRequest", output = "http://SistemTransmetro/ServidorTransmetro/buscarchoferResponse")
    public Nodochofer buscarchofer(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param llave
     * @param apellido
     * @param nombre
     * @param contraseña
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ingresarchofer", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Ingresarchofer")
    @ResponseWrapper(localName = "ingresarchoferResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.IngresarchoferResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/ingresarchoferRequest", output = "http://SistemTransmetro/ServidorTransmetro/ingresarchoferResponse")
    public String ingresarchofer(
        @WebParam(name = "llave", targetNamespace = "")
        int llave,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña);

    /**
     * 
     * @param clave
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminaradmin", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Eliminaradmin")
    @ResponseWrapper(localName = "eliminaradminResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.EliminaradminResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/eliminaradminRequest", output = "http://SistemTransmetro/ServidorTransmetro/eliminaradminResponse")
    public String eliminaradmin(
        @WebParam(name = "clave", targetNamespace = "")
        int clave);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarchofer", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Eliminarchofer")
    @ResponseWrapper(localName = "eliminarchoferResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.EliminarchoferResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/eliminarchoferRequest", output = "http://SistemTransmetro/ServidorTransmetro/eliminarchoferResponse")
    public String eliminarchofer(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param clave
     * @return
     *     returns sistemtransmetro.Nodo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaradmin", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Buscaradmin")
    @ResponseWrapper(localName = "buscaradminResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.BuscaradminResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/buscaradminRequest", output = "http://SistemTransmetro/ServidorTransmetro/buscaradminResponse")
    public Nodo buscaradmin(
        @WebParam(name = "clave", targetNamespace = "")
        int clave);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.HelloResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/helloRequest", output = "http://SistemTransmetro/ServidorTransmetro/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param llave
     * @param correo
     * @param contraseña
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ingresaradmin", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Ingresaradmin")
    @ResponseWrapper(localName = "ingresaradminResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.IngresaradminResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/ingresaradminRequest", output = "http://SistemTransmetro/ServidorTransmetro/ingresaradminResponse")
    public String ingresaradmin(
        @WebParam(name = "llave", targetNamespace = "")
        int llave,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña);

    /**
     * 
     * @param clave
     * @param correo
     * @param contraseña
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ingresarestacionclave", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Ingresarestacionclave")
    @ResponseWrapper(localName = "ingresarestacionclaveResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.IngresarestacionclaveResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/ingresarestacionclaveRequest", output = "http://SistemTransmetro/ServidorTransmetro/ingresarestacionclaveResponse")
    public String ingresarestacionclave(
        @WebParam(name = "clave", targetNamespace = "")
        int clave,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña);

    /**
     * 
     * @param correo
     * @param id
     * @param contraseña
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ingresarestageneral", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Ingresarestageneral")
    @ResponseWrapper(localName = "ingresarestageneralResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.IngresarestageneralResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/ingresarestageneralRequest", output = "http://SistemTransmetro/ServidorTransmetro/ingresarestageneralResponse")
    public String ingresarestageneral(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarestageneral", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Buscarestageneral")
    @ResponseWrapper(localName = "buscarestageneralResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.BuscarestageneralResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/buscarestageneralRequest", output = "http://SistemTransmetro/ServidorTransmetro/buscarestageneralResponse")
    public String buscarestageneral(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarestageneral", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Eliminarestageneral")
    @ResponseWrapper(localName = "eliminarestageneralResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.EliminarestageneralResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/eliminarestageneralRequest", output = "http://SistemTransmetro/ServidorTransmetro/eliminarestageneralResponse")
    public String eliminarestageneral(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarestaclave", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.Eliminarestaclave")
    @ResponseWrapper(localName = "eliminarestaclaveResponse", targetNamespace = "http://SistemTransmetro/", className = "sistemtransmetro.EliminarestaclaveResponse")
    @Action(input = "http://SistemTransmetro/ServidorTransmetro/eliminarestaclaveRequest", output = "http://SistemTransmetro/ServidorTransmetro/eliminarestaclaveResponse")
    public String eliminarestaclave(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}