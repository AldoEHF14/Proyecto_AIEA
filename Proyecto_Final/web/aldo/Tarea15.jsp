<%-- 
    Document   : Tarea13
    Created on : 18 ene 2025, 23:09:58
    Author     : Aldoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarea 15</title>
        <% String bgColor = request.getParameter("bgColor");
        if ((bgColor == null) || (bgColor.trim().equals(""))) {
            bgColor = "WHITE";
        } %>
        
    </head>
        <h1> Tarea 15</h1>
        <body BGCOLOR="<%= bgColor %>">

            <!--<!-- Ejemplo 1 -->
            <h1>JSP Declarations</h1>
            <%! private int accessCount = 0; %>
            <h2>Accesos a la página desde el reboot:
            <%= ++accessCount %></h2>

            <!-- Ejemplo 2 -->
            <% if (Math.random() < 0.5) { %>
            <h1>Ten un <i> bonito </i> dia!</h1>
            <% } else { %>
            <h1>Ten un <i> feo </i> dia!</h1>
            <% } %>

            <!-- Ejemlplo 3 -->

            <h2>Ejemplo 3 Expresiones</h2>
            <ul>
            <li>Hora actual: <%= new java.util.Date() %></li>
            <li>Server: <%= application.getServerInfo() %></li>
            <li>Session ID: <%= session.getId() %></li>
            <li>El <code>testParam</code> formulario de parametros:
            <%= request.getParameter("testParam") %></li>
            </ul>

            <!-- Ejemplo 4-->

            <h2 align="CENTER">Probando el color "<%= bgColor %>".</h2>
            <br>
            <form>
                Color: <input type="text" name="bgColor"><br>
            <input type="submit" value=“Probar_El_Color">
            </form>
             <br>
            <br>
            <br>
            <a href="${pageContext.request.contextPath}/index.jsp"> Volver al Inicio</a>
        </body>
</html>
