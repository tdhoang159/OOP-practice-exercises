/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai02;

import com.truongduchoang.bai01.Diem;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem diemDau;
    private Diem diemCuoi;
    
    public DoanThang(Diem diemDau, Diem diemCuoi){
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }
    
    public void hienThi() {
        System.out.printf("[(%.1f, %.1f), (%.1f, %.1f)]\n", 
                this.diemDau.getHoanhDo(), this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo());
    }
    
    public double tinhDoDai() {
        return this.diemDau.tinhKhoangCach(this.diemCuoi);
    }
    
    public Diem timTrungDiem() {
        double x = (double)(this.diemDau.getHoanhDo() + this.diemCuoi.getHoanhDo())/2;
        double y = (double)(this.diemDau.getTungDo() + this.diemCuoi.getTungDo())/2;
        Diem d1 = new Diem(x, y);
        return d1;
    }
    
    public boolean isSongSong(DoanThang dt2){
        double ve1 = (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) * (dt2.diemDau.getTungDo() - dt2.diemCuoi.getTungDo());
        double ve2 = (this.diemDau.getTungDo() - this.diemCuoi.getTungDo()) * (dt2.diemDau.getHoanhDo() - dt2.diemCuoi.getHoanhDo());
        
        return Double.compare(ve1, ve2) == 0;
    }
    
    public Diem getDiemDau(){
        return this.diemDau;
    }
    
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }
    
    public Diem getDiemCuoi() {
        return this.diemCuoi;
    }
    
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
    
}
