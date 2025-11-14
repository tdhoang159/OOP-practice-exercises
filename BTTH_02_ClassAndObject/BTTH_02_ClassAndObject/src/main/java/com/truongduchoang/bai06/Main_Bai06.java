/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai06;

import com.truongduchoang.bai05.PhanSo;

/**
 *
 * @author admin
 */
public class Main_Bai06 {

    public static void main(String[] args) throws Exception {
//        PhanSo p1 = new PhanSo(1, 2);
//        PhanSo p2 = new PhanSo(3, 4);
//        PhanSo p3 = new PhanSo(12, 2);
//        PhanSo p4 = new PhanSo(5, 8);
//        PhanSo p5 = new PhanSo(21, 32);
//        PhanSo p6 = new PhanSo(15, 16);
//        PhanSo p7 = new PhanSo(5, 2);
//        PhanSo p8 = new PhanSo(1, 6);
//        
//        DsPhanSo ql = new DsPhanSo();
//        
//        ql.themPhanSo(p1);
//        ql.themPhanSo(p2, p3, p4, p5, p6, p7, p8);
//        ql.themPhanSo(7, 10);
//        
//        ql.hienThi();
//        System.out.println("==============");
//        ql.tongCacPhanSo().hienThi();
//        ql.timMax().hienThi();
//        ql.timMin().hienThi();
//        ql.xoaPhanSo(p3);
//        ql.hienThi();
//        System.out.println("===============");
//        
//        ql.xoaPhanSo(5, 2);
//        ql.hienThi();
//        System.out.println("================");

        DsPhanSo ds = new DsPhanSo();

        ds.themPhanSo(1, 3);
        ds.themPhanSo(3, 4);
        ds.themPhanSo(1, 2);
        ds.themPhanSo(2, 5);

        System.out.println("== Danh sach ban dau ==");
        ds.hienThi();

        ds.sapXepGiamDan();
        System.out.println("\n== Danh sach sau khi sap xep giam dan ==");
        ds.hienThi();
    }
}
