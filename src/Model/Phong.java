/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author GIGABYTE
 */
public class Phong {
    private String tenphong,mota, HinhAnh;
    private int MaPhong, maloaiphong,giatien;
    private boolean trangThai;
    

    public Phong() {
    }

    public Phong(String tenphong, String mota, String HinhAnh, int MaPhong, int maloaiphong, int giatien, boolean trangThai) {
        this.tenphong = tenphong;
        this.mota = mota;
        this.HinhAnh = HinhAnh;
        this.MaPhong = MaPhong;
        this.maloaiphong = maloaiphong;
        this.giatien = giatien;
        this.trangThai = trangThai;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getMaloaiphong() {
        return maloaiphong;
    }

    public void setMaloaiphong(int maloaiphong) {
        this.maloaiphong = maloaiphong;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
   
}
