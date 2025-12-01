package com.truongduchoang.bai01;

/**
 *
 * @author Truong Duc Hoang
 */
public class HinhTron extends Ellipse {
    private double banKinh;
    
    public HinhTron(String name, double banKinh){
        super(name, banKinh, banKinh);
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    
}
