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
public class NguoiTrongNuoc extends NguoiDan {

    public NguoiTrongNuoc(String CCCD, String hoTen, String gioiTinh, String soDienThoai, LocalDate ngaySinh) {
        super(CCCD, hoTen, gioiTinh, soDienThoai, ngaySinh);
    }

    public NguoiTrongNuoc(String CCCD, String hoTen, String gioiTinh, String soDienThoai, String ngaySinh) {
        super(CCCD, hoTen, gioiTinh, soDienThoai, ngaySinh);
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        if(super.getDsTiemChung() == null){
            System.out.printf("- Chua tiem mui nao\n");
        }else{
            System.out.println();
            for(int i = 0; i < super.getDsTiemChung().size(); i++){
                System.out.printf("Mui %d: ", i);
                super.getDsTiemChung().get(i).hienThi();
            }
        }
    }

}
