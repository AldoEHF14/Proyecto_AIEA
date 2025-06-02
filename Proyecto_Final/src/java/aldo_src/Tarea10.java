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

/**
 *
 * @author Aldoh
 */
@WebServlet(name = "Tarea10", urlPatterns = {"/Tarea10"})
public class Tarea10 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Leer parámetros del formulario
        int id = Integer.parseInt(request.getParameter("id"));
        String libro = request.getParameter("libro");
        String autor = request.getParameter("autor");
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        double precio = Double.parseDouble(request.getParameter("precio"));

        // Crear un registro con los datos del libro
        String registro = id + "," + libro + "," + autor + "," + tipo + "," + descripcion + "," + precio;

        // Guardar en archivo CSV
        String nombreArchivo = "biblioteca_CS.csv";
        try (PrintWriter out = response.getWriter()) {
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
            escritor.write(registro + "\n");
            escritor.close();
            out.println("<p>Registro guardado correctamente en el archivo.</p>");

            // Enviar una respuesta al usuario
            out.println("<a href=\"index.jsp\">Volver al inicio</a>");
        } catch (IOException e) {
            e.printStackTrace();
            response.getWriter().println("<p>Ocurrió un error al guardar el archivo.</p>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet que maneja la información de libros y los guarda en un archivo CSV.";
    }// </editor-fold>

}
