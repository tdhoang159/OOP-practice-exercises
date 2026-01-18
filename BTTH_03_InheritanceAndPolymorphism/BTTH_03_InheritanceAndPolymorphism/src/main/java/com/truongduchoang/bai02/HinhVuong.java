package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class HinhVuong extends HinhChuNhat{
    private double canh;
    
    public HinhVuong(double _canh){
        super(_canh, _canh);
    }

    @Override
    public String toString() {
        return String.format("Hinh vuong: Dien tich = %.1f - Chu vi = %.1f\n", super.tinhDienTich(), super.tinhChuVi());
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }    
    
}
