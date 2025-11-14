package com.truongduchoang.bai07;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
    
    public void docTuFile(String tenFile) throws FileNotFoundException{
        File file = new File(tenFile);
        if(!file.exists()){
            System.out.println("File khong ton tai " + tenFile);
            return;
        }
        
        this.ds.clear();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try(Scanner sc = new Scanner(file)){
            while (sc.hasNextLine()) {
                String hoTen = sc.nextLine().trim();
                String queQuan = sc.nextLine().trim();
                String ngaySinhStr = sc.nextLine().trim();
                LocalDate ngaySinh = LocalDate.parse(ngaySinhStr, fmt);
                HocVien hv = new HocVien(hoTen, queQuan, ngaySinh);
                ds.add(hv);
            }
        }
        System.out.println("Da doc " + this.ds.size() + " hoc vien tu file " + tenFile);
    }
    
   
    public void hienThi() {
        this.ds.forEach(hv -> System.out.println(hv.hienThi()));
    }
    
    public HocVien timHocVienTheoMa(int maHV){
        for(HocVien hv : this.ds){
            if(hv.getMaHV() == maHV){
                return hv;
            }
        }
        return null;
    }
    
    public void nhapDiemChoHocVien(int maHV, double diemMon1, double diemMon2, double diemMon3) {
        HocVien hv = this.timHocVienTheoMa(maHV);
        if(hv != null){
            hv.setDiem(diemMon1, diemMon2, diemMon3);
        }
    }
}
