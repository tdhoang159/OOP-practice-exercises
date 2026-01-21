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
public class MainBai03 {

    public static void main(String[] args) {
        Vaccine v1 = new Vaccine("Pfizer", "USA", 120);
        Vaccine v2 = new Vaccine("AstraZeneca", "UK", 90);
        Vaccine v3 = new Vaccine("Vero Cell", "China", 150);

        NguoiDan n1 = new NguoiTrongNuoc("012345678901", "Nguyen Van A", "Nam", "0901234567", LocalDate.of(1996, 3, 12));
        NguoiDan n2 = new NguoiTrongNuoc("012345678902", "Tran Thi Binh", "Nu", "0912345678", LocalDate.of(1998, 7, 20));
        NguoiDan n3 = new NguoiTrongNuoc("012345678903", "Le Van Cuong", "Nam", "0923456789", LocalDate.of(1995, 11, 5));

        NguoiDan n4 = new NguoiNuocNgoai("999000001", "John Smith", "Nam", "0934567890", LocalDate.of(1990, 5, 10), "P1234567", "USA");
        NguoiDan n5 = new NguoiNuocNgoai("999000002", "Maria Garcia", "Nu", "0945678901", LocalDate.of(1992, 8, 25), "P2345678", "Spain");
        NguoiDan n6 = new NguoiNuocNgoai("999000003", "David Lee", "Nam", "0956789012", LocalDate.of(1988, 2, 14), "P3456789", "South Korea");
        NguoiDan n7 = new NguoiNuocNgoai("999000004", "Anna Muller", "Nam", "0967890123", LocalDate.of(1994, 12, 30), "P4567890", "Germany");
        
        QLTiemChung ql = new QLTiemChung();
        ql.themVaccine(v1, v2, v3);
        ql.themNguoiDan(n1, n3, n5, n7, n2, n6, n4);
        
        System.out.println("============= HIEN THI VACCINE ==============");
        ql.hienThiVaccine();
        System.out.println("============= HIEN THI NGUOI NUOC NGOAI ===============");
        ql.hienThiNguoiNuocNgoai();
        
    }
}
