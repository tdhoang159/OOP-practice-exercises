package com.truongduchoang.bai01;

/**
 *
 * @author Truong Duc Hoang
 */
public class Ellipse extends Hinh {
    private double trucLon;
    private double trucNho;
    
    public Ellipse(String name, double trucLon, double trucNho){
        super(name);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }
        
    @Override
    public double tinhDienTich() {
        return Math.PI * this.trucLon * this.trucNho;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.trucLon, 2) + Math.pow(this.trucNho, 2))/2);
    }
    
    public double getTrucLon() {
        return trucLon;
    }

    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }

    public double getTrucNho() {
        return trucNho;
    }

    public void setTrucNho(double trucNho) {
        this.trucNho = trucNho;
    }

}
