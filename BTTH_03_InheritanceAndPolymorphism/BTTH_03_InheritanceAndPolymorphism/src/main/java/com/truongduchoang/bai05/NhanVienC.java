package com.truongduchoang.bai05;

/**
 *
 * @author Truong Duc Hoang
 */
public class NhanVienC extends NhanVien{
    private double heSo = 2.5;
    public NhanVienC(long CMND, String name, String queQuan, String gioiTinh){
        super(CMND, name, queQuan, gioiTinh);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return this.heSo * this.luongCoBan *soNgayCong;
    }
    
    @Override
    public void hienThi(){
        System.out.printf("Nhan vien bo phan C: ");
        super.hienThi();
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }
}
