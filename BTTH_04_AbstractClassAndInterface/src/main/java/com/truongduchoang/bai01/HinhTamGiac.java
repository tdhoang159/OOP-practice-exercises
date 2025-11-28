/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

/**
 *
 * @author admin
 */
public class HinhTamGiac extends Hinh {
    private double canhA;
    private double canhB;
    private double canhC;
    
        @Override
    public double tinhDienTich() {
        double p = this.tinhChuVi()*1.0/2;
        return Math.sqrt(p*(p - this.canhA)*(p - this.canhB)*(p - this.canhC));
    }

    @Override
    public double tinhChuVi() {
        return this.canhA + this.canhB + this.canhC;
    }
    
    public HinhTamGiac(String name, double a, double b, double c){
        super(name);
        this.canhA = a;
        this.canhB = b;
        this.canhC = c;
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
