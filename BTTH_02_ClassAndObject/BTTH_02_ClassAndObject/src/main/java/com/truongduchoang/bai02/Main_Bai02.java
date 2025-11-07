/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

import com.truongduchoang.bai01.Diem;

/**
 *
 * @author admin
 */
public class Main_Bai02 {
    public static void main(String[] args){
        Diem d1 = new Diem(9, 5);
        Diem d2 = new Diem(-10, 8);
        
        DoanThang dt = new DoanThang(d1, d2);
        dt.hienThi();
        double tinhDoDai = dt.tinhDoDai();
        System.out.printf("Do dai = %.1f\n", tinhDoDai);
        Diem trungDiem = dt.timTrungDiem();
        trungDiem.hienThi();
        
        DoanThang dt1 = new DoanThang(new Diem(0, 1), new Diem(1, 0));
        DoanThang dt2 = new DoanThang(new Diem(0, 2), new Diem(2, 0));
        System.out.println(dt1.isSongSong(dt2));
    }
}
