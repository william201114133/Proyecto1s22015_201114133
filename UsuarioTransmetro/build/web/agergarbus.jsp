<%-- 
    Document   : agergarbus
    Created on : 19-sep-2015, 19:00:49
    Author     : William
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agergar bus</title>
    </head>
    <body>
        <h1>Agregar Bus</h1>
        <form action="AgregarBus">
            <table border="1">
                <thead>
                </thead>
                <tbody>
                    <tr>
                        <td>Numero de Bus</td>
                        <td><input type="text" name="numero" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="guardar" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
