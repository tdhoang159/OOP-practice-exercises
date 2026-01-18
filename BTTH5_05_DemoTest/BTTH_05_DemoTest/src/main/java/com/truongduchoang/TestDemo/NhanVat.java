package com.truongduchoang.TestDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Truong Duc Hoang
 */
public class NhanVat {
    private static int dem = 0;
    private int id = ++dem;
    private String name;
    private List<VatPham> dsVatPham;
    
    public NhanVat(String name){
        this.name = name;
        this.dsVatPham = new ArrayList<>();
    }
    
    public void hienThi(){
        System.out.printf("%d - %s\n",this.id, this.name);
        if(this.dsVatPham != null){
            this.dsVatPham.forEach(vp -> vp.hienThi());
        }
    }
    
    public void themVatPham(VatPham... vp){
        this.dsVatPham.addAll(Arrays.asList(vp));
    }

    public int demVatPhamLuotChoi(){
        int tong = 0;
        for(VatPham vp : this.dsVatPham){
            if(vp instanceof VatPhamTangLuotChoi vatPhamTangLuotChoi){
                tong += vatPhamTangLuotChoi.getLuotChoi();
            }
        }
        return tong;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VatPham> getDsVatPham() {
        return dsVatPham;
    }

    public void setDsVatPham(List<VatPham> dsVatPham) {
        this.dsVatPham = dsVatPham;
    }
    
}
