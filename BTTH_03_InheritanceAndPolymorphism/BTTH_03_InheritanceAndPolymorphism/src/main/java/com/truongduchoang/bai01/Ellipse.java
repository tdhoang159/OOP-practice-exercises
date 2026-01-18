package com.truongduchoang.bai01;

/**
 *
 * @author Truong Duc Hoang
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;
    
    public Ellipse(double _bkTrucLon, double _bkTrucNho){
        this.bkTrucLon = _bkTrucNho;
        this.bkTrucNho = _bkTrucNho;
    }
    
    public double tinhDienTich(){
        return 1.0*Math.PI*this.bkTrucLon*this.bkTrucNho;
    }
    
    public double tinhChuVi(){
        return 2*Math.PI*Math.sqrt(Math.pow(bkTrucLon, 2) + Math.pow(bkTrucNho, 2)/2);
    }

    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.1f\nChu vi: %.1f\n", this.tinhDienTich(), this.tinhChuVi());
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }   
}
