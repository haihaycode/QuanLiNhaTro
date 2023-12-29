/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.KhachHang;
import Model.TaiKhoan;
import java.util.Date;
import java.sql.Timestamp;

/**
 *
 * @author GIGABYTE
 */
public class KhachHangDao {

    public List<KhachHang> getList() {
        String sql = "select * from KhachHang ";
        return select(sql);
    }

    public KhachHang findByid(int makh) {
        String sql = "select * from KhachHang where makh=?";
        List<KhachHang> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<KhachHang> select(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Helper.JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSet(rs);
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

    private KhachHang readFromResultSet(ResultSet rs) throws SQLException {
        KhachHang model = new KhachHang();
        model.setMaKH(rs.getInt("MAKH"));
        model.setTenKhachHang(rs.getString("TENKH"));
        model.setCMND(rs.getString("CMND"));
        model.setHinhAnh(rs.getString("HINH"));
        model.setSDT(rs.getString("SDT"));
        model.setMatk(rs.getString("MATK"));
        model.setGhichu(rs.getString("GHICHU"));
        model.setCreateAt(rs.getTimestamp("createAt"));
        model.setUpdateAt(rs.getTimestamp("updateAt"));

        return model;
    }
}
