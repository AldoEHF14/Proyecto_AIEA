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
@WebServlet(name = "Tarea13", urlPatterns = {"/Tarea13"})
public class Tarea13 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<script src=\"https://cdn.tailwindcss.com\"></script>");
        out.println("<title>Tienda de Productos</title>");
        out.println("</head>");
        out.println("<body class=\"w-full h-[200%]\">");
        
        // Header
        out.println("<header class=\"w-full bg-red-800 flex justify-start py-3 shadow\">");
        out.println("<h2 class=\"text-white text-center w-full font-bold text-2xl\" id=\"tittle\">");
        out.println("Página de Productos de la UAM Azcapotzalco");
        out.println("</h2>");
        out.println("</header>");
        
        // Main content
        out.println("<div class=\"w-full h-screen flex justify-center\">");
        out.println("<div class=\"w-auto h-screen grid lg:grid-cols-3 p-3 md:grid-cols-2 grid-cols-1\" id=\"contenedor_productos\">");
        
        // Productos (puedes generar esto desde un arreglo o base de datos)
        agregarProductoTipo1(out, "IVD7jqYZEozWyl", "Desarrollo de Software", "Dr. Pedro Pablo Gonzales Perez", "Erase una vez un Java Servlet...", 320);
        agregarProductoTipo1(out, "Cvq9ZdkjWkY3mo", "Matemáticas Aplicadas para Ingeniería", "Dr. Rafael Perez Flores", "Métodos para ingeniería.", 320);
        agregarProductoTipo1(out, "E9FUVaJuVPa68V", "Arquitectura de Computadoras", "Dra. Maria del Carmen Fuentes", "Una breve introducción a la arquitectura de computadoras.", 320);
        agregarProductoTipo1(out, "ZxM9PjQWEbvLk3", "Programación en Python", "Dr. Alejandro Morales García", "Una guía completa para principiantes y expertos en Python.", 280);
        agregarProductoTipo1(out, "JqT5RnWXYoVzK9", "Diseño Gráfico Moderno", "Lic. Mariana Ruiz Pérez", "Explora las tendencias actuales en diseño gráfico.", 340);
        
        agregarProductoTipo2(out, "producto1", "Caroline", "Neil Gaiman", "Una emocionante novela juvenil que combina aventura y misterio. Sigue a Caroline mientras descubre los secretos ocultos de su entorno y lucha por su lugar en el mundo.", 349.99, "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F04%2F02%2F16%2F31%2Fbook-307524_960_720.png&f=1&nofb=1&ipt=5ce791857650ebd9b137b5e32484a77c1161233ceed42cec925807b8ee7370d1&ipo=images");
        agregarProductoTipo2(out, "producto2", "El Invisible", "Eloy Moreno", "Una historia conmovedora sobre un joven que se siente ignorado por el mundo. Este libro explora el poder de la empatía y la conexión humana.", 299.00, "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F04%2F02%2F16%2F31%2Fbook-307524_960_720.png&f=1&nofb=1&ipt=5ce791857650ebd9b137b5e32484a77c1161233ceed42cec925807b8ee7370d1&ipo=images");
        agregarProductoTipo2(out, "producto3", "El Principito", "Antoine de Saint-Exupéry", "Un clásico de la literatura universal que relata las aventuras de un pequeño príncipe y sus reflexiones sobre la vida, el amor y la amistad.", 270.99, "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F04%2F02%2F16%2F31%2Fbook-307524_960_720.png&f=1&nofb=1&ipt=5ce791857650ebd9b137b5e32484a77c1161233ceed42cec925807b8ee7370d1&ipo=images");
        agregarProductoTipo2(out, "producto4", "Harry Potter 1", "J.K. Rowling", "La primera entrega de la saga mágica de Harry Potter, donde el joven mago descubre su verdadero destino y entra al fascinante mundo de Hogwarts.", 399.00, "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F04%2F02%2F16%2F31%2Fbook-307524_960_720.png&f=1&nofb=1&ipt=5ce791857650ebd9b137b5e32484a77c1161233ceed42cec925807b8ee7370d1&ipo=images");
        agregarProductoTipo2(out, "producto5", "El Esclavo", "Francisco J. Ángel", "Un relato íntimo y transformador que narra el proceso de redención personal de un hombre atrapado en sus propios miedos y errores.", 99.99, "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F04%2F02%2F16%2F31%2Fbook-307524_960_720.png&f=1&nofb=1&ipt=5ce791857650ebd9b137b5e32484a77c1161233ceed42cec925807b8ee7370d1&ipo=images");

        out.println("</div>");
        
        // Contenedor de comentarios
        out.println("<aside class=\"w-[400px] h-4/5 bg-white border border-gray-300 shadow-xl flex flex-col px-4 py-2 hidden\" id=\"comentarios_contenedor\">");
        out.println("<span onclick=\"document.getElementById('comentarios_contenedor').style.display='none'\">&times;</span>");
        out.println("<p class=\"font-bold text-center w-full text-gray-700\">Sección de comentarios</p>");
        out.println("<div class=\"flex flex-1 bg-gray-100 flex-col\" id=\"caja_comentarios\"></div>");
        out.println("<div class=\"flex w-full justify-evenly my-2\">");
        out.println("<input id=\"comentario_texto\" type=\"text\" placeholder=\"Introduzca un comentario :)\" class=\"border border-gray-300 rounded p-1 text-center w-full\">");
        out.println("<button class=\"px-1 border border-gray-200 bg-red-700 rounded text-white px-2\" onclick=\"comentar(document.getElementById('comentario_texto').value)\">Enviar</button>");
        out.println("</div>");
        out.println("</aside>");

        out.println("</div>");
        out.println("<script>");
        out.println("function comprar(id) { console.log('Has comprado un libro: ' + id); }");
        out.println("function mostrarCajaComentarios() { document.getElementById('comentarios_contenedor').style.display = 'block'; }");
        out.println("function comentar(value) {");
        out.println("    console.log(value);");
        out.println("    const comentariesContainer = document.getElementById('caja_comentarios');");
        out.println("    const commentContainer = document.createElement('div');");
        out.println("    const newParragraph = document.createElement('p');");
        out.println("    newParragraph.innerText = value;");
        out.println("    newParragraph.setAttribute('class', 'text-xs');");
        out.println("    commentContainer.setAttribute('class', 'w-4/5 border border-red-900 flex m-2 self-center p-3 rounded-lg comment');");
        out.println("    commentContainer.appendChild(newParragraph);");
        out.println("    comentariesContainer.appendChild(commentContainer);");
        out.println("}");
        out.println("</script>");
        out.println("</body>");
        out.println("</html>");
        }
    }

    public void agregarProductoTipo1(PrintWriter out, String id, String titulo, String autor, String descripcion, int precio){
        out.println("<div class=\"w-[300px] h-[380px] m-3 border border-red-600 border-2 flex flex-col justify-evenly p-3 bg-white shadow\" id=\"" + id + "\">");
        out.println("<p class=\"w-full text-center my-2 font-medium font-sans text-blue-600 title\">" + titulo + "</p>");
        out.println("<img class=\"w-24 self-center\" src=\"https://www.pngall.com/wp-content/uploads/2018/05/Books-PNG-File.png\" alt=\"libro\"/>");
        out.println("<p class=\"text-sm text-left\">" + autor + "</p>");
        out.println("<p class=\"text-xs text-left\">" + descripcion + "</p>");
        out.println("<p class=\"text-red-500 font-bold text-center\">$" + precio + ".00 MXN</p>");
        out.println("<button class=\"border rounded p-1 px-2 bg-green-500 shadow border border-gray-200 hover:bg-green-200\" onclick=\"comprar('" + id + "')\">Comprar</button>");
        out.println("<button class=\"border rounded -mt-2 p-1 px-2 bg-yellow-500 shadow border border-gray-200 hover:bg-yellow-200\" onclick=\"mostrarCajaComentarios()\">Dejar comentario producto</button>");
        out.println("</div>");
    }
    
    public void agregarProductoTipo2(PrintWriter out, String id, String titulo, String autor, String descripcion, double precio, String imagen) {
    out.println("<div class=\"w-[300px] h-[380px] m-3 border border-red-600 border-2 flex flex-col justify-evenly p-3 bg-white shadow\" id=\"" + id + "\">");
    out.println("<p class=\"w-full text-center my-2 font-medium font-sans text-blue-600 title\">" + titulo + "</p>");
    out.println("<img class=\"w-24 self-center\" src=\"" + imagen + "\" alt=\"Imagen de " + titulo + "\"/>");
    out.println("<p class=\"text-sm text-left\">" + autor + "</p>");
    out.println("<p class=\"text-xs text-left\">" + descripcion + "</p>");
    out.println("<p class=\"text-red-500 font-bold text-center\">$" + String.format("%.2f", precio) + " MXN</p>");
    out.println("<button class=\"border rounded p-1 px-2 bg-green-500 shadow border border-gray-200 hover:bg-green-200\" onclick=\"comprar('" + id + "')\">Comprar</button>");
    out.println("<button class=\"border rounded -mt-2 p-1 px-2 bg-yellow-500 shadow border border-gray-200 hover:bg-yellow-200\" onclick=\"mostrarCajaComentarios()\">Dejar comentario producto</button>");
    out.println("</div>");
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
        return "Short description";
    }// </editor-fold>



}