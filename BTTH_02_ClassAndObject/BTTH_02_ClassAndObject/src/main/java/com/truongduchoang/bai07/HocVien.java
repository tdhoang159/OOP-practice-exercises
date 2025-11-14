package com.truongduchoang.bai07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Truong Duc Hoang
 */
public class HocVien {
    private int maHV;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;
    private static int dem = 0;
    private boolean isNhapDiem = false;
    
    {
        ++dem;
        this.maHV = dem;
    }
    
    public HocVien(String hoTen, String queQuan, LocalDate ngaySinh){
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }
    
    public int getMaHV() {
        return maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setDiem(double diemMon1, double diemMon2, double diemMon3) {
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.isNhapDiem = true;
    }
    
    public double getDiemTrungBinh() {
        return (this.diemMon1 + this.diemMon2 + this.diemMon3) / 3.0;
    }
    
    public boolean isHocVienTot() {
        return this.diemMon1 >= 5.0 && this.diemMon2 >= 5.0 && this.diemMon3 >= 5.0 && this.getDiemTrungBinh() >= 8.0;
    }
    
    public int tinhTuoi() {
        return LocalDate.now().getYear() - ngaySinh.getYear();
    }
    
    public String hienThi() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngay = this.ngaySinh.format(fmt);
        if (isNhapDiem)
            return String.format("%d - %s - %s - %s - Diem mon 1: %.1f, Diem mon 2: %.1f, Diem mon 3: %.1f\n", 
                this.maHV, this.hoTen, this.queQuan, ngay, this.diemMon1, this.diemMon2, this.diemMon3);
        else
            return String.format("%d - %s - %s - %s\n", maHV, hoTen, queQuan, ngay);
    }
    
    public String toStringHocBong() {
        return String.format("%d - %s - %.2f", maHV, hoTen, getDiemTrungBinh());
    }
}
