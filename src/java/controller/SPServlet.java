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
import model.SanPham;
import model.SanPhamDAO;
import model.TrangThai;

/**
 *
 * @author Tam
 */
@WebServlet(name = "SPServlet", urlPatterns = {"/SPServlet"})
public class SPServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    SanPhamDAO spd = new SanPhamDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");
            String tensp = request.getParameter("tensp");
            String gia = request.getParameter("gia");
            String mota = request.getParameter("mota");
            String idDanhMuc = request.getParameter("idDanhMuc");
            String idStt = request.getParameter("idStt");
            String action = request.getParameter("action");
            SanPhamDAO spd = new SanPhamDAO();
            DanhMucDAO dmd = new DanhMucDAO();
            if (id == null) {
//                request.setAttribute("List", dmd.getTenDanhMuc());
                request.getRequestDispatcher("../admin/sanpham.jsp").forward(request, response);
//                    response.sendRedirect("sanpham.jsp");
            } else {
                switch (action) {
                    case "add":
                        SanPham sp = new SanPham(id, tensp, Double.parseDouble(gia), mota, new DanhMuc(idDanhMuc, ""), new TrangThai(idStt, ""));
                        spd.addSanPham(sp);
                        request.getRequestDispatcher("../admin/sanpham.jsp").forward(request, response);
                        break;
                    case "edit":
                        SanPham sp1;
                         {
                            try {
                                sp1 = spd.findSanPhambyID(id);
                                request.setAttribute("SANPHAM", sp1);
                                request.setAttribute("List", dmd.getTenDanhMuc());
                                request.getRequestDispatcher("../sanpham.jsp").forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(SPServlet.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    case "del":
                        spd.del(id);
                        request.getRequestDispatcher("../sanpham.jsp").forward(request, response);
                        break;
                    case "update":
                        spd.update(id, tensp, gia, mota, idDanhMuc, idStt);
                        request.getRequestDispatcher("../sanpham.jsp").forward(request, response);
                        break;

                }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SPServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SPServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
