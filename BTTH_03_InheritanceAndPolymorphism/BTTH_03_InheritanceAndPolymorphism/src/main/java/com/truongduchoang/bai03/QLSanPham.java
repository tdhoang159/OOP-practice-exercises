package com.truongduchoang.bai03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Truong Duc Hoang
 */
public class QLSanPham {
    private List<SanPham> ds;
    
    public QLSanPham(){
        this.ds = new ArrayList<>();
    }
    
    public void themSanPham(SanPham p){
        this.ds.add(p);
    }
    
    public void themSanPham(SanPham... p){
        this.ds.addAll(Arrays.asList(p));
    }
    
    public void xoaSanPham(SanPham p){
        this.ds.remove(p);
    }
    
    public void xoaSanPham(int maSP){
        this.ds.removeIf(p -> p.getMaSP()==maSP);
    }
    
    public void hienThi() {
        this.ds.forEach(p -> System.out.println(p));
    }
}
