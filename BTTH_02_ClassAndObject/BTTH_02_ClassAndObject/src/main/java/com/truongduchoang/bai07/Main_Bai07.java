package com.truongduchoang.bai07;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */
public class Main_Bai07 {

    public static void main(String[] args) throws FileNotFoundException {
        HocVien h1 = new HocVien("Truong Duc Hoang", "TP.HCM", "15/09/2004");
        HocVien h2 = new HocVien("Tran Que Moc", "Ben Tre", "24/04/2003");
        HocVien h3 = new HocVien("Ly Minh Nhat", "Quang Ngai", LocalDate.of(2005, Month.JUNE, 7));
        
        DsHocVien ds = new DsHocVien();
//        ds.themHocVien(1);
        ds.themHocVien(h1,h2, h3);
        //ds.themHocVien("src/main/resources/data.txt");
//        ds.hienThi();
 
        System.out.println("----- NHAP DIEM ----");
        ds.nhapDiem();
//        ds.hienThi();
//        System.out.println("----- DS HOC VIEN NHAN HOC BONG ----");
//        ds.timKiem().forEach(hv -> hv.hienThi());
        ds.sapXep1();
        ds.hienThi();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        DsHocVien ds = new DsHocVien();
//        try (Scanner sc = new Scanner(System.in)) {
//            sc.useLocale(Locale.US);
//            int choice;
//            do {
//                System.out.println("\n===== MENU TRUNG TAM GIA SU =====");
//                System.out.println("1. Doc danh sach hoc vien tu file");
//                System.out.println("2. Hien thi danh sach hoc vien");
//                System.out.println("3. Nhap diem cho hoc vien");
//                System.out.println("0. Thoat");
//                System.out.print("Chon: ");
//                choice = sc.nextInt();
//                switch (choice) {
//                    case 1 ->
//                        ds.docTuFile("src/main/resources/data.txt");
//                    case 2 ->
//                        ds.hienThi();
//                    case 3 -> {
//                        System.out.print("Nhap ma hoc vien: ");
//                        int maHV = sc.nextInt();
//                        System.out.print("Diem mon 1: ");
//                        double diemMon1 = sc.nextDouble();
//                        System.out.print("Diem mon 2: ");
//                        double diemMon2 = sc.nextDouble();
//                        System.out.print("Diem mon 3: ");
//                        double diemMon3 = sc.nextDouble();
//                        ds.nhapDiemChoHocVien(maHV, diemMon1, diemMon2, diemMon3);
//                    }
//                }
//            } while (choice != 0);
//        }
    }
}
