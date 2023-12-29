/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author GIGABYTE
 */
public class ThanhToan {
    String MaHD;
    Double TienDien, TienNuoc, TienTro;
    Double Tong = TienDien + TienNuoc + TienTro;

    public ThanhToan(String MaHD, Double TienDien, Double TienNuoc, Double TienTro) {
        this.MaHD = MaHD;
        this.TienDien = TienDien;
        this.TienNuoc = TienNuoc;
        this.TienTro = TienTro;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Double getTienDien() {
        return TienDien;
    }

    public void setTienDien(Double TienDien) {
        this.TienDien = TienDien;
    }

    public Double getTienNuoc() {
        return TienNuoc;
    }

    public void setTienNuoc(Double TienNuoc) {
        this.TienNuoc = TienNuoc;
    }

    public Double getTienTro() {
        return TienTro;
    }

    public void setTienTro(Double TienTro) {
        this.TienTro = TienTro;
    }

    public Double getTong() {
        return Tong;
    }

    public void setTong(Double Tong) {
        this.Tong = Tong;
    }
    
}
