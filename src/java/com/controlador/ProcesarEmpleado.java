/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class ProcesarEmpleado extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        if (request.getParameter("btnEnviar")!=null) 
        {
            try {
                int codigo;
            int edad;
            double sueldo;
            String nombre;
            String cargo;
            String genero;
            String intereses[];
            
            codigo=Integer.parseInt(request.getParameter("txtCodigo"));
            edad=Integer.parseInt(request.getParameter("txtEdad"));
            nombre=request.getParameter("txtNom");
            genero=request.getParameter("genero");
            cargo=request.getParameter("cargo");
            sueldo=Double.parseDouble(request.getParameter("txtSueldo"));
            intereses=request.getParameterValues("interes");
           /*instancia de objeto*/ Empleado obj= new Empleado(codigo,nombre,edad,genero,cargo,sueldo,intereses);
            /*variable de session*/request.getSession().setAttribute(/*variable para sesion*/"empleado", obj);
          /*redireccionar pagina*/  request.getRequestDispatcher(/*pagina a redicionar*/"exito.jsp").forward(request, response);
            } catch (Exception e) 
            {
                request.getRequestDispatcher("completar.jsp").forward(request, response);
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
