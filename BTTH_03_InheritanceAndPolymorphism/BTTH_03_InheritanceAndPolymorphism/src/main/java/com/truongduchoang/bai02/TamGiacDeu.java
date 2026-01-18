package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class TamGiacDeu extends TamGiacCan {
    private double canh;
    
    public TamGiacDeu(double canh){
        super(canh, canh);
    }

    @Override
    public String toString() {
        return String.format("Honh tam giac deu: Dien tich = %.1f - Chu vi = %.1f\n", super.tinhDienTich(), super.tinhChuVi());
    }

    /**
     * @return the canh
     */
    public double getCanh() {
        return canh;
    }

    /**
     * @param canh the canh to set
     */
    public void setCanh(double canh) {
        this.canh = canh;
    }
    
    
}
