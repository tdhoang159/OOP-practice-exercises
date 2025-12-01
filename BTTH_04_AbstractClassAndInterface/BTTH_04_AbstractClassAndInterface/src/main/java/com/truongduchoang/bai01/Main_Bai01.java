/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.truongduchoang.bai01;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Main_Bai01 {

    public static void main(String[] args) {
        Hinh h1 = new HinhChuNhat("HCN", 10, 9);
        Hinh h2 = new HinhChuNhat("HCN", 20, 12);
        Hinh h3 = new HinhVuong("HV", 8);
        Hinh h4 = new HinhVuong("HV", 15);
        Hinh h5 = new HinhTamGiac("TG", 4, 2, 3);
        Hinh h6 = new HinhTamGiacCan("TGC", 3, 4);
        Hinh h7 = new HinhTamGiacCan("TGC", 7, 8);
        Hinh h8 = new HinhTamGiacDeu("TGD", 5);
        Hinh h9 = new HinhVuong("HV", 20);
        Hinh h10 = new HinhTamGiac("TG", 5, 6, 7);
        Hinh h11 = new Ellipse("Ellipse", 10, 8);
        Hinh h12 = new HinhTron("HT", 20);

        QLHinh ql = new QLHinh();
        ql.themHinh(h1, h3, h4, h5, h6, h7, h8, h9, h10, h2, h11, h12);
        ql.hienThi();
        //ql.deleteHinhByName("HV");

//        List<Hinh> result = new ArrayList<>();
//        try {
//            result = ql.timHinh("com.truongduchoang.bai01.HinhTamGiac");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main_Bai01.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        result.forEach(h -> System.out.print(h));
        
        
//        ql.hienThi();
//        System.out.println("=========AFTER SORT LIST TANG DAN THEO DIEN TICH===========");
//        ql.sapXepGiamDanByDienTich();
//        ql.hienThi();
        

//          ql.hienThi();
//          System.out.println("=========AFTER SORT LIST TANG DAN THEO TEN NEU KHONG THI GIAM DAN THEO DIEN TICH===========");
//          ql.sapXepTangTheoTenBangThiGiamTheoDienTich();
//          ql.hienThi();
//          
//          System.out.printf("Dien tich trung binh: %.1f", ql.tinhDienTichTrungBinh());

//            int result = ql.timHinh(new HinhChuNhat("HCN", 20, 12));
//            System.out.println(result);
        
    }

}
