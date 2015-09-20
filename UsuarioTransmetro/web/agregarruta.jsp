<%-- 
    Document   : agregarruta
    Created on : 19-sep-2015, 19:06:11
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Ruta</title>
    </head>
    <body>
        <h1>Agregar Ruta</h1>
        <form action="AgregarRuta">
            <table border="1">
                <thead>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre Ruta</td>
                        <td><input type="text" name="nombre" value="" /></td>
                    </tr>
                    <tr>
                        <td>Agregar</td>
                        <td>Estacion</td>
                    </tr>
                    <tr>
                        <td><input type="text" name="estacion" value="" /></td>
                        <td><input type="submit" value="guardaestacion" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="guardarruta" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
