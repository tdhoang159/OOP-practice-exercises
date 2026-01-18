package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class TamGiacCan extends TamGiac{
    private double canhAB;
    private double canhC;
    
    public TamGiacCan(double ab, double c){
        super(ab, ab, c);
    }

    @Override
    public String toString() {
        return String.format("Hinh tam giac can: Dien tich = %.1f - Chu vi = %.1f\n", super.tinhDienTich(), super.tinhChuVi());
    }

    public double getCanhAB() {
        return canhAB;
    }

    public void setCanhAB(double canhAB) {
        this.canhAB = canhAB;
    }

    @Override
    public double getCanhC() {
        return canhC;
    }

    @Override
    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }
    
    
    
}
