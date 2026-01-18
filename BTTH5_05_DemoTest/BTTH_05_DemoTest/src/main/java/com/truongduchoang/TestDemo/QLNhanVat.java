package com.truongduchoang.TestDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Truong Duc Hoang
 */
public class QLNhanVat {
    private List<NhanVat> ds;
    
    public QLNhanVat(){
        this.ds = new ArrayList<>();
    }
    
    public void themNhanVat(NhanVat... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(nv -> nv.hienThi());
    }

    public int tinhTongLuotChoi(int id){
        NhanVat n = this.ds.stream().filter(nv -> nv.getId() == id).findFirst().get();
        if(n != null){
            return n.demVatPhamLuotChoi();
        }
        return 0;
    }
    
    public void sapXep(){
        this.ds.sort((n1, n2) -> -(n1.getDsVatPham().size() - n2.getDsVatPham().size()));
    }
    public List<NhanVat> getDs() {
        return ds;
    }

    public void setDs(List<NhanVat> ds) {
        this.ds = ds;
    }
    
    
}
