/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai06;

import com.truongduchoang.bai05.PhanSo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsPhanSo {

    private List<PhanSo> ds;

    public DsPhanSo() {
        this.ds = new ArrayList<>();
    }

    public void themPhanSo(PhanSo p) {
        this.ds.add(p);
    }
    
    public void themPhanSo(int tu, int mau) throws Exception{
        PhanSo p = new PhanSo(tu, mau);
        this.ds.add(p);
    }
    
    public void themPhanSo(PhanSo... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi() {
        this.ds.forEach(p -> p.hienThi());
    }
    
    public boolean xoaPhanSo(PhanSo p){
        return this.ds.remove(p);
    }
    
    public boolean xoaPhanSo(int tu, int mau) throws Exception{
        PhanSo p = new PhanSo(tu, mau);
        return this.ds.remove(p);
    }
}
