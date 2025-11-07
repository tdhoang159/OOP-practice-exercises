/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

import com.truongduchoang.bai01.Diem;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    private Diem trenTrai;
    private Diem duoiPhai; 

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (duoiPhai.getHoanhDo() > trenTrai.getHoanhDo() && trenTrai.getTungDo() > duoiPhai.getTungDo()) {
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        } else {
            throw new Exception("Du lieu khong hop le!");
        }

    }

    public double tinhChuVi() {
        double chieuDai = this.duoiPhai.getHoanhDo() - this.trenTrai.getHoanhDo();
        double chieuRong = this.trenTrai.getTungDo() - this.duoiPhai.getTungDo();
        double result = (chieuDai + chieuRong) * 2;
        return result;
    }

    public double tinhDienTich() {
        double chieuDai = this.duoiPhai.getHoanhDo() - this.trenTrai.getHoanhDo();
        double chieuRong = this.trenTrai.getTungDo() - this.duoiPhai.getTungDo();
        double result = chieuDai * chieuRong;
        return result;
    }
    
    public void hienThi() {
        double chieuDai = this.duoiPhai.getHoanhDo() - this.trenTrai.getHoanhDo();
        double chieuRong = this.trenTrai.getTungDo() - this.duoiPhai.getTungDo();
        System.out.printf("Chieu dai = %.1f\n", chieuDai);
        System.out.printf("Chieu rong = %.1f\n", chieuRong);
        System.out.printf("Chu vi = %.1f\n", this.tinhChuVi());
        System.out.printf("Dien tich = %.1f\n", this.tinhDienTich());
    }

    public Diem getTrenTrai() {
        return this.trenTrai;
    }

    public void setTrenTrai(Diem trenTrai) throws Exception {
        if (duoiPhai.getHoanhDo() > trenTrai.getHoanhDo() && trenTrai.getTungDo() > duoiPhai.getTungDo()) {
            this.trenTrai = trenTrai;
        }else {
            throw new Exception("Du lieu khong hop le!");
        }
    }

    public Diem getDuoiPhai() {
        return this.duoiPhai;
    }

    public void setDuoiPhai(Diem duoiPhai) throws Exception {
        if (duoiPhai.getHoanhDo() > trenTrai.getHoanhDo() && trenTrai.getTungDo() > duoiPhai.getTungDo()) {
            this.duoiPhai = duoiPhai;
        }else {
            throw new Exception("Du lieu khong hop le!");
        }
    }
}
