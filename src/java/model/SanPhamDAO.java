/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tam
 */
public class SanPhamDAO {

    Connection con = null;
    PreparedStatement pr1, pr2, pr3, pr4;

    public SanPhamDAO() {
        con = new ConnectDB().getConnect();
        try {
            pr1 = con.prepareStatement("INSERT INTO `dbsanpham`(`TenSanPham`, `Gia`, `MoTa`, `DanhMuc`, `TinhTrang`) VALUES (?,?,?,?,?)");
            pr2 = con.prepareStatement("SELECT * FROM `dbsanpham` ORDER BY dbsanpham.ID DESC");
            pr3 = con.prepareStatement("DELETE FROM `dbsanpham` WHERE ID =?");
            pr4 = con.prepareStatement("UPDATE `dbsanpham` SET `TenSanPham`=?,`Gia`=?,`MoTa`=?,`DanhMuc`=?,`TinhTrang`=? WHERE dbsanpham.ID=?");
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int addSanPham(SanPham sp) {
        try {
            pr1.setString(1, sp.getTensp());
            pr1.setDouble(2, sp.getGia());
            pr1.setString(3, sp.getMota());
            pr1.setString(4, sp.getDanhMuc().getId());
            pr1.setString(5, sp.getTrangThai().getID());
            if (pr1.executeUpdate() == 1) {
                return 1;
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.toString());
        }
        return -1;
    }

    public List<SanPham> getAllSanPham() throws SQLException {
        List<SanPham> listSanPham = new ArrayList<>();
        ResultSet rs = pr2.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        while (rs.next()) {
            SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4), new DanhMuc(rs.getString(5), rs.getString(5)),new TrangThai(rs.getString(6), rs.getString(6)) );
            listSanPham.add(sp);
        }
        return listSanPham;
    }

    public int del(String id) {
        int kt = 0;
        try {
            pr3.setString(1, id);
            kt = pr3.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kt;
    }

    public SanPham findSanPhambyID(String id) throws SQLException {
        SanPhamDAO spDAO = new SanPhamDAO();
        for (int i = 1; i < spDAO.getAllSanPham().size(); i++) {
            SanPham sp = new SanPham();
            List<SanPham> listSanPham = new ArrayList<>();
            if (listSanPham.get(0).equals(id)) {
                sp.setId(id);
                return sp;
            }
        }
        return null;
    }

    public int update(String id, String name, String gia, String mota, String danhmuc, String trangthai) {
        int kt = 0;
        try {
            pr4.setString(1, name);
            pr4.setString(2, gia);
            pr4.setString(3, mota);
            pr4.setString(4, danhmuc);
            pr4.setString(5, trangthai);
            pr4.setString(6, id);
            kt = pr4.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kt;
    }

}
