/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai05;

/**
 *
 * @author admin
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;
    private static int soPhanSo = 0;

    public PhanSo(int tuSo, int mauSo) throws Exception {
        if (mauSo == 0) {
            throw new Exception("Mau so khong duoc bang 0!");
        }
        if (mauSo < 0) {
            this.mauSo = -mauSo;
            this.tuSo = -tuSo;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
        ++soPhanSo;
    }

    public PhanSo() throws Exception {
        this(0, 1);
    }

    public void hienThi() {
        System.out.printf("%d/%d\n", this.tuSo, this.mauSo);
    }

    public PhanSo cong(PhanSo p) throws Exception {
        int tuMoi = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int mauMoi = this.mauSo * p.mauSo;
        PhanSo p1 = new PhanSo(tuMoi, mauMoi);
        return p1.rutGon();
    }

    public PhanSo tru(PhanSo p) throws Exception {
        int tuMoi = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        int mauMoi = this.mauSo * p.mauSo;
        PhanSo p1 = new PhanSo(tuMoi, mauMoi);
        return p1.rutGon();
    }

    public PhanSo nhan(PhanSo p) throws Exception {
        int tuMoi = this.tuSo * p.tuSo;
        int mauMoi = this.mauSo * p.mauSo;
        PhanSo p1 = new PhanSo(tuMoi, mauMoi);
        return p1.rutGon();
    }

    public PhanSo chia(PhanSo p) throws Exception {
        int tuMoi = this.tuSo * p.mauSo;
        int mauMoi = this.mauSo * p.tuSo;
        PhanSo p1 = new PhanSo(tuMoi, mauMoi);
        return p1.rutGon();
    }

    public static int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }

    public PhanSo rutGon() throws Exception {
        int UCLN = timUCLN(this.tuSo, this.mauSo);
        int tuMoi = this.tuSo / UCLN;
        int mauMoi = this.mauSo / UCLN;
        PhanSo p = new PhanSo(tuMoi, mauMoi);
        return p;
    }

    public int soSanh(PhanSo p) {
        double v1 = this.tuSo * 1.0 / this.mauSo;
        double v2 = p.tuSo * 1.0 / p.mauSo;
        return Double.compare(v1, v2);
    }

    public int soSanh1(PhanSo ps2) {
        long veTrai = (long) this.tuSo * ps2.mauSo;
        long vePhai = (long) ps2.tuSo * this.mauSo;

        if (veTrai == vePhai) {
            return 0; // bằng nhau
        } else if (veTrai < vePhai) {
            return -1; // p1 nhỏ hơn p2
        } else {
            return 1; // p1 lớn hơn p2
        }
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) throws Exception {
        if (mauSo == 0) {
            throw new Exception("Mau so khong duoc bang 0!");
        }
        this.mauSo = mauSo;
    }
}
