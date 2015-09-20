<%-- 
    Document   : agregarchofer
    Created on : 19-sep-2015, 18:05:10
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Chofer</title>
    </head>
    <body>
        <h1>Agregar Chofer</h1>
        <form action="AgregarChofer" method="POST">
            <table border="1">
                <thead>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="nombre" value="" /></td>
                    </tr>
                    <tr>
                        <td>Apellido</td>
                        <td><input type="text" name="apellido" value="" /></td>
                    </tr>
                    <tr>
                        <td>Clave</td>
                        <td><input type="text" name="clave" value="" /></td>
                    </tr>
                    <tr>
                        <td>Contraseña</td>
                        <td><input type="password" name="contraseña" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="guardar" /></td>
                    </tr>
                </tbody>
            </table>
                <%-- start web service invocation --%><hr/>
    <%
    try {
	sistemtransmetro.ServidorTransmetro_Service service = new sistemtransmetro.ServidorTransmetro_Service();
	sistemtransmetro.ServidorTransmetro port = service.getServidorTransmetroPort();
	 // TODO initialize WS operation arguments here
	int llave = Integer.valueOf(request.getParameter("clave"));
	java.lang.String nombre = String.valueOf(request.getParameter("nombre"));
	java.lang.String apellido = String.valueOf(request.getParameter("apellido"));
	java.lang.String contraseña = String.valueOf(request.getParameter("contraseña"));
	// TODO process result here
	java.lang.String result = port.ingresarchofer(llave, nombre, apellido, contraseña);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        </form>
    </body>
</html>
