/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai06;

import com.truongduchoang.bai05.PhanSo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsPhanSo {

    private List<PhanSo> ds;

    public DsPhanSo() {
        this.ds = new ArrayList<>();
    }

    public void themPhanSo(PhanSo p) {
        this.ds.add(p);
    }

    public void themPhanSo(int tu, int mau) throws Exception {
        PhanSo p = new PhanSo(tu, mau);
        this.ds.add(p);
    }

    public void themPhanSo(PhanSo... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(p -> p.hienThi());
    }

    public boolean xoaPhanSo(PhanSo p) {
        return this.ds.remove(p);
    }

    public boolean xoaPhanSo(int tu, int mau) {
        return this.ds.removeIf(ps -> ps.getTuSo() == tu && ps.getMauSo() == mau);
    }

    public PhanSo tongCacPhanSo() throws Exception {
        PhanSo tong = new PhanSo();
        for (PhanSo ps : this.ds) {
            tong = tong.cong(ps);
        }
        return tong.rutGon();
    }

    public PhanSo timMax() {
        if (ds.isEmpty()) {
            return null;
        }

        PhanSo max = ds.get(0);
        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).soSanh1(max) > 0) {
                max = ds.get(i);
            }
        }
        return max;
    }

    public PhanSo timMin() {
        if (ds.isEmpty()) {
            return null;
        }

        PhanSo min = ds.get(0);
        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).soSanh1(min) < 0) { // nhỏ hơn
                min = ds.get(i);
            }
        }
        return min;
    }

    public void sapXepTangDan() {
        ds.sort((p1, p2) -> p1.soSanh1(p2));
    }

    public void sapXepGiamDan() {
        ds.sort((p1, p2) -> -p1.soSanh1(p2));
    }

}
