/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class QLHinh {

    private List<Hinh> ds;

    public QLHinh() {
        this.ds = new ArrayList<>();
    }

    public void themHinh(Hinh... h) {
        this.ds.addAll(Arrays.asList(h));
    }

    public void deleteHinhByName(String name) {
        this.ds.removeIf(h -> h.getName().contains(name));
    }

    public List<Hinh> timHinh(String tenLop) throws ClassNotFoundException {
        Class c = Class.forName(tenLop);
        //return this.ds.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList());
        return this.ds.stream().filter(h -> h.getClass().getName().equals(tenLop)).collect(Collectors.toList());
    }

    public void sapXepGiamDanByDienTich() {
        this.ds.sort((h1, h2) -> Double.compare(h1.tinhDienTich(), h2.tinhDienTich()));
    }

    public void sapXepTangTheoTenBangThiGiamTheoDienTich() {
//        this.ds.sort((h1, h2) -> {
//            if(h1.getName().compareTo(h2.getName()) == 0){
//                return -Double.compare(h1.tinhDienTich(), h2.tinhDienTich());
//            }
//            return h1.getName().compareTo(h2.getName());
//        });

        this.ds.sort(Comparator.comparing(Hinh::getName).thenComparing(Comparator.comparing(Hinh::tinhDienTich, Collections.reverseOrder())));
    }

    public double tinhDienTichTrungBinh() {
        return this.ds.stream().flatMapToDouble(h -> DoubleStream.of(h.tinhDienTich())).average().getAsDouble();
    }

    public void hienThi() {
        this.ds.forEach(h -> System.out.print(h));
    }

    public int timHinh(Hinh h) {
        return this.ds.indexOf(h);
    }

    public List<Hinh> getDs() {
        return ds;
    }

    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }

}
