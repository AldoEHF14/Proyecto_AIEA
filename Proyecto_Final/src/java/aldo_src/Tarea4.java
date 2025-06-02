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
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Aldoh
 */
@WebServlet(name = "Tarea4", urlPatterns = {"/Tarea4"})
public class Tarea4 extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            // Compilar todas las clases del proyecto
            ProcessBuilder pbCompilar = new ProcessBuilder(
                "javac",
                "-d", "bin",
                "-cp", "src",
                "src/mvc/*.java"
            );
            pbCompilar.directory(new File("C:/Users/saulg/OneDrive/Trimestre24O/AIAE/Proyecto_Final/MVC"));
            pbCompilar.redirectErrorStream(true);

            Process procesoCompilacion = pbCompilar.start();
            BufferedReader readerCompilacion = new BufferedReader(new InputStreamReader(procesoCompilacion.getInputStream()));

            String linea;
            while ((linea = readerCompilacion.readLine()) != null) {
                out.println(linea + "<br>");
            }

            int exitCodeCompilacion = procesoCompilacion.waitFor();
            if (exitCodeCompilacion != 0) {
                out.println("<h2>Error al compilar los archivos</h2>");
                return;
            }

            // Ejecutar la clase principal
            ProcessBuilder pbEjecutar = new ProcessBuilder(
                "java",
                "-cp", "bin",
                "mvc.MVC"
            );
            pbEjecutar.directory(new File("C:/Users/saulg/OneDrive/Trimestre24O/AIAE/Proyecto_Final/MVC"));
            pbEjecutar.redirectErrorStream(true);

            Process procesoEjecucion = pbEjecutar.start();
            BufferedReader readerEjecucion = new BufferedReader(new InputStreamReader(procesoEjecucion.getInputStream()));

            StringBuilder output = new StringBuilder();
            while ((linea = readerEjecucion.readLine()) != null) {
                output.append(linea).append("<br>");
            }

            int exitCodeEjecucion = procesoEjecucion.waitFor();
            if (exitCodeEjecucion == 0) {
                out.println("<html><body>");
                out.println("<a href=\"index.jsp\">Volver al inicio</a>");
                //out.println("<h2>Resultado de la ejecución: </h2>");
                //out.println(output.toString);
                out.println("</body></html>");
            } else {
                out.println("<html><body>");
                out.println("<h2>Error al ejecutar la aplicación</h2>");
                out.println("</body></html>");
            }

        } catch (IOException | InterruptedException e) {
            out.println("<html><body>");
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
            out.println("</body></html>");
        }
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
        return "Short description";
    }// </editor-fold>

}
