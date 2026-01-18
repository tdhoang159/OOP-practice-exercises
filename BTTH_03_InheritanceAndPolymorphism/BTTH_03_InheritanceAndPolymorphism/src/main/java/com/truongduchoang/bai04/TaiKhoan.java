/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai04;

/**
 *
 * @author admin
 */
public abstract class TaiKhoan {

    private static int dem = 0;
    private String soTK;
    private String tenTK;
    private double soTien;

    {
        soTK = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTK, double soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public void hienThi() {
        System.out.printf("%s - %s - %.1f - So tien lai: %.1f/thang\n", this.soTK, this.tenTK, this.soTien, this.tinhTienLai());
    }

    public abstract boolean isDaoHan();
    
    public abstract double tinhTienLai();

    public void nopTien(double soTienNop) {
        if (this.isDaoHan()) {
            this.soTien += soTienNop;
        }
    }

    public void rutTien(double soTienRut) {
        if (this.isDaoHan() && this.soTien >= soTienRut) {
            this.soTien -= soTienRut;
        }
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

}
