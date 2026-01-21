/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

/**
 *
 * @author Truong Duc Hoang
 */
public class Vaccine {
    private static int dem = 0;
    private int ma = ++dem;
    private String name;
    private String xuatXu;
    private int quantity;

    public Vaccine(String name, String xuatXu, int quantity) {
        this.name = name;
        this.xuatXu = xuatXu;
        this.quantity = quantity;
    }
    
    public void hienThi(){
        System.out.printf("%d - Ten vaccine: %s - Xuat xu: %s - So luong: %d\n", 
                this.ma, this.name, this.xuatXu, this.quantity);
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
