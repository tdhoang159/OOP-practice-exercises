package com.truongduchoang.bai05;

/**
 *
 * @author Truong Duc Hoang
 */
public class MainBai05 {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienA(123456789, "Nguyen Van Hoang", "Ha Noi", "Nam");
        NhanVien nv2 = new NhanVienB(223456789, "Tran Thi Bich", "Da Nang", "Nu");
        NhanVien nv3 = new NhanVienC(323456789, "Le Hoang Cuong", "Hue", "Nam");
        NhanVien nv4 = new NhanVienD(423456789, "Pham Thi Dao", "Da Nang", "Nu", 1500000);

//        NhanVien nv5 = new NhanVienA(523456789, "Do Hoang Duc", "Hai Phong", "Nam");
//        NhanVien nv6 = new NhanVienB(623456789, "Vu Thi Hong", "Can Tho", "Nu");
//        NhanVien nv7 = new NhanVienC(723456789, "Bui Quang Khoa", "Da Nang", "Nam");
//        NhanVien nv8 = new NhanVienD(823456789, "Hoang My Linh", "Dong Nai", "Nu", 2000000);
//
//        NhanVien nv9 = new NhanVienA(923456789, "Dang Hoang Long", "Da Nang", "Nam");
//        NhanVien nv10 = new NhanVienB(1023456789L, "Nguyen Hoang Mai", "Nha Trang", "Nu");
        
        QLNhanVien ql = new QLNhanVien();
        
        System.out.println("============= CAU 1 ============");
        //ql.themNhanVien(nv1, nv2, nv3, nv4, nv5, nv6, nv7, nv8, nv9, nv10);
        ql.themNhanVien(nv1, nv2, nv3, nv4);
        
        System.out.println("============= CAU 4 ============");
        ql.hienThi();
        
        System.out.println("============= CAU 3 TRA CUU THEO QUE QUAN ============");
        ql.traCuuNhanVienTheoQueQuan("Da Nang").forEach(nv -> nv.hienThi());
        
        System.out.println("============= CAU 3 TRA CUU THEO TEN ============");
        ql.traCuuNhanVienTheoTen("Hoang").forEach(nv -> nv.hienThi());
        
        System.out.println("============= CAU 3 TRA CUU THEO CMND ============");
        ql.traCuuNhanVienTheoCMND(423456789).hienThi();
        
        System.out.println("============= CAU 5 ============");
        ql.tinhLuongNhanVien();
        
//        System.out.println("============= CAU 2 =============");
//        ql.xoaNhanVien(5);
//        ql.hienThi();
        
        
        
        
    }

}
