package com.truongduchoang.bai03;

import java.text.DecimalFormat;

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
    
    public SanPham(String tenSP, String nhaSanXuat, double giaBan){
        this.tenSP = tenSP;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        String newGia = df.format(this.giaBan).replace(",", ".");
        return String.format("%d - %s - %s - %s", this.maSP, this.tenSP, this.nhaSanXuat, newGia);
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
}
