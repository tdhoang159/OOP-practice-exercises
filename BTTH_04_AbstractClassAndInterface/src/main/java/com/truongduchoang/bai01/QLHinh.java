/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLHinh {
    private List<Hinh> ds;
    
    public QLHinh(){
        this.ds = new ArrayList<>();
    }
    
    public void themHinh(Hinh... h){
        this.ds.addAll(Arrays.asList(h));
    }
    
    public void deleteHinhByName(String name){
        this.ds.removeIf(h -> h.getName().contains(name));
    }
    
    public List<Hinh> timHinh(String tenLop) throws ClassNotFoundException{
        Class c = Class.forName(tenLop);
        return this.ds.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList());
    }
    public void hienThi(){
        this.ds.forEach(h -> System.out.print(h));
    }

    public List<Hinh> getDs() {
        return ds;
    }

    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }
    
    
}
