package com.truongduchoang.bai07;

import java.time.LocalDate;

/**
 *
 * @author Truong Duc Hoang
 */
public class HocVien {
    private int maHV;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;
    private double[] diem;
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
    
    public HocVien(String hoTen, String queQuan, String ngaySinh){
        this(hoTen, queQuan, LocalDate.parse(ngaySinh, CauHinh.FORMATTER));
    }
    
    public void hienThi(){
        System.out.printf("Id: %d - Ho va ten: %s - Que quan: %s  - Ngay sinh: %s\n", 
                this.maHV, this.hoTen, this.queQuan, this.ngaySinh.format(CauHinh.FORMATTER));
        
        if(this.diem != null){
            for(int i = 0; i < CauHinh.SO_MON; i++){
                System.out.printf("Diem mon %d: %.1f\n", i + 1, this.diem[i]);
            }
            System.out.println("");
        }
    }
    
    public void nhapDiem() {
        this.diem = new double[CauHinh.SO_MON];
        for(int i = 0; i < CauHinh.SO_MON; i++){
            System.out.printf("Nhap diem mon thu %d = ", i + 1);
            this.diem[i] = CauHinh.SC.nextDouble();
        }
    }
    
    public int getMaHV() {
        return this.maHV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getQueQuan() {
        return this.queQuan;
    }

    public LocalDate getNgaySinh() {
        return this.ngaySinh;
    }

//    public void setDiem(double diemMon1, double diemMon2, double diemMon3) {
//        this.diemMon1 = diemMon1;
//        this.diemMon2 = diemMon2;
//        this.diemMon3 = diemMon3;
//        this.isNhapDiem = true;
//    }
//    
//    public double getDiemTrungBinh() {
//        return (this.diemMon1 + this.diemMon2 + this.diemMon3) / 3.0;
//    }
//    
//    public boolean isHocVienTot() {
//        return this.diemMon1 >= 5.0 && this.diemMon2 >= 5.0 && this.diemMon3 >= 5.0 && this.getDiemTrungBinh() >= 8.0;
//    }
//    
//    public int tinhTuoi() {
//        return LocalDate.now().getYear() - ngaySinh.getYear();
//    }
//    
//    public String hienThi() {
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String ngay = this.ngaySinh.format(fmt);
//        if (isNhapDiem)
//            return String.format("%d - %s - %s - %s - Diem mon 1: %.1f, Diem mon 2: %.1f, Diem mon 3: %.1f\n", 
//                this.maHV, this.hoTen, this.queQuan, ngay, this.diemMon1, this.diemMon2, this.diemMon3);
//        else
//            return String.format("%d - %s - %s - %s\n", maHV, hoTen, queQuan, ngay);
//    }
//    
//    public String toStringHocBong() {
//        return String.format("%d - %s - %.2f", maHV, hoTen, getDiemTrungBinh());
//    }
}
