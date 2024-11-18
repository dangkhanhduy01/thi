package model;

import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int MaSP;
    private String TenSP;
    private int DonGia;
    private String Hinh;
    private int MaLoai;
    private boolean KhuyenMai;

    public SanPham() {
    }

    public SanPham(int MaSP, String TenSP, int DonGia, String Hinh, int MaLoai, boolean KhuyenMai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.Hinh = Hinh;
        this.MaLoai = MaLoai;
       this.KhuyenMai = KhuyenMai;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public boolean getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(boolean KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", DonGia=" + DonGia + ", Hinh=" + Hinh + ", MaLoai=" + MaLoai + ", KhuyenMai=" + KhuyenMai + '}';
    }

   
   
}
