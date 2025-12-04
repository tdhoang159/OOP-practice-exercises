package com.truongduchoang.bai03;

/**
 *
 * @author Truong Duc Hoang
 */
public class BangDia extends SanPham{
    private double doDaiThoiGianPhat;
    
    public BangDia(String tenSP, String nhaSanXuat, double giaBan, double doDaiThoiGianPhat){
        super(tenSP, nhaSanXuat, giaBan);
        this.doDaiThoiGianPhat = doDaiThoiGianPhat;
    }
    
    @Override
    public String toString() {
        return String.format("%s - %.1f phut", super.toString(), this.doDaiThoiGianPhat);
    }

    public double getDoDaiThoiGianPhat() {
        return doDaiThoiGianPhat;
    }

    public void setDoDaiThoiGianPhat(double doDaiThoiGianPhat) {
        this.doDaiThoiGianPhat = doDaiThoiGianPhat;
    }
    
}
