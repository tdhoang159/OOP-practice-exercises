/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

import java.time.LocalDate;

/**
 *
 * @author Truong Duc Hoang
 */
public class NguoiNuocNgoai extends NguoiDan{
    private String soHoChieu;
    private String quocTich;

    public NguoiNuocNgoai(String CCCD, String hoTen, String gioiTinh, String soDienThoai, LocalDate ngaySinh, String soHoChieu, String quocTich) {
        super(CCCD, hoTen, gioiTinh, soDienThoai, ngaySinh);
        this.soHoChieu = soHoChieu;
        this.quocTich = quocTich;
    }

    public NguoiNuocNgoai(String CCCD, String hoTen, String gioiTinh, String soDienThoai, String ngaySinh, String soHoChieu, String quocTich) {
        super(CCCD, hoTen, gioiTinh, soDienThoai, ngaySinh);
        this.soHoChieu = soHoChieu;
        this.quocTich = quocTich;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        if(super.getDsTiemChung() == null){
            System.out.printf("- So ho chieu: %s - Quoc tich: %s - Chua tiem mui nao\n", this.soHoChieu, this.quocTich);
        }else{
            System.out.printf("- So ho chieu: %s - Quoc tich: %s\n", this.soHoChieu, this.quocTich);
            for(int i = 0; i < super.getDsTiemChung().size(); i++){
                System.out.printf("Mui %d: ", i);
                super.getDsTiemChung().get(i).hienThi();
            }
        }
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    
}
