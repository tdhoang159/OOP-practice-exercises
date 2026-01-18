/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class GiangVienCoHuu extends GiangVien{
    private double luongCoBan;
    private double heSo;

    public GiangVienCoHuu(String hoTen, String ngaySinh, String hocVi, String ngayBatDauCongTac, double luongCoBan, double heSo) {
        super(hoTen, ngaySinh, hocVi, ngayBatDauCongTac);
        this.luongCoBan = luongCoBan;
        this.heSo = heSo;
    }
    
    

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    @Override
    public double tinhLuongGiangVien(int soGioLam) {
        double luongGiangVien = (soGioLam * CauHinh.LUONG_MOT_GIO) + (this.luongCoBan *this.heSo);
        super.setLuongGiangVien(luongGiangVien);
        return super.getLuongGiangVien();
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        if(Double.compare(super.getLuongGiangVien(), 0) != 0){
            System.out.printf("%.1f - %.1f - %.1f\n", this.luongCoBan, this.heSo, super.getLuongGiangVien());
        }else{
            System.out.printf("%.1f - %.1f\n", this.luongCoBan, this.heSo);
        }
    }   
}
