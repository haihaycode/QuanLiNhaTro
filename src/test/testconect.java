/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 *
 * @author GIGABYTE
 */
public class testconect {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=QuanLiNhaTro;userName=sa;password=123;encrypt=true;trustServerCertificate=true;");
            Statement st = con.createStatement();
            String sql = "Select vaitro from TaiKhoan where MaKH= 'KH02'";
            ResultSet rs = st.executeQuery(sql);
            System.out.println("3");
            if (rs == null) {
                System.out.println("Kết nối thất bại");
            } else {
                System.out.println("Kết nối thành công ");
            }
            while (rs.next()) {
                String role = rs.getString("vaitro");
                System.out.println("Vai trò: " + role);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
