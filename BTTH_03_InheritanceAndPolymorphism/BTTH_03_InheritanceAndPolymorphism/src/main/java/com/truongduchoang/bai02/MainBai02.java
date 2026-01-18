package com.truongduchoang.bai02;

/**
 *
 * @author Truong Duc Hoang
 */
public class MainBai02 {
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(3, 4);
        HinhChuNhat h2 = new HinhVuong(2);
        TamGiac t1 = new TamGiacCan(5, 6);
        TamGiac t2 = new TamGiac(4, 5, 6);
        TamGiac t3 = new TamGiacDeu(7);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
    
}
