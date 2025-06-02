<%-- 
    Document   : Tarea3
    Created on : 18 ene 2025, 21:15:49
    Author     : Aldoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <h1>Calculadora Cliente-Servidor</h1>
            <form action="/Proyecto_Final/Tarea3" method="POST">
                <label for="num1">Ingresa el primer número:</label>
                <input type="number" id="num1" name="num1" required><br><br>

                <label for="num2">Ingresa el segundo número:</label>
                <input type="number" id="num2" name="num2" required><br><br>

                <input type="submit" value="Calcular">
            </form>
    </body>
</html>
