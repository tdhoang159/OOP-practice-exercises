package com.truongduchoang.TestDemo;

/**
 *
 * @author Truong Duc Hoang
 */
public class VatPhamTangMau extends VatPham{
    private static int dem = 0;
    private int soMauTang;
    
    public VatPhamTangMau(int soMauTang){
        String id = String.format("B%02d", ++dem);
        this.setId(id);
        this.soMauTang = soMauTang;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Mau tang = %d\n", this.soMauTang);
    }

    public int getSoMauTang() {
        return soMauTang;
    }

    public void setSoMauTang(int soMauTang) {
        this.soMauTang = soMauTang;
    }
      
}
