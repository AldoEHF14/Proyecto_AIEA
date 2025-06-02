<%-- 
    Document   : Tarea9
    Created on : 18 ene 2025, 22:02:00
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
        <h1>Tarea9</h1>
        <h1>Registro de Libro</h1>
    
    <!-- Formulario que envía los datos al servlet LibreriaServlet -->
    <form action="/Proyecto_Final/Tarea9" method="POST">
        <label for="id">ID del libro:</label>
        <input type="text" id="id" name="id" required><br><br>

        <label for="libro">Nombre del libro:</label>
        <input type="text" id="libro" name="libro" required><br><br>

        <label for="autor">Autor del libro:</label>
        <input type="text" id="autor" name="autor" required><br><br>

        <label for="tipo">Tipo (comedia, terror...):</label>
        <input type="text" id="tipo" name="tipo" required><br><br>

        <label for="descripcion">Descripción:</label>
        <textarea id="descripcion" name="descripcion" required></textarea><br><br>

        <label for="precio">Precio:</label>
        <input type="number" id="precio" name="precio" step="0.01" required><br><br>

        <input type="submit" value="Registrar libro">
    </form>

    </body>
</html>
