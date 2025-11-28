/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.truongduchoang.bai01;

/**
 *
 * @author admin
 */
public class Main_Bai01 {

    public static void main(String[] args) throws ClassNotFoundException {
       Hinh h1 = new HinhChuNhat("HCN1", 10, 9);
       Hinh h2 = new HinhChuNhat("HCN2", 20, 12);
       Hinh h3 = new HinhVuong("HV1", 8);
       Hinh h4 = new HinhVuong("HV2", 15);
       Hinh h5 = new HinhTamGiac("TG1", 1, 2, 3);
       Hinh h6 = new HinhTamGiacCan("TGC1", 3, 4);
       Hinh h7 = new HinhTamGiacCan("TGC2", 7, 8);
       Hinh h8 = new HinhTamGiacDeu("TGD1", 5);
       Hinh h9 = new HinhVuong("HV3", 20);
       Hinh h10 = new HinhTamGiac("TG2", 5, 6, 7);
       
       QLHinh ql = new QLHinh();
       ql.themHinh(h1, h2, h3, h4, h5, h6, h7, h8, h9, h10);
       ql.deleteHinhByName("HV");
       
       ql.hienThi();
    }
    
}
