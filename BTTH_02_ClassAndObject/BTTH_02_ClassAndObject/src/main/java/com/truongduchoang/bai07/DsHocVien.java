package com.truongduchoang.bai07;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */
public class DsHocVien {
    private List<HocVien> ds;
    
    public DsHocVien() {
        this.ds = new ArrayList<>();
    }
    
    public void themHocVien(HocVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void themHocVien(int soHocVien) {
        for(int i = 0; i < soHocVien; i++){
            try(CauHinh.SC){
                System.out.printf("Nhap thong tin cho hoc vien thu %d\n", i+1);
                System.out.print("Nhap ho ten: ");
                String hoTen = CauHinh.SC.nextLine();
                System.out.print("Nhap que quan: ");
                String queQuan = CauHinh.SC.nextLine();
                System.out.print("Nhap ngay sinh: ");
                String ngaySinh = CauHinh.SC.nextLine();
                
                HocVien hv = new HocVien(hoTen, queQuan, ngaySinh);
                this.ds.add(hv);
            }
        }
    }
    
    public void themHocVien(String tenFile) throws FileNotFoundException{
        File file = new File(tenFile);
        if(!file.exists()){
            System.out.println("File khong ton tai " + tenFile);
            return;
        }
        try(Scanner sc = new Scanner(file)){
            while (sc.hasNext()) {
                String hoTen = sc.nextLine().trim();
                String queQuan = sc.nextLine().trim();
                String ngaySinh = sc.nextLine().trim();
                HocVien hv = new HocVien(hoTen, queQuan, ngaySinh);
                this.ds.add(hv);
            }
        }
    }
    
    public void hienThi() {
        System.out.println("---- HIEN THI ----");
        this.ds.forEach(hocVien -> hocVien.hienThi());
    }
    
    public void nhapDiem() {
        this.ds.forEach(hocVien -> {
            System.out.printf("--- Nhap diem cho %s ---\n", hocVien.getHoTen().toUpperCase());
            hocVien.nhapDiem();
        }); 
    }
    
    public HocVien timHocVienTheoMa(int maHV){
        for(HocVien hv : this.ds){
            if(hv.getMaHV() == maHV){
                return hv;
            }
        }
        return null;
    }
    
//    public void nhapDiemChoHocVien(int maHV, double diemMon1, double diemMon2, double diemMon3) {
//        HocVien hv = this.timHocVienTheoMa(maHV);
//        if(hv != null){
//            hv.setDiem(diemMon1, diemMon2, diemMon3);
//        }
//    }
}
