package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Truong Duc Hoang
 */
public class BTTH01_Bai4 {
    
    public static int[] nhapMang(int n){
        int[] a = new int[n];
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 0; i < n; i++){
                System.out.printf("Nhap a[%d]: ", i);
                a[i] = sc.nextInt();
            }
        }
        return a;
    }
    
    public static void xuatMang(int[] a){
        for(int value : a){
            System.out.printf("%d ",value);
        }
        System.out.println();
    }
    
    public static boolean isNguyenTo(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static long tongCacSoNguyenTo(int[] a){
        long tong = 0;
        for(int value : a){
            if(isNguyenTo(value) == true){
                tong += value;
            }
        }
        return tong;
    }
    
    public static void timSo(int[] a){
        Integer maxDuong = null;
        Integer minAm = null;
        for(int value : a){
            if(value > 0){
                if(maxDuong == null || value > maxDuong){
                    maxDuong = value;
                }
            }else if(value < 0){
                if( minAm == null || value < minAm){
                    minAm = value;
                }
            }
        }
        
        System.out.print("So duong lon nhat: ");
        System.out.println(maxDuong != null ? maxDuong : "*");
        
        System.out.print("So am be nhat: ");
        System.out.println(minAm != null ? minAm : "*");
    }
    
    public static long timSoNguyenToNhoNhat(int[] a){
        long soNguyenToNhoNhat = a[0];
        for(int value : a){
            if(isNguyenTo(value) == true){
                if(value < soNguyenToNhoNhat){
                    soNguyenToNhoNhat = value;
                }
            }
        }
        return soNguyenToNhoNhat;
    }
    
    public static void StreamProgramming(int[] a){
        //Tính tổng mảng
        System.out.println(IntStream.of(a).sum());
        
        //Tìm giá trị lớn nhất trong mảng
        System.out.println(IntStream.of(a).max().getAsInt());
        
        //Tìm giá trị nhỏ nhất trong mảng
        System.out.println(IntStream.of(a).min().getAsInt());
    }
    public static void main(String[] args) {
//        int[] a = nhapMang(5);
//        xuatMang(a);
        //int[] a = new int{1, 2, 3, 4, 5};
        //System.out.printf("Tong cac so nguyen to trong mang la: %d\n", tongCacSoNguyenTo(a));
        //timSo(a);
        //System.out.printf("So nguyen to nho nhat trong mang la: %d\n", timSoNguyenToNhoNhat(a));
        
        //StreamProgramming(a);
    }
}
