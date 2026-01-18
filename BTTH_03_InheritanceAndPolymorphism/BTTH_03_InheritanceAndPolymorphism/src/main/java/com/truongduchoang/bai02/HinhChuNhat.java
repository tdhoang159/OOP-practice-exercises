package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    
    public HinhChuNhat(double _chieuDai, double _chieuRong){
        this.chieuDai = _chieuDai;
        this.chieuRong = _chieuRong;
    }
    
    public double tinhChuVi(){
        return (this.getChieuDai()+this.getChieuRong())*2;
    }
    
    public double tinhDienTich(){
        return this.getChieuDai()*this.getChieuRong();
    }

    @Override
    public String toString() {
        return String.format("Hinh chu nhat: Dien tich = %.1f - Chu vi = %.1f\n", this.tinhDienTich(), this.tinhChuVi());
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

 
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }    
    
}
