/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Truong Duc Hoang
 */
public class QLGiangVien {
    public List<GiangVien> ds;
    
    public QLGiangVien(){
        this.ds = new ArrayList<>();
    }
    
    public void themGiangVien(GiangVien... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    
    public boolean xoaGiangVien(String tenGiangVien){
        return this.ds.removeIf(gv -> gv.getHoTen().equalsIgnoreCase(tenGiangVien));
    }
    
    public GiangVien traCuuGiangVienTheoTen(String tenGiangVien){
        return this.ds.stream().filter(gv -> gv.getHoTen().equalsIgnoreCase(tenGiangVien)).findFirst().get();
    }
    
    public List<GiangVien> traCuuGiangVienTheoHocVi(String hocVi){
        return this.ds.stream().filter(gv -> gv.getHocVi().equalsIgnoreCase(hocVi)).collect(Collectors.toList());
    }
    
    public List<GiangVien> traCuuGiangVienTheoLoaiGiangVien(String loaiGiangVien) throws ClassNotFoundException{
        Class c = Class.forName(loaiGiangVien);
        return this.ds.stream().filter(gv -> c.isInstance(gv)).collect(Collectors.toList());
    }
    
    public void tinhLuongGiangVien(){
        for(GiangVien gv : this.ds){
            System.out.printf("Nhap so gio lam viec cho giang vien %s: ", gv.getHoTen());
            int soGioLam = CauHinh.SC.nextInt();
            gv.tinhLuongGiangVien(soGioLam);
        }
        
        this.ds.sort(Comparator.comparing(GiangVien::getLuongGiangVien, Collections.reverseOrder()));
        this.ds.forEach(gv -> gv.hienThi());
    }
    
    public void hienThi(){
        this.ds.forEach(gv -> gv.hienThi());
    }
}
