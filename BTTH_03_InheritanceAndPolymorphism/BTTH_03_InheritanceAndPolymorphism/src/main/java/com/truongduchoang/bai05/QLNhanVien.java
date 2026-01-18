package com.truongduchoang.bai05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */
public class QLNhanVien {

    public List<NhanVien> ds;

    public QLNhanVien() {
        this.ds = new ArrayList<>();
    }

    public void themNhanVien(NhanVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void xoaNhanVien(int id) {
        this.ds.removeIf(nv -> nv.getId() == id);
    }

    public List<NhanVien> traCuuNhanVienTheoQueQuan(String queQuan) {
        return this.ds.stream().filter(nv -> nv.getQueQuan().contains(queQuan)).toList();
    }

    public List<NhanVien> traCuuNhanVienTheoTen(String name) {
        return this.ds.stream().filter(nv -> nv.getName().contains(name)).toList();
    }
    
    public NhanVien traCuuNhanVienTheoCMND(long CMND){
        return this.ds.stream().filter(nv -> nv.getCMND() == CMND).findFirst().get();
    }
    
    public void tinhLuongNhanVien(){
        Scanner sc = new Scanner(System.in);
        for(NhanVien nv : this.ds){
            System.out.printf("Nhap so ngay cong cho %s: ", nv.getName());
            int soNgayCong = sc.nextInt();
            nv.hienThi();
            System.out.printf("Luong cua %s la: %.1f\n", nv.getName(), nv.tinhLuong(soNgayCong));
        }
    }

    public void hienThi() {
        this.ds.forEach(nv -> nv.hienThi());
    }

}
