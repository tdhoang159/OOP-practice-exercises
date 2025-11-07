/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai04;

import com.truongduchoang.bai01.Diem;

/**
 *
 * @author admin
 */
public class Main_Bai04 {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron(new Diem(0, 0), 2);
        HinhTron h2 = new HinhTron(new Diem(3, 4), 5);
        System.out.printf("Dien tich = %.1f\n", h1.tinhDienTich());
        System.out.printf("Chu vi = %.1f\n", h1.tinhChuVi());
        System.out.printf("VTTD giua 2 hinh tron: %d", h1.vttdVoiHinhTron(h2));
    }
}
