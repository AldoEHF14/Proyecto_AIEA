<%-- 
    Document   : Tarea16
    Created on : 20 ene. 2025, 08:58:22
    Author     : saulg
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="saul_src.Alumno"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actividad 16</h1>
        <h1>Hello World!</h1>
        <h2>Hoy es : <%= new Date()%></h2>
        
        <h3>
            Informacion del Alumno de UAM: 
            <li>
                <%= new Alumno("2183042802", "Victor Saul", "Garcia Godoy", "Ciencias Básicas e Ingeniería", 17)%>
            </li>
            <li>
                <%= new Alumno("2203432123", "Karina", "Alcantara Segura", "Ciencias Naturales e Ingeniería", 13)%>
            </li>
            <li>
                <%= new Alumno("2193042392", "Brian", "Rivera Martinez", "Ciencias Naturales e Ingeniería", 3)%>
            </li>

        </h3>
            <a href="/Proyecto_Final/index.jsp">Volver al inicio</a>
    </body>
</html>
