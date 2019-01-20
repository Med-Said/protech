<%-- 
    Document   : index
    Created on : Jan 19, 2019, 2:59:46 PM
    Author     : Med Said M'bareck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Serv" method="post">
            <table>
                <tr>
                    <td>valeur1</td>
                    <td><input type="number" min="1" name="v1"></td>
                </tr>
                <tr>
                    <td>valeur2</td>
                    <td><input type="number" min="1" name="v2"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="calculer" ></td>
                </tr>
            </table>
        </form>
    </body>
</html>
