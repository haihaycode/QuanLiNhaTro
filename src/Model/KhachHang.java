/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author GIGABYTE
 */
public class KhachHang {

    private String TenKhachHang, CMND, SDT, HinhAnh, matk, ghichu;
    private Timestamp createAt, updateAt;
    private int MaKH;

    public KhachHang() {
    }

    public KhachHang(String TenKhachHang, String CMND, String SDT, String HinhAnh, String matk, String ghichu, Timestamp createAt, Timestamp updateAt, int MaKH) {
        this.TenKhachHang = TenKhachHang;
        this.CMND = CMND;
        this.SDT = SDT;
        this.HinhAnh = HinhAnh;
        this.matk = matk;
        this.ghichu = ghichu;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.MaKH = MaKH;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMatk() {
        return matk;
    }

    public void setMatk(String matk) {
        this.matk = matk;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

}
