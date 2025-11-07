/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

/**
 *
 * @author admin
 */
public class Main_Bai01 {
    public static void main(String[] args) {
        Diem d1 = new Diem(9, 5);
        Diem d2 = new Diem(-10, 8);
        
        d1.hienThi();
        d2.hienThi();
        double result_khoangCach = d1.tinhKhoangCach(d2);
        System.out.printf("Khoang cach = %.1f\n", result_khoangCach);
    }
}
