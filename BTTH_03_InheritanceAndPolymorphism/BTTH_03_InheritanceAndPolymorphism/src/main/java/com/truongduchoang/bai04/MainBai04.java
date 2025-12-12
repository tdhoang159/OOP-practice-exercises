/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.truongduchoang.bai04;

/**
 *
 * @author admin
 */
public class MainBai04 {
    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoanKhongKyHan("Truong Duc Hoang", 5000000);
        TaiKhoan t2 = new TaiKhoanCoKyHan("Hoang Van Hung", 10000000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TaiKhoanCoKyHan("Le Minh Hung", 12000000, KyHan.MOT_THANG);
        TaiKhoan t4 = new TaiKhoanCoKyHan("Duong Ngoc Khanh", 17000000, KyHan.MOT_NAM);
        
        QLTaiKhoan ql = new QLTaiKhoan();
        t1.nopTien(1000000);
        t2.nopTien(2000000);
        t3.rutTien(3000000);
        t4.rutTien(4000000);
        ql.themTaiKhoan(t1, t2, t3, t4);
        ql.hienThi();
    }
    
}
