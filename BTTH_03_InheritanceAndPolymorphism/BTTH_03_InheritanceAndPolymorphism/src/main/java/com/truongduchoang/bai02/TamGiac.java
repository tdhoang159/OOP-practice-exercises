package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class TamGiac {
    private double canhA;
    private double canhB;
    private double canhC;
    
    public TamGiac(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a){
            this.canhA = a;
            this.canhB = b;
            this.canhC = c;
        }else{
            System.out.println("Khong the tao thanh 1 tam giac!");
        }
    }
    
    public double tinhChuVi(){
        return this.canhA + this.canhB + this.canhC;
    }
    
    public double tinhDienTich(){
        double p = 1.0*this.tinhChuVi()/2;
        return Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
    }

    @Override
    public String toString() {
        return String.format("Hinh tam giac: Dien tich = %.1f - Chu vi = %.1f\n", this.tinhDienTich(), this.tinhChuVi());
    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }
    
    
}
