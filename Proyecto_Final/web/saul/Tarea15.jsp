<%-- 
    Document   : newjsp
    Created on : 16 dic. 2024, 12:17:35
    Author     : saulg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--Ejemplo de JSP Declaraciones-->

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Declarations</title>
        <link REL=STYLESHEET HREF="JSP-Styles.css“ type="text/css">
        <% String bgColor = request.getParameter("bgColor");
        if ((bgColor==null) || (bgColor.trim().equals("bgColor")) ){
            bgColor="WHITE";
        }  %>
        
    </head>
    <body bgColor="<%=bgColor%>">
        <h1>Actividad 15</h1>
        <h2>Ejemplo 1</h2>
        <h1>JSP Declarations</h1>
        <%! private int accessCount = 0; %>
        <h2>Accesos a la página desde el reboot: <%= ++accessCount%></h2>
        
        <h2>Ejemplo 2</h2>
        <%if(Math.random()<0.5){%>
        <h1>Ten un <I> bonito </I> dia! </h1>
        <% } else { %>
        <h1>Ten un <I> feo </I> dia! </h1>
        <%}%>
        
        <h2>Ejemplo 3 Expresiones </h2>
        <ul>
            <li>Hora Actual: <%= new java.util.Date()%></li>
            <li>Server: <%=application.getServerInfo()%></li>
            <li>Session ID: <%=session.getId()%></li>
            <li>El <code>testParam</code> formulario de parametros:
                <%= request.getParameter("testParam")%> 
            </li>
        </ul>

        <h2 align="center">Probando el color "<%= bgColor %>".</h2>
        <br>
        <form>
                Color: <INPUT TYPE="TEXT" NAME="bgColor"><BR>
                        <INPUT TYPE="SUBMIT" VALUE=“Probar el Color">
            
            
        </form>
        
    </body>
</html>
