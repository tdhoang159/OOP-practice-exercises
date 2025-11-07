/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai04;

import com.truongduchoang.bai01.Diem;

/**
 *
 * @author admin
 */
public class HinhTron {
    private Diem tam;
    private double banKinh;
    
    public HinhTron(Diem tam, double banKinh){
        this.tam = tam;
        this.banKinh = banKinh;
    }
    
    public double tinhDienTich() {
        return Math.PI * Math.pow(this.banKinh, 2);
    }
    
    public double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }
    
    public int vttdVoi1Diem(Diem d) {
        double khoangCach = this.tam.tinhKhoangCach(d);
        return Double.compare(khoangCach, this.banKinh);
    }
    
    public int vttdVoiHinhTron(HinhTron ht){
        double khoangCach2Tam = this.tam.tinhKhoangCach(ht.tam);
        double tong2BanKinh = this.banKinh + ht.banKinh;
        return Double.compare(khoangCach2Tam, tong2BanKinh);
    }
    
    public Diem getTam() {
        return this.tam;
    }
    
    public void setTam(Diem tam) {
        this.tam = tam;
    }
    
    public double getBanKinh() {
        return this.banKinh;
    }
    
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
}
