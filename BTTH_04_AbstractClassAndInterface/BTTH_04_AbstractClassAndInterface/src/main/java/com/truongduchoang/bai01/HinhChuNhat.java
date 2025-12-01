/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

/**
 *
 * @author admin
 */
public class HinhChuNhat extends Hinh {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(String name, double chieuDai, double chieuRong) {
        super(name);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HinhChuNhat h) {
            return super.equals(obj) && Double.compare(this.chieuDai, h.chieuDai) == 0 && Double.compare(this.chieuRong, h.chieuRong) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.chieuDai) ^ (Double.doubleToLongBits(this.chieuDai) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.chieuRong) ^ (Double.doubleToLongBits(this.chieuRong) >>> 32));
        return hash;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

}
