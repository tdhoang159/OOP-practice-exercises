package com.truongduchoang.bai03;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Truong Duc Hoang
 */
public class Main_Bai03 {
    public static void main(String[] args) {
        SanPham p1 = new Sach("S1", "NXB Kim Dong", 15000, "15/09/2004", 30);
        SanPham p2 = new Sach("S2", "NXB Tre", 32000, "20/10/2003", 47);
        SanPham p3 = new BangDia("BD1", "Thay Thanh", 53000, "23/07/2002", 32.6);
        SanPham p4 = new BangDia("BD2", "Thay Hau", 78000, "20/10/2003", 15.64);
        
        QLSanPham ql = new QLSanPham();
        
        System.out.println("===== THEM SAN PHAM + HIEN THI =====");
        ql.themSanPham(p1);
        ql.themSanPham(p2, p3, p4);
        ql.hienThi();
        
        System.out.println("====== XOA SAN PHAM + HIEN THI ======");
        ql.xoaSanPham(p3);
        ql.xoaSanPham(4);
        ql.hienThi();
        
        ql.themSanPham(p3, p4);

          System.out.println("===== TIM KIEM THEO TEN SAN PHAM =====");
          ql.timKiemSanPham("BD1").forEach(p -> System.out.println(p));
          System.out.println("===== TIM KIEM THEO NGAY PHAT HANH =====");
          ql.timKiemSanPham(LocalDate.of(2003, Month.OCTOBER, 20)).forEach(p -> System.out.println(p));
          System.out.println("===== TIM KIEM THEO LOAI SAN PHAM =====");
          ql.timKiemSanPham("com.truongduchoang.bai03.BangDia").forEach(p -> System.out.println(p));
          System.out.println("===== TIM KIEM THEO TEN SAN PHAM =====");
          ql.timKiemSanPham("BD2").forEach(p -> System.out.println(p));
          System.out.println("===== TIM KIEM THEO KHOANG GIA SAN PHAM =====");
          ql.timKiemSanPham(30000, 60000).forEach(p -> System.out.println(p));
          System.out.println("===== CAP NHAT THONG TIN SAN PHAM =====");
          ql.capNhatThongTinSanPham(1, "Tr D Hoang", "New S1", 40000.0, "30/04/1975",null,null);
          ql.hienThi();
          System.out.println("===== CAP NHAT THONG TIN SACH =====");
          ql.capNhatThongTinSanPham(2, "L M Hung", "New S2", 20000.0, "02/09/1945",1000,null);
          ql.hienThi();
          System.out.println("===== CAP NHAT THONG TIN BANG DIA =====");
          ql.capNhatThongTinSanPham(3, "D H Thanh", "New BD3", 30000.0, "15/10/1980",null,40.8);
          ql.hienThi();
          System.out.println("===== SAP XEP SAN PHAM GIAM DAN THEO GIA BAN =====");
          ql.sapXepGiamDanTheoGia();
          ql.hienThi();
          
    }
    
}
