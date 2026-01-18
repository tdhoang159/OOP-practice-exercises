/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.truongduchoang.bai04;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public enum KyHan {
    MOT_TUAN(1, 0.5){
        @Override
        public LocalDate tinhDaoHan(LocalDate from) {
           return from.plusWeeks(this.getKhoangThoiGian());
        }
    }, 
    MOT_THANG(1, 4.5){
        @Override
        public LocalDate tinhDaoHan(LocalDate from) {
           return from.plusMonths(this.getKhoangThoiGian());
        }
    },
    MOT_NAM(1, 6.8){
        @Override
        public LocalDate tinhDaoHan(LocalDate from) {
           return from.plusYears(this.getKhoangThoiGian());
        }
    },;
    
    private int khoangThoiGian;
    private double laiSuat;
    
    private KyHan(int khoangThoiGian, double laiSuat){
        this.khoangThoiGian = khoangThoiGian;
        this.laiSuat = laiSuat;
    }
    
    public abstract LocalDate tinhDaoHan(LocalDate from);

    public int getKhoangThoiGian() {
        return khoangThoiGian;
    }

    public void setKhoangThoiGian(int khoangThoiGian) {
        this.khoangThoiGian = khoangThoiGian;
    }

    /**
     * @return the laiSuat
     */
    public double getLaiSuat() {
        return laiSuat;
    }

    /**
     * @param laiSuat the laiSuat to set
     */
    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }
    
}
