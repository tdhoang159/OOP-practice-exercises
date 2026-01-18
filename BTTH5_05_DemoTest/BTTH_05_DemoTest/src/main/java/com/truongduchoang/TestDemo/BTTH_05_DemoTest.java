package com.truongduchoang.TestDemo;

/**
 *
 * @author Truong Duc Hoang
 */
public class BTTH_05_DemoTest {
    public static void main(String[] args) {
        NhanVat n1 = new NhanVat("Hoang");
        NhanVat n2 = new NhanVat("Hung");
        NhanVat n3 = new NhanVat("Quynh");
        
        QLNhanVat ql = new QLNhanVat();
        
        System.out.println("-------------- Cau a) --------------");
        ql.themNhanVat(n1, n2, n3);
        ql.hienThi();
        
        System.out.println("------------- Cau b) ---------------");
        VatPham v1 = new VatPhamTangLuotChoi(1);
        VatPham v2 = new VatPhamTangLuotChoi(2);
        VatPham v3 = new VatPhamTangLuotChoi(3);
        VatPham v4 = new VatPhamTangMau(20);
        n1.themVatPham(v1, v3);
        n2.themVatPham(v2, v4);
        n3.themVatPham(v2, v1, v3);
        System.out.println("Nhan vat n1, n2, n3 da an vat pham!");
        
        System.out.println("------------- Cau c) ---------------");
        ql.hienThi();
        
        System.out.println("------------- Cau d) ---------------");
        int result = ql.tinhTongLuotChoi(3);
        System.out.println(result);
        
        System.out.println("------------- Cau e) ---------------");
        ql.sapXep();
        ql.hienThi();

    }
}
