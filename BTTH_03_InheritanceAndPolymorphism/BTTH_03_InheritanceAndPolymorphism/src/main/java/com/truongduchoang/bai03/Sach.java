package com.truongduchoang.bai03;

/**
 *
 * @author Truong Duc Hoang
 */
public class Sach extends SanPham{
    private int soTrang;
    
    public Sach(String tenSP, String nhaSanXuat, double giaBan, int soTrang){
        super(tenSP, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format("%s - %d trang", super.toString(), this.soTrang);
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }    
}
