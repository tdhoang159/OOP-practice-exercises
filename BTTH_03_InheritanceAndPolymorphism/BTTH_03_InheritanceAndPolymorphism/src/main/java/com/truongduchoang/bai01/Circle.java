package com.truongduchoang.bai01;

/**
 *
 * @author Truong Duc Hoang
 */
public class Circle extends Ellipse{
    private double banKinh;
    
    public Circle(double _banKinh){
        super(_banKinh, _banKinh);
    }

    public double getBanKinh() {
        return banKinh;
    }
    
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return String.format("Hinh Circle\nDien tich: %.1f\nChu vi: %.1f\n", super.tinhDienTich(), super.tinhChuVi());
    }   
}
