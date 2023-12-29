/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.KhachHang;
import Model.Phong;
import Model.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phuc le
 */
public class PhongDao {
    
     public List<Phong> select() {
        String Sql = "SELECT P.*, LP.GIA FROM PHONG P INNER JOIN LOAIPHONG LP ON P.MALP = LP.MALP;";
        return select(Sql);
    }
     
     
     private List<Phong> select(String sql, Object... args) {
        List<Phong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Helper.JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Phong model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
     private Phong readFromResultSet(ResultSet rs) throws SQLException {
        Phong model = new Phong();
        model.setMaPhong(rs.getInt("map"));
        model.setMaloaiphong(rs.getInt("malp"));
        model.setTenphong(rs.getString("tenp"));
        model.setMota(rs.getString("mota"));
        model.setHinhAnh(rs.getString("hinhanh"));
        model.setTrangThai(rs.getBoolean("trangthai"));
        model.setGiatien(rs.getInt("GIA"));
      

        return model;
    }
     
     
     public static void main(String[] args) {
         PhongDao dao= new PhongDao();
         System.out.println(dao.select());
    }
}
