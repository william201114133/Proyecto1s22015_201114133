<%-- 
    Document   : Login
    Created on : 19-sep-2015, 13:19:12
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>INICIO DE SESION</h1>
        <form action="login" method="POST">
            <table border="1">
                <thead>
                </thead>
                <tbody>
                    <tr>
                        <td>"Correo"</td>
                        <td><input type="text" name="usuario" value="" /></td>
                    </tr>
                    <tr>
                        <td>"Contraseña"</td>
                        <td><input type="password" name="contraseña" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="button" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
