/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author GIGABYTE
 */
public class TaiKhoan {
    String matk,tentk,motaten;
    String MatKhau;
    Boolean quyen;

    public TaiKhoan() {
    }

    public TaiKhoan(String matk, String tentk, String motaten, String MatKhau, Boolean quyen) {
        this.matk = matk;
        this.tentk = tentk;
        this.motaten = motaten;
        this.MatKhau = MatKhau;
        this.quyen = quyen;
    }

    public String getMatk() {
        return matk;
    }

    public void setMatk(String matk) {
        this.matk = matk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getMotaten() {
        return motaten;
    }

    public void setMotaten(String motaten) {
        this.motaten = motaten;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Boolean getQuyen() {
        return quyen;
    }

    public void setQuyen(Boolean quyen) {
        this.quyen = quyen;
    }
   
   
    
}
