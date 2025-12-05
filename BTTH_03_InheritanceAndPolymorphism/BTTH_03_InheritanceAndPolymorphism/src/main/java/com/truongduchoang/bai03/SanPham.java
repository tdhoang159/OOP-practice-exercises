package com.truongduchoang.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Truong Duc Hoang
 */
public abstract class SanPham {
    private static int dem = 0;
    private int maSP = ++dem;
    private String tenSP;
    private String nhaSanXuat;
    private double giaBan;
    private LocalDate ngayPhatHanh;
    
    public SanPham(String tenSP, String nhaSanXuat, double giaBan, String ngayPhatHanh){
        this.tenSP = tenSP;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
        this.ngayPhatHanh = LocalDate.parse(ngayPhatHanh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        String newGia = df.format(this.giaBan).replace(",", ".");
        return String.format("%d - %s - %s - %s - %s", this.maSP, this.tenSP, this.nhaSanXuat, newGia, this.getNgayPhatHanh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    } 

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
