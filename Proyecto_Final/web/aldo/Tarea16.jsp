<%-- 
    Document   : Tarea16
    Created on : 18 ene 2025, 23:18:07
    Author     : Aldoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="aldo_src.Empleado"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>Hello World!</h1>
        Empleado 1:
         <%=new Empleado("1","Jose Antonio","Tecnologia","Tics")%>
            <br>
            Empleado 2:
            <%=new Empleado("2","Maria Fernanda","Recursos Humanos","Capacitacion")%>
            <br>
            Empleado 3:
            <%=new Empleado("3","Luis Miguel","Ventas","Comercial")%>
            <br>
            Empleado 4:
            <%=new Empleado("4","Ana Sofia","Finanzas","Contabilidad")%>
            <br>
            <br>
            <br>
            <a href="${pageContext.request.contextPath}/index.jsp"> Volver al Inicio</a>

    </body>
</html>
