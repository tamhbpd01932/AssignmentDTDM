/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DanhMuc;
import model.DanhMucDAO;

/**
 *
 * @author Tam
 */
@WebServlet(name = "NewDanhMucServlet", urlPatterns = {"/NewDanhMucServlet"})
public class NewDanhMucServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DanhMucDAO dmd = new DanhMucDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String idDanhMuc = request.getParameter("idDanhMuc");
            String nameDanhMuc = request.getParameter("tenDanhMuc");
            String action = request.getParameter("action");
            switch (action) {
                case "add":
                    DanhMuc dm = new DanhMuc(idDanhMuc, nameDanhMuc);
                    if (dmd.addDanhMuc(dm) == 1) {
                        request.getRequestDispatcher("danhmuc.jsp").forward(request, response);
                    }
                    break;
                case "update":
                    dmd.update(idDanhMuc, nameDanhMuc);
                    request.getRequestDispatcher("danhmuc.jsp").forward(request, response);
                    break;
                case "edit":
                    DanhMuc dm1;
                    try {
                        dm1 = dmd.findDanhMucbyID(idDanhMuc);
                        request.setAttribute("DANHMUC", dm1);
                        request.getRequestDispatcher("danhmuc.jsp").forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(DanhMucServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "del":
                    dmd.del(idDanhMuc);
                    request.getRequestDispatcher("danhmuc.jsp").forward(request, response);
                    break;
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
