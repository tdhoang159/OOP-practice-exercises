/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author admin
 */
public class TaiKhoanCoKyHan extends TaiKhoan {

    private LocalDate ngayDaoHan;
    private KyHan kyHan;

    public TaiKhoanCoKyHan(String tenTK, double soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
        //this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
        this.ngayDaoHan = LocalDate.now();

//        switch (kyHan) {
//            case MOT_TUAN ->
//                this.ngayDaoHan = this.ngayDaoHan.plusWeeks(7);
//            case MOT_THANG ->
//                this.ngayDaoHan = this.ngayDaoHan.plusMonths(1);
//            case MOT_NAM ->
//                this.ngayDaoHan = this.ngayDaoHan.plusYears(1);
//        }
    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.equals(LocalDate.now());
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han: %s - Ngay dao han: %s\n",
                this.kyHan, this.ngayDaoHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }
}
