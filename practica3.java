/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lino
 */
@WebServlet(urlPatterns = {"/practica3"})
public class practica3 extends HttpServlet {

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
            
            String nombre = request.getParameter("nombre");
            String carrera = request.getParameter("carrera");
            String fechanac = request.getParameter("fechanacimiento");
            String passw = request.getParameter("passw");
            String correo = request.getParameter("correo");
            
            if(nombre == null && carrera == null && fechanac == null && passw == null && correo == null){
                    out.println("<!DOCTYPE html>");
                    out.println("<html lang='en'>");
                    out.println("");
                    out.println("  <head>");
                    out.println("");
                    out.println("    <meta charset='utf-8'>");
                    out.println("    <meta name='viewport' content='width=device-width, initial-scale=1'>");
                    out.println("    <meta name='author' content=''>");
                    out.println("");
                    out.println("");
                    out.println("    <title>Práctica 1 - Lab de Diseño Orientado a Objetos</title>");
                    out.println("");
                    out.println("    <!-- Bootstrap core CSS -->");
                    out.println("    <link href='vendor/bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
                    out.println("");
                    out.println("    <!-- Custom fonts for this template -->");
                    out.println("    <link href='vendor/font-awesome/css/font-awesome.min.css' rel='stylesheet' type='text/css'>");
                    out.println("    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>");
                    out.println("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>");
                    out.println("");
                    out.println("    <!-- Custom styles for this template -->");
                    out.println("    <link href='css/clean-blog.min.css' rel='stylesheet'>");
                    out.println("");
                    out.println("    <!-- Script para el datepicker -->");
                    out.println("");
                    out.println("    <script src='https://code.jquery.com/jquery-1.12.4.js'></script>");
                    out.println("    <script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>");
                    out.println("    <script>");
                    out.println("      $( function() {");
                    out.println("      $( '#datepicker' ).datepicker();");
                    out.println("       } );");
                    out.println("    </script>");
                    out.println("");
                    out.println("    <!--- Estilos para el botón de input --->");
                    out.println("");
                    out.println("    <style>");
                    out.println("      .button {");
                    out.println("      background-color: #4CAF50;");
                    out.println("      border: none;");
                    out.println("      color: white;");
                    out.println("      padding: 15px 32px;");
                    out.println("      text-align: center;");
                    out.println("      text-decoration: none;");
                    out.println("      display: inline-block;");
                    out.println("      font-size: 16px;");
                    out.println("      margin: 4px 2px;");
                    out.println("      cursor: pointer;");
                    out.println("      }");
                    out.println("</style>");
                    out.println("");
                    out.println("<style>");
                    out.println("      .tg  {border-collapse:collapse;border-spacing:0;}");
                    out.println("      .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}");
                    out.println("      .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}");
                    out.println("      .tg .tg-0lax{text-align:left;vertical-align:top}");
                    out.println("");
                    out.println("    </style>");
                    out.println("");
                    out.println("  </head>");
                    out.println("");
                    out.println("  <body>");
                    out.println("    <!-- Main Content -->");
                    out.println("    <div class='container'>");
                    out.println("      <div class='row'>");
                    out.println("        <div class='col-lg-8 col-md-10 mx-auto'>");
                    out.println("          <div class='post-preview'>");
                    out.println("            <a href='post.html'>");
                    out.println("              <h2 class='post-title'>");
                    out.println("                Por favor, llene los siguientes datos:");
                    out.println("              </h2>");
                    out.println("            </a>");
                    out.println("          </div>");
                    out.println("          <div align='center'>");
                    out.println("            <form action='practica3' METHOD='post'>");
                    out.println("              Nombre:<br><input type='text' name='nombre'><br>");
                    out.println("              Carrera:<br><select name='carrera'>");
                    out.println("                <option value='Seguridad en Tecnologías de Información'>Seguridad en Tecnologías de Información</option>");
                    out.println("                <option value='Ciencias Computacionales'>Ciencias Computacionales</option>");
                    out.println("                <option value='Matemáticas'>Matemáticas</option>");
                    out.println("                <option value='Física'>Física</option>");
                    out.println("                <option value='Actuaria'>Actuaria</option>");
                    out.println("              </select>");
                    out.println("              <br>");
                    out.println("              Fecha de nacimiento:<br><input type='date' name='fechanacimiento'><br>");
                    out.println("              Contraseña: <br><input type='password' name='passw'><br>");
                    out.println("              Correo electrónico:<br><input type='email' name='correo'><br><br>");
                    out.println("              <input type='submit' class='button' value='Enviar formulario'>");
                    out.println("            </form>");
                    out.println("  </body>");
                    out.println("");
                    out.println("</html>");
            } else {
                out.println("<h1> Datos recogidos: </h1><br>");
                out.println("Su nombre es: " + nombre);
                out.println("<br>Su carrera es: " + carrera);
                out.println("<br>Su fecha de nacimiento es: " + fechanac);
                out.println("<br>Su contraseña es: " + passw);
                out.println("<br>Su correo es: " + correo);
            }
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
        return "Short description";
    }// </editor-fold>

}
