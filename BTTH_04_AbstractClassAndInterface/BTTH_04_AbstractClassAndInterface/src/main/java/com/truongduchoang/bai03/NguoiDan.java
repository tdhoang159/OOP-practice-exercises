/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Truong Duc Hoang
 */
public class NguoiDan {
    private String CCCD;
    private String hoTen;
    private String gioiTinh;
    private String soDienThoai;
    private LocalDate ngaySinh;
    private List<ThongTinTiemChung> dsTiemChung = new ArrayList<>();

    public NguoiDan(String CCCD, String hoTen, String gioiTinh, String soDienThoai, LocalDate ngaySinh) {
        this.CCCD = CCCD;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
    }
    
    public NguoiDan(String CCCD, String hoTen, String gioiTinh, String soDienThoai, String ngaySinh){
        this(CCCD, hoTen, gioiTinh, soDienThoai, LocalDate.parse(ngaySinh, CauHinh.FORMMAT_DATE));
    }
    
    public void hienThi(){
        System.out.printf("CCCD: %s - Ho ten: %s - Gioi tinh: %s - SDT: %s - Ngay sinh: %s ", 
                this.CCCD, this.hoTen, this.gioiTinh, this.soDienThoai, this.ngaySinh.format(CauHinh.FORMMAT_DATE));
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public boolean isTren18Tuoi(){
        return LocalDate.now().getYear() - this.ngaySinh.getYear() >= 18;
    }

    public List<ThongTinTiemChung> getDsTiemChung() {
        return dsTiemChung;
    }

    public void setDsTiemChung(List<ThongTinTiemChung> dsTiemChung) {
        this.dsTiemChung = dsTiemChung;
    }
}
