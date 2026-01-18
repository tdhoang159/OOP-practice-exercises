/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class GiangVienThinhGiang extends GiangVien{
    private String noiCongTacHienTai;

    public GiangVienThinhGiang(String hoTen, String ngaySinh, String hocVi, String ngayBatDauCongTac, String noiCongTacHienTai) {
        super(hoTen, ngaySinh, hocVi, ngayBatDauCongTac);
        this.noiCongTacHienTai = noiCongTacHienTai;
    }
    
    

    public String getNoiCongTacHienTai() {
        return noiCongTacHienTai;
    }

    public void setNoiCongTacHienTai(String noiCongTacHienTai) {
        this.noiCongTacHienTai = noiCongTacHienTai;
    }

    @Override
    public double tinhLuongGiangVien(int soGioLam) {
        double luongGiangVien = soGioLam * CauHinh.LUONG_MOT_GIO;
        super.setLuongGiangVien(luongGiangVien);
        return super.getLuongGiangVien();
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        if(Double.compare(super.getLuongGiangVien(), 0) != 0){
            System.out.printf("%s - %.1f\n", this.noiCongTacHienTai, super.getLuongGiangVien());
        }else{
            System.out.printf("%s\n", this.noiCongTacHienTai);
        }   
    }
    
}
