/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

/**
 *
 * @author admin
 */
public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    public Diem(double hoanhDo, double tungDo){
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    
    public void hienThi(){
        System.out.printf("(%.1f, %.1f)\n", this.hoanhDo, this.tungDo);
    }
    
    public double tinhKhoangCach(Diem d){
        double result = Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) + Math.pow(this.tungDo - d.tungDo, 2));
        return result;
    }
    
    public double getHoanhDo() {
        return this.hoanhDo;
    }
    
    public void setHoanhDo(double hoanhDo){
        this.hoanhDo = hoanhDo;
    }
    
    public double getTungDo() {
        return this.tungDo;
    }
    
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    } 
}
