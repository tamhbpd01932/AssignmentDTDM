/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tam
 */
public class TrangThaiDAO {
    public List<TrangThai> getStt() throws SQLException{
        Connection conn = null;
        List<TrangThai> listStt = new ArrayList<>();
        ConnectDB cn = new ConnectDB();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `dbstt` ");
            while (rs.next()) {
                TrangThai tt= new TrangThai(rs.getString(1), rs.getString(2));
                listStt.add(tt);
            }
            
        } catch (Exception ex) {
            System.out.println("Error!" +ex.toString());
        }
        conn.close();
        return listStt;
    }
}
