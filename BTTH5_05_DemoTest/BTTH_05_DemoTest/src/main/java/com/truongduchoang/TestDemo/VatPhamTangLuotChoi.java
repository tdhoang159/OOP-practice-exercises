package com.truongduchoang.TestDemo;

/**
 *
 * @author Truong Duc Hoang
 */
public class VatPhamTangLuotChoi extends VatPham{
    private static int dem = 0;
    private int soLuotTang;
    
    public VatPhamTangLuotChoi(int soLuotTang){
        String id = String.format("A%02d", ++dem);
        this.setId(id);
        this.soLuotTang = soLuotTang;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Luot choi tang = %d\n", this.soLuotTang);
    }

    public int getLuotChoi() {
        return soLuotTang;
    }

    public void setLuotChoi(int luotChoi) {
        this.soLuotTang = luotChoi;
    }
    
    
}
