/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

import com.truongduchoang.bai01.Diem;

/**
 *
 * @author admin
 */
public class Main_Bai03 {
    public static void main(String[] args) throws Exception {
        HinhChuNhat hcn = new HinhChuNhat(new Diem(1, 5), new Diem(7, 2));
        hcn.hienThi();
    }
}
