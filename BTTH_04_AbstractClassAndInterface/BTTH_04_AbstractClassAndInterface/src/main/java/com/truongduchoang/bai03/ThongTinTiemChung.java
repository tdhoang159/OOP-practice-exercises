/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

import java.time.LocalDate;

/**
 *
 * @author Truong Duc Hoang
 */
public class ThongTinTiemChung {
    private Vaccine vaccine;
    private LocalDate ngayTiem;
    private String noiTiem;

    public ThongTinTiemChung(Vaccine vaccine, LocalDate ngayTiem, String noiTiem) {
        this.vaccine = vaccine;
        this.ngayTiem = ngayTiem;
        this.noiTiem = noiTiem;
    }
    
    public void hienThi(){
        System.out.printf("%s - %s - %s\n", 
                this.vaccine.getName(), this.ngayTiem.format(CauHinh.FORMMAT_DATE), this.noiTiem);
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    public String getNoiTiem() {
        return noiTiem;
    }

    public void setNoiTiem(String noiTiem) {
        this.noiTiem = noiTiem;
    }   
}
