<%-- 
    Document   : ingresaadmin
    Created on : 19-sep-2015, 17:42:09
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar administrador</title>
    </head>
    <body>
        <h1>Ingrese informacion nuevo administrador</h1>
        <form action="Ingresar Admin" method="POST">
            <table border="1">
                <thead>
                </thead>
                <tbody>
                    <tr>
                        <td>"id"</td>
                        <td><input type="text" name="id" value="" /></td>
                    </tr>
                    <tr>
                        <td>"Correo"</td>
                        <td><input type="text" name="usuario" value="" /></td>
                    </tr>
                    <tr>
                        <td>"Contraseña"</td>
                        <td><input type="password" name="contraseña" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="guardaradmin" /></td>
                    </tr>
                </tbody>
            </table>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	sistemtransmetro.ServidorTransmetro_Service service = new sistemtransmetro.ServidorTransmetro_Service();
	sistemtransmetro.ServidorTransmetro port = service.getServidorTransmetroPort();
	 // TODO initialize WS operation arguments here
	int llave = Integer.valueOf(request.getParameter("id"));
	java.lang.String correo = String.valueOf(request.getParameter("usuario"));
	java.lang.String contraseña = String.valueOf(request.getParameter("contraseña"));
	// TODO process result here
	java.lang.String result = port.ingresaradmin(llave, correo, contraseña);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        </form>
    </body>
</html>
