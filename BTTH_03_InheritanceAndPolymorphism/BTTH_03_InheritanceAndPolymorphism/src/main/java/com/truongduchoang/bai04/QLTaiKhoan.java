/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLTaiKhoan {
    private List<TaiKhoan> ds;
    
    public QLTaiKhoan(){
        this.ds = new ArrayList<>();
    }
    
    public void themTaiKhoan(TaiKhoan... a){
        this.getDs().addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.getDs().forEach(tk -> tk.hienThi());
    }

    public List<TaiKhoan> getDs() {
        return ds;
    }

    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
       
}
