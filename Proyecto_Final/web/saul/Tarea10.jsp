<%-- 
    Document   : Tarea10
    Created on : 20 ene. 2025, 08:58:02
    Author     : saulg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actividad 10</h1>
        <h1>Formulario de Compra - Tienda de Libros guardando el archivo CSV</h1>
    <div class="Agregar_producto">
        <form action="/Proyecto_Final/SaulTarea10">
            <label for="nombre">Nombre del Libro:</label>
            <input type="text" id="nombre" name="nombre" required="required" />
            <br />
            <img src="libro_icono.png" alt="imagen" style="max-width: 30px; margin-bottom: -5px;" />
            <br />
            <label for="descripcion">Descripcion:</label>
            <input type="text" id="descripcion" name="descripcion" required="required" />
            <br />
            <label for="autor">Autor:</label>
            <input type="text" id="autor" name="autor" required="required" />
            <br />
            <label for="precio">Precio:</label>
            <input type="text" id="precio" name="precio" required="required" />
            <br />
            <button type="submit">Agregar </button>
        </form>
    </div>
    </body>
</html>
