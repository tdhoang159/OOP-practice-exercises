package com.truongduchoang.bai03;

/**
 *
 * @author Truong Duc Hoang
 */
public class Main_Bai03 {
    public static void main(String[] args) {
        SanPham p1 = new Sach("S1", "NXB Kim Dong", 15000, 30);
        SanPham p2 = new Sach("S2", "NXB Tre", 32000, 47);
        SanPham p3 = new BangDia("BD1", "Thay Thanh", 53000, 32.6);
        SanPham p4 = new BangDia("BD2", "Thay Hau", 78000, 15.64);
        
        QLSanPham ql = new QLSanPham();
        ql.themSanPham(p1);
        ql.themSanPham(p2, p3, p4);
        ql.hienThi();
        System.out.println("====== SAU KHI XOA SP ======");
        ql.xoaSanPham(p3);
        ql.xoaSanPham(4);
        ql.hienThi();
    }
    
}
