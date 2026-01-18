package com.truongduchoang.bai05;

/**
 *
 * @author Truong Duc Hoang
 */
public abstract class NhanVien {
    private static int dem = 0;
    private int id = ++dem;
    private long CMND;
    private String name;
    private String queQuan;
    private String gioiTinh;
    protected int luongCoBan = 100000;
    
    
    public NhanVien(long CMND, String name, String queQuan, String gioiTinh){
        this.CMND = CMND;
        this.name = name;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
    }
    
    public void hienThi(){
        System.out.printf("%d - %d - %s - %s - %s\n",this.id, this.CMND, this.name, this.queQuan, this.gioiTinh);
    }
    
    public abstract double tinhLuong(int soNgayCong);

    public int getId() {
        return id;
    }

    public long getCMND() {
        return CMND;
    }

    public void setCMND(long CMND) {
        this.CMND = CMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
