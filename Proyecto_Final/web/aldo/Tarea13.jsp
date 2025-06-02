<%-- 
    Document   : Tarea13
    Created on : 19 ene 2025, 00:04:43
    Author     : Aldoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body class="w-full h-screen flex justify-center items-center">
        <form action="/Proyecto_Final/Tarea13" method="GET">   
            <img src="https://www.comunicacionsocial.uam.mx/proceso-azcapotzalco/50_logo.png" alt="alt"
                 width="300" height="300" class="mb-4 self-center"
                 />
            <div class="w-full flex flex-col items-center my-3">
                <p>Hernández Flores Aldo Enrique  2193035908</p>
                <p>García Godoy Víctor Saúl  2183042802</p>
            </div>
            <input type="submit" value="Ir a la Página" name="btnGet"  
                   class="
                            bg-red-700 w-[300px] 
                            flex items-center justify-center rounded  
                            hover:cursor-pointer text-white p-2 text-xl
                            hover:bg-opacity-30 hover:transition-opacity hover:transition-duration-500
                            hover:text-black
                        "                   
                   />
        </form>
        
    </body>
</html>
