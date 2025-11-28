/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

/**
 *
 * @author admin
 */
public abstract class Hinh {
    private String name;
    
    public Hinh(String name){
        this.name = name;
    }
    
    public abstract double tinhDienTich();
    
    public abstract double tinhChuVi();

    @Override
    public String toString() {
        return String.format("%s - Dien tich = %.1f - Chu vi = %.1f \n", this.name, this.tinhDienTich(), this.tinhChuVi()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Hinh h = (Hinh)obj;
        return this.getName().equals(h.getName());
    }

    @Override
    public int hashCode() {
        return super.hashCode(); 
    }
    
    
}
