package com.truongduchoang.bai05;

/**
 *
 * @author Truong Duc Hoang
 */
public class NhanVienD extends NhanVien{
    private double tienTroCap;
    public NhanVienD(long CMND, String name, String queQuan, String gioiTinh, double tienTroCap){
        super(CMND, name, queQuan, gioiTinh);
        this.tienTroCap = tienTroCap;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return this.tienTroCap + (this.luongCoBan *soNgayCong);
    }
    
    @Override
    public void hienThi(){
        System.out.printf("Nhan vien bo phan D: ");
        super.hienThi();
        System.out.printf("Tien tro cap cua %s la: %.1f\n", super.getName(), this.tienTroCap);
    }

    public double getTienTroCap() {
        return this.tienTroCap;
    }

    public void setTienTroCap(double tienTroCap) {
        this.tienTroCap = tienTroCap;
    }
}
