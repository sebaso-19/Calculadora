<%-- 
    Document   : calcjsp
    Created on : Apr 14, 2023, 5:50:02 PM
    Author     : ANGRY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./calcservlet" method="POST"> 
                <td><input type="text" name="t1" /> </td> 
                <td><input type="text" name="t2" /></td>
            <input type="submit" name="action" value="ADD" />
            <input type="submit" name="action" value="RESTAR" />
            <input type="submit" name="action" value="MULTIPLICAR" />
            <input type="submit" name="action" value="MODULO" />
            <input type="submit" name="action" value="CUADRADO" />
        </form> 
    </body>
</html>
