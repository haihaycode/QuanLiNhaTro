/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static Helper.JDBCHelper.executeUpdate;
import Model.TaiKhoan;
import java.util.List;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author GIGABYTE
 */
public class TaiKhoanDao {

    public List<TaiKhoan> select() {
        String Sql = "select * from TaiKhoan";
        return select(Sql);
    }
    public void Update(TaiKhoan tk){
        String sql=" UPDATE TAIKHOAN SET TENTK = ?,  MK = ?, TenMoTa = ? WHERE MATK = ?;";
        executeUpdate(sql,tk.getTentk(),tk.getMatKhau(),tk.getMotaten(),tk.getMatk());
    }

    
      public TaiKhoan checkTkMk(String TENTK, String mk) {
        String sql = "SELECT * FROM TaiKhoan WHERE TENTK=? and mk=?";
        List<TaiKhoan> list = select(sql, TENTK, mk);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<TaiKhoan> select(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Helper.JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    TaiKhoan model = readFromResultSet(rs);
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

    private TaiKhoan readFromResultSet(ResultSet rs) throws SQLException {
        TaiKhoan model = new TaiKhoan();
        model.setMatk(rs.getString("matk"));
        model.setTentk(rs.getString("tentk"));
        model.setQuyen(rs.getBoolean("quyen"));
        model.setMatKhau(rs.getString("mk"));
        model.setMotaten(rs.getString("TenMoTa"));
        return model;
    }

}
