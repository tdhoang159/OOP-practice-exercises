package com.truongduchoang.bai07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
    
    public HocVien timKiem(int maHV) {
//        for(HocVien hv : this.ds){
//            if(hv.getMaHV() == maHV){
//                return hv;
//            }
//        }
//        return null;

        return this.ds.stream().filter(hv -> hv.getMaHV() == maHV).findFirst().get();
    }
    
    public List<HocVien> timKiem(String kw) {
//        List<HocVien> result = new ArrayList<>();
//        for(HocVien hv : this.ds){
//            if(hv.getHoTen().trim().toLowerCase().contains(kw.trim().toLowerCase())){
//                result.add(hv);
//            }
//        }
//        return result;

        return this.ds.stream().filter(hv -> hv.getHoTen().trim().toLowerCase().contains(kw.trim().toLowerCase())).collect(Collectors.toList());
    }
    
    public List<HocVien> timKiem() {
//        List<HocVien> result = new ArrayList<>();
//        for(HocVien hv : this.ds) {
//            if(hv.isHocBong() == true){
//                result.add(hv);
//            }
//        }
//        return result;

        return this.ds.stream().filter(hv -> hv.isHocBong() == true).collect(Collectors.toList());
    }
    
    public void sapXep1() {
        //Sắp xếp tăng dần
        this.ds.sort((hv1, hv2) -> Double.compare(hv1.tinhDiemTrungBinh(), hv2.tinhDiemTrungBinh()));
        
        //Sắp xếp giảm dần
        //this.ds.sort((hv1, hv2) -> -Double.compare(hv1.tinhDiemTrungBinh(), hv2.tinhDiemTrungBinh()));
    }
    
    public void sapXep2() {
        
        //Sắp xếp tăng dần
        this.ds.sort(Comparator.comparing(HocVien::tinhDiemTrungBinh));
        
        // Sắp xếp giảm dần
        //this.ds.sort(Comparator.comparing(HocVien::tinhDiemTrungBinh, Collections.reverseOrder()));
    }
    
    //Sắp xếp danh sách học viên tăng theo tháng sinh, nếu cùng tháng sinh thì giảm theo tên
    public void sapXep3() {
        this.ds.sort((hv1, hv2) -> {
            int m1 = hv1.getNgaySinh().getMonthValue();
            int m2 = hv2.getNgaySinh().getMonthValue();
            
            if(m1 == m2){
                return -hv1.getHoTen().compareTo(hv2.getHoTen());
            }
            
            return m1 - m2;
        });
    }
}
