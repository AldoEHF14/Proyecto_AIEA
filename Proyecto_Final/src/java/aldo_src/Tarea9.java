/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package aldo_src;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Aldoh
 */
@WebServlet(name = "Tarea9", urlPatterns = {"/Tarea9"})
public class Tarea9 extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // Lectura de parámetros de la solicitud
        Scanner scanner = new Scanner(System.in);
        System.out.print("*** Arquitectura Monolitica Libreria ***\n");

        // Obtener parámetros del formulario
        int id = Integer.parseInt(request.getParameter("id"));
        String libro = request.getParameter("libro");
        String autor = request.getParameter("autor");
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        double precio = Double.parseDouble(request.getParameter("precio"));

        // Crear un objeto de Libreria
        Libreria registro = new Libreria(id, libro, autor, tipo, descripcion, precio);

        try (PrintWriter out = response.getWriter()) {
            // Mostrar la información del libro registrado en el navegador
            out.println("<html>");
            out.println("<head><title>LibreriaServlet</title></head>");
            out.println("<body>");
            out.println("<h1>Información del libro registrado</h1>");
            out.println("<p>" + registro.toString() + "</p>");
            
            // Guardar en archivo CSV
            String nombreArchivo = "biblioteca.csv";

            try {
                // Crear el archivo si no existe
                File archivo = new File(nombreArchivo);
                if (!archivo.exists()) {
                    archivo.createNewFile();
                    FileWriter escritor = new FileWriter(archivo, true);
                    escritor.write("id,libro,autor,tipo,descripcion,precio\n"); // Encabezado
                    escritor.close();
                    out.println("<p>Archivo creado: " + nombreArchivo + "</p>");
                } else {
                    out.println("<p>El archivo ya existe. Se añadirá contenido a: " + nombreArchivo + "</p>");
                }

                // Escribir el registro en el archivo
                FileWriter escritor = new FileWriter(archivo, true);
                escritor.write(registro.datos());
                escritor.close();
                out.println("<p>Registro guardado correctamente en el archivo.</p>");
                out.println("<a href=\"index.jsp\">Volver al inicio</a>");
                
            } catch (IOException e) {
                out.println("<p>Ocurrió un error al guardar el archivo.</p>");
                e.printStackTrace();
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // Métodos para manejar las solicitudes GET y POST
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet que maneja la información de libros y los guarda en un archivo CSV.";
    }
}
