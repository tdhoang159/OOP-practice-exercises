/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai05;

/**
 *
 * @author admin
 */
public class Main_Bai05 {

    public static void main(String[] args) throws Exception {
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, 4);
        PhanSo p3 = new PhanSo(12, 2);
        PhanSo p4 = new PhanSo(5, 8);
        PhanSo p5 = new PhanSo(21, 32);
        PhanSo p6 = new PhanSo(15, 16);
        PhanSo p7 = new PhanSo(5, 2);
        PhanSo p8 = new PhanSo(1, 6);

        PhanSo[] ps = {p1, p2, p3, p4, p5, p6, p7, p8};

//Duyệt và hiển thị các phân số trong mảng.
        for (PhanSo p : ps) {
            p.hienThi();
        }

//Tính tổng các phân số trong mảng.
        PhanSo tong = new PhanSo();
        for (PhanSo p : ps) {
            tong = tong.cong(p);
        }
        System.out.print("Tong cac phan so trong mang: ");
        tong.hienThi();

//Tìm phân số lớn nhất trong mảng.
        PhanSo maxPS = p1;
        for (PhanSo p : ps) {
            if (p.soSanh(maxPS) == 1) {
                maxPS = p;
            }
        }
        System.out.print("Phan so lon nhat trong mang: ");
        maxPS.hienThi();
    }
}
