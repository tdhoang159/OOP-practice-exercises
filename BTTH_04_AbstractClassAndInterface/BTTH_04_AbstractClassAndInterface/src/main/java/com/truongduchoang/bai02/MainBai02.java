/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class MainBai02 {
    public static void main(String[] args) {
        GiangVien gv1= new GiangVienCoHuu("Duong Huu Thanh", "15/09/2001", "Thac Si", "10/01/2010", 2500000, 1.8);
        GiangVien gv2= new GiangVienCoHuu("Nguyen Van Bay", "20/10/2002", "Tien Si", "11/02/2011", 2500000, 1.8);
        GiangVien gv3 = new GiangVienThinhGiang("Ho Huong Thien", "25/11/2003", "Thac Si", "12/03/2012", "Truong Dai hoc Mo TP.HCM");
        GiangVien gv4 = new GiangVienThinhGiang("Phan Tran Minh Khue", "30/12/2004", "Tien Si", "13/04/2013", "Truong Dai hoc Bach Khoa");
        
        QLGiangVien ql = new QLGiangVien();
        ql.themGiangVien(gv1, gv2, gv3, gv4);
        ql.hienThi();
        
        System.out.println("============= TRA CUU GIANG VIEN THEO TEN ===============");
        ql.traCuuGiangVienTheoTen("nguyen van bay").hienThi(); 
        
        System.out.println("============= TRA CUU GIANG VIEN THEO HOC VI ===============");
        ql.traCuuGiangVienTheoHocVi("thac si").forEach(gv -> gv.hienThi());
        
        System.out.println("============= TRA CUU GIANG VIEN THEO LOAI GIANG VIEN ===============");
        try {
            ql.traCuuGiangVienTheoLoaiGiangVien("com.truongduchoang.bai02.GiangVienCoHuu").forEach(gv -> gv.hienThi());
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi! Tim Khong Thay!");
        }
        System.out.println("===== DANH SACH GIAM DAN THEO LUONG =====");
        ql.tinhLuongGiangVien();
        
        System.out.println("============= XOA GIANG VIEN ===============");
        ql.xoaGiangVien("ho huong thien");
        ql.hienThi();
        
        System.out.println(gv2.getClass().getSimpleName());
        System.out.println(GiangVien.class.getPackageName());
        
    }
}
