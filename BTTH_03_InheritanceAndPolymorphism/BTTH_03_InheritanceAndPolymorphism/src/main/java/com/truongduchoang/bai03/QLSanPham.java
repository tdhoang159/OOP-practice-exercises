package com.truongduchoang.bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Truong Duc Hoang
 */
public class QLSanPham {
    private List<SanPham> ds;
    
    public QLSanPham(){
        this.ds = new ArrayList<>();
    }
    
    public void themSanPham(SanPham p){
        this.ds.add(p);
    }
    
    public void themSanPham(SanPham... p){
        this.ds.addAll(Arrays.asList(p));
    }
    
    public void xoaSanPham(SanPham p){
        this.ds.remove(p);
    }
    
    public void xoaSanPham(int maSP){
        this.ds.removeIf(p -> p.getMaSP()==maSP);
    }
    
    public List<SanPham> timKiemSanPham(LocalDate ld){
        return this.ds.stream().filter(sp -> sp.getNgayPhatHanh().equals(ld)).collect(Collectors.toList());
    }
    
    public List<SanPham> timKiemSanPham(String kw) {
        try{
            Class c = Class.forName(kw);
            return this.ds.stream().filter(p -> c.isInstance(p)).collect(Collectors.toList());
        }catch(ClassNotFoundException ex){
            return this.ds.stream().filter(p -> p.getTenSP().contains(kw)).collect(Collectors.toList());
        }
    }
    
    public List<SanPham> timKiemSanPham(double priceStart, double priceEnd){
        return this.ds.stream().filter(p -> p.getGiaBan() >= priceStart && p.getGiaBan() <= priceEnd).collect(Collectors.toList());
    }
    
    public void capNhatThongTinSanPham(int id, String newNSX, String newTen, Double newGia, String newNgayPhatHanh, Integer newSoTrang, Double newDoDaiThoiLuong){
        SanPham p = this.ds.stream().filter(sp -> sp.getMaSP() == id).findFirst().get();
        if(p != null){
            if(newTen != null && !newTen.isEmpty()){
                p.setTenSP(newTen);
            }
            
            if(newGia != null && newGia >= 0){
                p.setGiaBan(newGia);
            }
            
            if(newNSX != null && !newNSX.isEmpty()){
                p.setNhaSanXuat(newNSX);
            }
            
            if(newNgayPhatHanh != null && !newNgayPhatHanh.isEmpty()){
                p.setNgayPhatHanh(LocalDate.parse(newNgayPhatHanh, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
            
            if(p instanceof Sach && newSoTrang != null && newSoTrang >= 0){
                Sach s = (Sach)p;
                s.setSoTrang(newSoTrang);
            }
            
            if(p instanceof BangDia && newDoDaiThoiLuong != null && newDoDaiThoiLuong >= 0){
                BangDia bd = (BangDia)p;
                bd.setDoDaiThoiGianPhat(newDoDaiThoiLuong);
                
            }
        }
    }

    public void sapXepGiamDanTheoGia(){
        this.ds.sort( Comparator.comparing(SanPham::getGiaBan, Collections.reverseOrder()));
    }
    
    public void hienThi() {
        this.ds.forEach(p -> System.out.println(p));
    }
}
