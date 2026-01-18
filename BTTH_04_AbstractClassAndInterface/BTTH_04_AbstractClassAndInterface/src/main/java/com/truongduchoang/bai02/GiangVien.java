/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

import java.time.LocalDate;

/**
 *
 * @author Truong Duc Hoang
 */
public abstract class GiangVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private String hocVi;
    private LocalDate ngayBatDauCongTac;
    private double luongGiangVien;

    public String getHoTen() {
        return hoTen;
    }
    
    public GiangVien(String hoTen, LocalDate ngaySinh, String hocVi, LocalDate ngayBatDauCongTac){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocVi = hocVi;
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }
    
    public GiangVien(String hoTen, String ngaySinh, String hocVi, String ngayBatDauCongTac){
        this(hoTen, LocalDate.parse(ngaySinh, CauHinh.FORMATTER), hocVi, 
                LocalDate.parse(ngayBatDauCongTac, CauHinh.FORMATTER));
    }
    
    public abstract double tinhLuongGiangVien(int soGioLam);
    
    public void hienThi(){
        System.out.printf("%s - %s - %s - %s - ", 
                this.hoTen, this.ngaySinh.format(CauHinh.FORMATTER), this.hocVi, this.ngayBatDauCongTac.format(CauHinh.FORMATTER));
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public LocalDate getNgayBatDauCongTac() {
        return ngayBatDauCongTac;
    }

    public void setNgayBatDauCongTac(LocalDate ngayBatDauCongTac) {
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }
    
    public double getLuongGiangVien(){
        return this.luongGiangVien;
    }
    
    public void setLuongGiangVien(double luongGiangVien){
        this.luongGiangVien = luongGiangVien;
    }
}
