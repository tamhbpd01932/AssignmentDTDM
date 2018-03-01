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
 * @author fpd
 */
public class DanhMucDAO {

    Connection con = null;
    PreparedStatement ps, ps1, ps2, ps3, ps4;

    public DanhMucDAO() {
        con = new ConnectDB().getConnect();
        try {
            ps = con.prepareStatement("SELECT dbdanhmuc.tenDanhMuc FROM `dbdanhmuc`");
            ps1 = con.prepareStatement("INSERT INTO `dbdanhmuc` (`ID`, `tenDanhMuc`) VALUES (?, ?)");
            ps2 = con.prepareStatement("SELECT * FROM `dbdanhmuc` ORDER BY dbdanhmuc.ID DESC");
            ps3 = con.prepareStatement("DELETE FROM `dbdanhmuc` WHERE dbdanhmuc.ID=?");
            ps4 = con.prepareStatement("UPDATE `dbdanhmuc` SET `tenDanhMuc` = ? WHERE `dbdanhmuc`.`idDanhMuc` = ?;");
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int addDanhMuc(DanhMuc dm) {
        try {
            ps1.setString(1, dm.getId());
            ps1.setString(2, dm.getName());
            if (ps1.executeUpdate() == 1) {
                return 1;
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.toString());
        }
        return -1;
    }

    public List<DanhMuc> getAllDanhMuc() throws SQLException {
        List<DanhMuc> listDanhmuc = new ArrayList<>();
        ResultSet rs = ps2.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        while (rs.next()) {
            DanhMuc danhmuc = new DanhMuc(rs.getString(1), rs.getString(2));
            listDanhmuc.add(danhmuc);
        }
        return listDanhmuc;
    }

    public List<DanhMuc> getTenDanhMuc() throws SQLException {
        List<DanhMuc> list = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        return list;
    }

    public int del(String id) {
        int kt = 0;
        try {
            ps3.setString(1, id);
            kt = ps3.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kt;
    }

    public DanhMuc findDanhMucbyID(String id) throws SQLException {
        DanhMucDAO dmd = new DanhMucDAO();
        for (int i = 1; i < dmd.getAllDanhMuc().size(); i++) {
            DanhMuc dm = new DanhMuc();
            List<DanhMuc> listDanhmuc = new ArrayList<>();
            if (listDanhmuc.get(0).equals(id)) {
                dm.setId(id);
                return dm;
            }
        }
        return null;
    }

    public int update(String id, String name) {
        int kt = 0;
        try {
            ps4.setString(1, name);
            ps4.setString(2, id);
            kt = ps4.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kt;
    }
    public static void main(String[] args) {
//        DanhMucDAO dm = new DanhMucDAO();
//        dm.addDanhMuc(new DanhMuc("2", "2"));
    }
}
