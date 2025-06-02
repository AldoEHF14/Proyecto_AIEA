/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package equipo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Aldoh
 */
@WebServlet(name = "ServeltFormulario", urlPatterns = {"/ServeltFormulario"})
public class ServeltFormulario extends HttpServlet {

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
         try (var out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TODO supply a title</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<script src=\"https://cdn.tailwindcss.com\"></script>");
            out.println("</head>");
            out.println("<body class=\"w-full h-screen flex flex-col justify-center items-center bg-gray-200\">");
            out.println("<h1 class=\"font-bold text-3xl\">Formulario de Compra - Tienda de Libros</h1>");
            out.println("<div class=\"w-1/2 mt-4 max-h-[500px] shadow-xl p-4 flex items-center justify-center bg-white min-w-[300px] rounded-xl\">");
            out.println("<form action=\"ServeltProductos\" method=\"POST\" class=\"w-full h-full flex flex-col justify-evenly overflow-y-auto\">");
            out.println("<label for=\"nombre\">Nombre del Libro:</label>");
            out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\" required=\"required\" class=\"border border-gray-600\"/>");
            out.println("<br />");
            out.println("<label for=\"imagen\">Selecciona la portada de tu libro</label>");
            out.println("<div class=\"first\">");
            out.println("<p><input type=\"file\" enctype=\"multipart/form-data\" accept=\"image/*\" name=\"image\" id=\"file\" onchange=\"loadFile(event)\" required=\"required\"></p>");
            out.println("<p><img id=\"output\" width=\"200\" /></p>");
            out.println("</div>");
            out.println("<script type=\"text/javascript\">");
            out.println("var loadFile = function(event) {");
            out.println("var image = document.getElementById('output');");
            out.println("image.src = URL.createObjectURL(event.target.files[0]);");
            out.println("};");
            out.println("</script>");
            out.println("<br />");
            out.println("<label for=\"descripcion\">Descripcion:</label>");
            out.println("<input type=\"text\" id=\"descripcion\" name=\"descripcion\" required=\"required\" class=\"border border-gray-600\" />");
            out.println("<br />");
            out.println("<label for=\"autor\">Autor:</label>");
            out.println("<input type=\"text\" id=\"autor\" name=\"autor\" required=\"required\" class=\"border border-gray-600\" />");
            out.println("<br />");
            out.println("<label for=\"precio\">Precio:</label>");
            out.println("<input type=\"text\" id=\"precio\" name=\"precio\" required=\"required\" class=\"border border-gray-600\"/>");
            out.println("<br />");
            out.println("<input type=\"submit\" value=\"Agregar libro\" name=\"btnGet\"");
            out.println("class=\"bg-red-700 w-[200px] flex items-center justify-center rounded hover:cursor-pointer text-white p-2 text-xl hover:bg-opacity-30 hover:transition-opacity hover:transition-duration-500 hover:text-black self-center\" />");
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            
            
        } catch (Exception e) {
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
